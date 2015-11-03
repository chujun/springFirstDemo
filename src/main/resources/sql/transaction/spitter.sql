/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.20 : Database - spitter
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`spitter` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `spitter_user` */

DROP TABLE IF EXISTS `spitter_user`;

CREATE TABLE `spitter_user` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL DEFAULT '""' COMMENT '用户名',
  `password` varchar(20) NOT NULL DEFAULT '12345678' COMMENT '密码',
  `full_name` varchar(50) NOT NULL DEFAULT '""' COMMENT '全名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

/*Data for the table `spitter_user` */

insert  into `spitter_user`(`id`,`user_name`,`password`,`full_name`) values (33,'chujun','1234567','chujunTue Nov 03 17:28:41 CST 2015'),(34,'chujun','1234567','jackjunFri Oct 30 16:06:52 CST 2015'),(35,'chujun','1234567','jackjunFri Oct 30 16:07:16 CST 2015'),(36,'chujun','1234567','jackjunFri Oct 30 16:08:58 CST 2015'),(37,'chujun','1234567','jackjunFri Oct 30 16:16:49 CST 2015'),(38,'chujun','1234567','jackjunFri Oct 30 16:33:53 CST 2015'),(39,'chujun','1234567','jackjunFri Oct 30 17:00:42 CST 2015');

/*Table structure for table `user_log` */

DROP TABLE IF EXISTS `user_log`;

CREATE TABLE `user_log` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL COMMENT '用户ID',
  `create_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `operation` varchar(10) DEFAULT 'add' COMMENT 'add,update,delete',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `user_log` */

insert  into `user_log`(`id`,`user_id`,`create_time`,`operation`) values (1,33,'2015-10-30 00:00:00','update'),(2,33,'2015-10-30 17:04:45','update'),(3,33,'2015-10-30 17:19:26','update'),(4,33,'2015-11-02 19:11:12','update'),(5,33,'2015-11-03 13:30:27','update'),(6,33,'2015-11-03 14:37:20','update'),(7,33,'2015-11-03 15:09:40','update'),(8,33,'2015-11-03 15:11:26','update'),(9,33,'2015-11-03 15:41:19','update'),(10,33,'2015-11-03 15:52:24','update'),(11,33,'2015-11-03 17:28:41','update');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
