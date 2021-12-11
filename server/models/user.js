'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class User extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      // UserBiodata
      this.hasOne(models.UserBiodata, {
        foreignKey: 'userId',
        uniqueKey: 'userId'
      })
      // UserStats
      this.hasOne(models.UserStats, {
        foreignKey: 'userId',
        uniqueKey: 'userId'
      })
    }
  };
  User.init({
    username: DataTypes.STRING,
    encryptedPassword: DataTypes.STRING
  }, {
    sequelize,
    modelName: 'User',
  });
  return User;
};