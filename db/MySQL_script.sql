-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.28 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
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

-- Dumping data for table busticket.bus: ~2 rows (approximately)
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
REPLACE INTO `bus` (`bus_id`, `busnumber`, `capacity`) VALUES
	(1, '123', 34),
	(51, 'WB 01 1 1111', 36);
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='contains fare to go a stop';

-- Dumping data for table busticket.fare: ~23 rows (approximately)
/*!40000 ALTER TABLE `fare` DISABLE KEYS */;
REPLACE INTO `fare` (`fare_id`, `fromstopid`, `tostopid`, `amount`) VALUES
	(1, 1, 2, 5),
	(2, 1, 3, 5),
	(3, 1, 4, 5),
	(4, 1, 5, 5),
	(5, 2, 3, 5),
	(6, 2, 4, 5),
	(7, 2, 5, 5),
	(8, 2, 6, 5),
	(9, 3, 4, 5),
	(10, 3, 5, 5),
	(11, 3, 6, 5),
	(12, 3, 7, 5),
	(13, 4, 5, 5),
	(14, 4, 6, 5),
	(15, 4, 7, 5),
	(16, 4, 8, 5),
	(17, 5, 6, 5),
	(18, 5, 7, 5),
	(19, 5, 8, 5),
	(20, 5, 9, 5),
	(21, 6, 7, 5),
	(22, 6, 8, 5),
	(23, 6, 9, 5);
/*!40000 ALTER TABLE `fare` ENABLE KEYS */;


-- Dumping structure for table busticket.midway
DROP TABLE IF EXISTS `midway`;
CREATE TABLE IF NOT EXISTS `midway` (
  `midway_id` int(11) NOT NULL AUTO_INCREMENT,
  `route_id` int(11) DEFAULT NULL,
  `timetable_id` int(11) DEFAULT NULL,
  `stop_id` int(11) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`midway_id`),
  KEY `route_id` (`route_id`),
  KEY `stop_id` (`stop_id`),
  KEY `timetable_id` (`timetable_id`),
  CONSTRAINT `midway_ibfk_1` FOREIGN KEY (`route_id`) REFERENCES `route` (`route_id`),
  CONSTRAINT `midway_ibfk_2` FOREIGN KEY (`stop_id`) REFERENCES `stop` (`stop_id`),
  CONSTRAINT `midway_ibfk_3` FOREIGN KEY (`timetable_id`) REFERENCES `timetable` (`timetable_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table busticket.midway: ~1 rows (approximately)
/*!40000 ALTER TABLE `midway` DISABLE KEYS */;
REPLACE INTO `midway` (`midway_id`, `route_id`, `timetable_id`, `stop_id`, `time`) VALUES
	(1, 2, 1, 4, '2017-01-04 00:00:00');
/*!40000 ALTER TABLE `midway` ENABLE KEYS */;


-- Dumping structure for table busticket.reservation
DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `midway_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `seat_id` int(11) DEFAULT NULL,
  `fare` int(11) DEFAULT NULL,
  `tstamp` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`reservation_id`),
  KEY `user_id` (`user_id`),
  KEY `midway_id` (`midway_id`),
  KEY `fare` (`fare`),
  CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`midway_id`) REFERENCES `midway` (`midway_id`),
  CONSTRAINT `reservation_ibfk_3` FOREIGN KEY (`fare`) REFERENCES `fare` (`fare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='contains information about reservation';

-- Dumping data for table busticket.reservation: ~0 rows (approximately)
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;


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

-- Dumping data for table busticket.route: ~3 rows (approximately)
/*!40000 ALTER TABLE `route` DISABLE KEYS */;
REPLACE INTO `route` (`route_id`, `origin`, `destination`) VALUES
	(1, 1, 34),
	(2, 1, 34),
	(3, 34, 66);
/*!40000 ALTER TABLE `route` ENABLE KEYS */;


-- Dumping structure for table busticket.stop
DROP TABLE IF EXISTS `stop`;
CREATE TABLE IF NOT EXISTS `stop` (
  `stop_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT '0',
  PRIMARY KEY (`stop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8 COMMENT='contains all bus stop names and their ids';

-- Dumping data for table busticket.stop: ~66 rows (approximately)
/*!40000 ALTER TABLE `stop` DISABLE KEYS */;
REPLACE INTO `stop` (`stop_id`, `name`) VALUES
	(1, 'Howrah jn'),
	(2, 'Liluah'),
	(3, 'Belur'),
	(4, 'Bally'),
	(5, 'Uttarpara'),
	(6, 'Hind motor'),
	(7, 'Konnagar'),
	(8, 'Rishra'),
	(9, 'Serampore'),
	(10, 'Seoraphuli'),
	(11, 'Baidyabati'),
	(12, 'Bhadreshwar'),
	(13, 'Mankundu'),
	(14, 'Chandan nagar'),
	(15, 'Chuchura'),
	(16, 'Hooghly'),
	(17, 'Bandel jn'),
	(18, 'Adi saptagram'),
	(19, 'Magra'),
	(20, 'Talandu'),
	(21, 'Khanyan'),
	(22, 'Pundooah'),
	(23, 'Simlagarh'),
	(24, 'Bainchigram'),
	(25, 'Bainchi'),
	(26, 'Debipur'),
	(27, 'Bagila'),
	(28, 'Memari'),
	(29, 'Nimo'),
	(30, 'Rasulpur'),
	(31, 'Palsit'),
	(32, 'Saktigarh'),
	(33, 'Gangpur'),
	(34, 'Burdwan'),
	(35, 'Palla Road'),
	(36, 'Chanchai'),
	(37, 'Masagram'),
	(38, 'Nabagram'),
	(39, 'Jaugram'),
	(40, 'Jhapandanga'),
	(41, 'Gurap'),
	(42, 'Hajigarh'),
	(43, 'Shibai Chandi'),
	(44, 'Dhaniakhali'),
	(45, 'Belmuri'),
	(46, 'Porabazar'),
	(47, 'Chandanpur'),
	(48, 'Madhusudanpur'),
	(49, 'Kamarkundu'),
	(50, 'Balarambati'),
	(51, '	Mirzapur-Bankipur'),
	(52, 'Baruipara'),
	(53, 'Begampur'),
	(54, 'Janai Road'),
	(55, 'Gobra'),
	(56, 'Dankuni'),
	(57, 'Belanagar'),
	(58, 'Talit'),
	(59, 'Khana Jn'),
	(60, 'Isanchandi Halt'),
	(61, 'Galsi'),
	(62, 'Paraj'),
	(63, 'Mankar'),
	(64, 'Panagarh'),
	(65, 'Rajbandh'),
	(66, 'Durgapur');
/*!40000 ALTER TABLE `stop` ENABLE KEYS */;


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

-- Dumping data for table busticket.timetable: ~1 rows (approximately)
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
REPLACE INTO `timetable` (`timetable_id`, `route_id`, `departure_time`, `arrival_time`, `available`, `bus_id`) VALUES
	(1, 1, '2012-11-16 04:00:02', '2012-11-16 00:00:00', 23, 1);
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;


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

-- Dumping data for table busticket.user: ~0 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
