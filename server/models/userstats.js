'use strict';
const { throws } = require('assert');
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class UserStats extends Model {
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
      // relation with Level
      this.hasOne(models.Levels, {
        foreignKey: 'levelId',
        uniqueKey: 'levelId'
      })
    }
  };
  UserStats.init({
    userId: DataTypes.INTEGER,
    levelId: DataTypes.INTEGER,
    point: DataTypes.INTEGER
  }, {
    sequelize,
    modelName: 'UserStats',
  });
  return UserStats;
};