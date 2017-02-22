-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.0-dmr-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for busticket
DROP DATABASE IF EXISTS `busticket`;
CREATE DATABASE IF NOT EXISTS `busticket` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `busticket`;

-- Dumping structure for table busticket.bus
DROP TABLE IF EXISTS `bus`;
CREATE TABLE IF NOT EXISTS `bus` (
  `bus_id` int(11) NOT NULL AUTO_INCREMENT,
  `busnumber` varchar(15) DEFAULT NULL,
  `capacity` int(2) DEFAULT NULL,
  PRIMARY KEY (`bus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COMMENT='Contains information for a single bus';

-- Data exporting was unselected.
-- Dumping structure for table busticket.fare
DROP TABLE IF EXISTS `fare`;
CREATE TABLE IF NOT EXISTS `fare` (
  `fare_id` int(11) NOT NULL AUTO_INCREMENT,
  `fromstopid` int(11) DEFAULT NULL,
  `tostopid` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`fare_id`),
  KEY `fromstopid` (`fromstopid`),
  KEY `tostopid` (`tostopid`),
  CONSTRAINT `fare_ibfk_1` FOREIGN KEY (`fromstopid`) REFERENCES `stop` (`stop_id`),
  CONSTRAINT `fare_ibfk_2` FOREIGN KEY (`tostopid`) REFERENCES `stop` (`stop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='contains fare to go a stop';

-- Data exporting was unselected.
-- Dumping structure for table busticket.midway
DROP TABLE IF EXISTS `midway`;
CREATE TABLE IF NOT EXISTS `midway` (
  `midway_id` int(11) NOT NULL AUTO_INCREMENT,
  `timetable_id` int(11) DEFAULT NULL,
  `stop_id` int(11) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL COMMENT 'timestamp because it possible that a day of week the bus is not stop on a stop',
  PRIMARY KEY (`midway_id`),
  KEY `stop_id` (`stop_id`),
  KEY `timetable_id` (`timetable_id`),
  CONSTRAINT `midway_ibfk_2` FOREIGN KEY (`stop_id`) REFERENCES `stop` (`stop_id`),
  CONSTRAINT `midway_ibfk_3` FOREIGN KEY (`timetable_id`) REFERENCES `timetable` (`timetable_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Data exporting was unselected.
-- Dumping structure for table busticket.reservation
DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `midway_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `seat_id` int(11) DEFAULT NULL,
  `fare_id` int(11) DEFAULT NULL,
  `tstamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `user_id` (`user_id`),
  KEY `midway_id` (`midway_id`),
  KEY `fare` (`fare_id`),
  CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`midway_id`) REFERENCES `midway` (`midway_id`),
  CONSTRAINT `reservation_ibfk_3` FOREIGN KEY (`fare_id`) REFERENCES `fare` (`fare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='contains information about reservation';

-- Data exporting was unselected.
-- Dumping structure for table busticket.route
DROP TABLE IF EXISTS `route`;
CREATE TABLE IF NOT EXISTS `route` (
  `route_id` int(11) NOT NULL AUTO_INCREMENT,
  `origin` int(11) DEFAULT NULL,
  `destination` int(11) DEFAULT NULL,
  PRIMARY KEY (`route_id`),
  KEY `origin` (`origin`),
  KEY `destination` (`destination`),
  CONSTRAINT `route_ibfk_1` FOREIGN KEY (`origin`) REFERENCES `stop` (`stop_id`),
  CONSTRAINT `route_ibfk_2` FOREIGN KEY (`destination`) REFERENCES `stop` (`stop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='contains information about diffenent routes and their intermediate stops\r\n';

-- Data exporting was unselected.
-- Dumping structure for table busticket.stop
DROP TABLE IF EXISTS `stop`;
CREATE TABLE IF NOT EXISTS `stop` (
  `stop_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT '0',
  PRIMARY KEY (`stop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='contains all bus stop names and their ids';

-- Data exporting was unselected.
-- Dumping structure for table busticket.timetable
DROP TABLE IF EXISTS `timetable`;
CREATE TABLE IF NOT EXISTS `timetable` (
  `timetable_id` int(11) NOT NULL AUTO_INCREMENT,
  `route_id` int(11) DEFAULT NULL,
  `departure_time` timestamp NULL DEFAULT NULL,
  `arrival_time` timestamp NULL DEFAULT NULL,
  `available` int(11) DEFAULT NULL,
  `bus_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`timetable_id`),
  KEY `route_id` (`route_id`),
  KEY `bus_id` (`bus_id`),
  CONSTRAINT `timetable_ibfk_1` FOREIGN KEY (`route_id`) REFERENCES `route` (`route_id`),
  CONSTRAINT `timetable_ibfk_2` FOREIGN KEY (`bus_id`) REFERENCES `bus` (`bus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='contains times when a bus will leave from origin to destination and available seat';

-- Data exporting was unselected.
-- Dumping structure for table busticket.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='contains information about a user';

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
