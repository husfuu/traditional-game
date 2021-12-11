const jwt = require('jsonwebtoken')
const bcrypt = require('bcrypt');
const db = require('../models');
const User = db.User;
const UserBiodata = db.UserBiodata;

const { JWT_SIGNATURE_KEY = "RAHASIA"} = process.env;

function isPasswordValid(password, encryptedPass) {
    return bcrypt.compareSync(password, encryptedPass);
}

function createToken(payload) {
    return jwt.sign(payload, JWT_SIGNATURE_KEY, {
        expiresIn: '1h'
    });
};

exports.login = async (req, res) => {
    const user = await User.findOne({
        where: {
            username: req.body.username,
        }
    });
    if (!user) {
        return res.status(401).json({
            status: "FAIL",
            data: {
                name: "UNAUTHORIZED",
                message: "username does not exist"
            },
        });
    }
    if (!isPasswordValid(req.body.password, user.encryptedPassword)) {
        return res.status(401).json({
            status: "FAIL",
            data: {
                name: "UNAUTHORIZED",
                message: "Password is incorrect!"
            },
        });
    }
    return res.status(201).json({
        status: "OK",
        data: {
            token: createToken({id: user.id, username: user.username})
        }
    })
}


exports.register = async (req, res) => {
    const username = req.body.username;
    const email = req.body.email;

    try {
        // convert the plain text password into encrypted password
        const encryptedPassword = bcrypt.hashSync(req.body.password, 10);

        // create and save the email and encrypted password into Users table
        const user = await User.create({    
            username: req.body.username,
            encryptedPassword,
        });

        await UserBiodata.create({
            userId: user.id,
            email: req.body.email,
        })

        return res.status(201).json({
            status: "OK",
            data: {
                id: user.id,
                username: user.username,
                createdAt: user.createdAt,
                updatedAt: user.updatedAt,
            },
            message: "Congratulations, your account has been successfully created, please login"
        });
    } catch (err) {
        return res.status(422).json({
            status: "ERROR",
            data: {
                name: "UNPROCESSABLE_ENTITY",
                message: "cannot register the user"
            },
        });
    }
};
