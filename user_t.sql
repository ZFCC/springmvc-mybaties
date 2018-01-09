# Host: localhost  (Version 5.0.87-community-nt)
# Date: 2018-01-09 18:33:36
# Generator: MySQL-Front 5.3  (Build 5.26)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "user_t"
#

CREATE TABLE `user_t` (
  `id` int(11) NOT NULL auto_increment,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "user_t"
#

INSERT INTO `user_t` VALUES (1,'小明','123321',20),(2,'小明','123',20),(3,'小红','1221',20);
