/*
Navicat MySQL Data Transfer

Source Server         : ee
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : springbootdb

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-12-10 16:13:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `area`
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of area
-- ----------------------------
INSERT INTO `area` VALUES ('2', 'eee');
INSERT INTO `area` VALUES ('3', 'eee1');
INSERT INTO `area` VALUES ('4', 'eee21');
INSERT INTO `area` VALUES ('5', 'jacky');

-- ----------------------------
-- Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) unsigned NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '1', ' 的', ' 的 ');
