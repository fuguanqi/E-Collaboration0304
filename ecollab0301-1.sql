/*
Navicat MySQL Data Transfer

Source Server         : Connect
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : ecollab1226

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-01-01 15:21:15
*/

-- SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for instructor
-- ----------------------------
DROP TABLE IF EXISTS `instructor`;
CREATE TABLE `instructor` (
  `Instructor_id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(16) NOT NULL,
  `Password` varchar(32) NOT NULL,
  `Email_add` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`Instructor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `Project_id` int(12) NOT NULL AUTO_INCREMENT,
  `Instructor_id` int(8) DEFAULT NULL,
  `P_begin_time` datetime DEFAULT NULL,
  `P_end_time` datetime DEFAULT NULL,
  `Grade` float DEFAULT NULL,
  `P_title` varchar(64) NOT NULL,
  `P_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Project_id`),
  KEY `FK_Supervise` (`Instructor_id`),
  CONSTRAINT `FK_Supervise` FOREIGN KEY (`Instructor_id`) REFERENCES `instructor` (`Instructor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Student_id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(16) NOT NULL,
  `Password` varchar(32) NOT NULL,
  `Email_add` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`Student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for participate
-- ----------------------------
DROP TABLE IF EXISTS `participate`;
CREATE TABLE `participate` (
  `Project_id` int(11) NOT NULL,
  `Student_id` int(11) NOT NULL,
  `Participate_Time` datetime NOT NULL,
  `Role` int(1) NOT NULL,
   `Contribution` int(10) DEFAULT NULL,
  PRIMARY KEY (`Project_id`,`Student_id`),
  KEY `FK_Participate2` (`Student_id`),
  CONSTRAINT `FK_Participate` FOREIGN KEY (`Project_id`) REFERENCES `project` (`Project_id`),
  CONSTRAINT `FK_Participate2` FOREIGN KEY (`Student_id`) REFERENCES `student` (`Student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for phase
-- ----------------------------
DROP TABLE IF EXISTS `phase`;
CREATE TABLE `phase` (
  `Phase_id` int(11) NOT NULL AUTO_INCREMENT,
  `Project_id` int(11) NOT NULL,
  `Ph_begin_time` datetime DEFAULT NULL,
  `Ph_end_time` datetime DEFAULT NULL,
  `Ph_title` varchar(64) NOT NULL,
  `Ph_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Phase_id`),
  KEY `FK_Decompose1` (`Project_id`),
  CONSTRAINT `FK_Decompose1` FOREIGN KEY (`Project_id`) REFERENCES `project` (`Project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------

-- Table structure for task
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `Task_id` int(11) NOT NULL AUTO_INCREMENT,
  `Student_id` int(11) NOT NULL,
  `Phase_id` int(11) NOT NULL,
  `Workload` int(11) DEFAULT NULL,
  `T_begin_time` datetime DEFAULT NULL,
  `T_end_time` datetime DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0',
  `T_title` varchar(64) NOT NULL,
  `T_description` varchar(225) DEFAULT NULL,
  `deadline` datetime DEFAULT NULL,
  PRIMARY KEY (`Task_id`),
  KEY `FK_Decompose2` (`Phase_id`),
  KEY `FK_TskStdt` (`Student_id`),
  CONSTRAINT `FK_Decompose2` FOREIGN KEY (`Phase_id`) REFERENCES `phase` (`Phase_id`),
  CONSTRAINT `FK_TskStdt` FOREIGN KEY (`Student_id`) REFERENCES `student` (`Student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
