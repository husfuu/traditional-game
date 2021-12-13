import React, {useState, useContext} from 'react'
import { useNavigate } from 'react-router-dom'
import { Container } from 'react-bootstrap'
import axios from 'axios'
import '../styles/login.css'

import { UserContext } from '../helpers/UserContext'

function Login({setToken}) {
    const [username, setUsername] = useState(null)
    const [password, setPassword] = useState(null) 
    const {user, setUser}  = useContext(UserContext)
    let navigate = useNavigate();

    const login = () => {
        axios.post('http://localhost:8080/api/v1/login', {
            username,
            password
        }).then((response) => {
            setToken(response.data.data.token)
            setUser(username)
            navigate("/opponent")
        })
    }
    return (
        <div className='login-page' >
            <Container className='container-login'>
            <div className='login'>
                <h1>Login</h1>
                <label> Username </label>
                <input type="text" onChange={(e) => {
                    setUsername(e.target.value);
                }}/>
                <label> Password </label>
                <input type="text" onChange={(e) => {
                    setPassword(e.target.value);
                }}/>
                <button onClick={login} > <b> Login </b> </button>
            </div>
            </Container>
        </div>
    )
}

export default Login
