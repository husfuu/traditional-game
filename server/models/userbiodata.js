'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class UserBiodata extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      // relation with User
      this.belongsTo(models.User, {
        foreignKey: 'userId'
      })
    }
  };
  UserBiodata.init({
    userId: DataTypes.INTEGER,
    avatarUrl: DataTypes.STRING,
    bio: DataTypes.STRING,
    email: DataTypes.STRING,
    address: DataTypes.STRING
  }, {
    sequelize,
    modelName: 'UserBiodata',
  });
  return UserBiodata;
};