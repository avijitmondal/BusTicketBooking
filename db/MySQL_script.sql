-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: busticket
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bus`
--

DROP TABLE IF EXISTS `bus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bus` (
  `bus_id` int(11) NOT NULL AUTO_INCREMENT,
  `busnumber` varchar(15) DEFAULT NULL,
  `capacity` int(2) DEFAULT NULL,
  PRIMARY KEY (`bus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COMMENT='Contains information for a single bus';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bus`
--

LOCK TABLES `bus` WRITE;
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
INSERT INTO `bus` VALUES (1,'123',34),(51,'WB 01 1 1111',36),(52,'WB 06 0 0000',54),(53,'WB 06 0 0101',50),(54,'WB 07 0 0101',50);
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fare`
--

DROP TABLE IF EXISTS `fare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fare` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fare`
--

LOCK TABLES `fare` WRITE;
/*!40000 ALTER TABLE `fare` DISABLE KEYS */;
INSERT INTO `fare` VALUES (1,1,2,5),(2,1,3,5),(3,1,4,5),(4,1,5,5),(5,2,3,5),(6,2,4,5),(7,2,5,5),(8,2,6,5),(9,3,4,5),(10,3,5,5),(11,3,6,5),(12,3,7,5),(13,4,5,5),(14,4,6,5),(15,4,7,5),(16,4,8,5),(17,5,6,5),(18,5,7,5),(19,5,8,5),(20,5,9,5),(21,6,7,5),(22,6,8,5),(23,6,9,5);
/*!40000 ALTER TABLE `fare` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `midway`
--

DROP TABLE IF EXISTS `midway`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `midway` (
  `midway_id` int(11) NOT NULL AUTO_INCREMENT,
  `timetable_id` int(11) DEFAULT NULL,
  `stop_id` int(11) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`midway_id`),
  KEY `stop_id` (`stop_id`),
  KEY `timetable_id` (`timetable_id`),
  CONSTRAINT `midway_ibfk_2` FOREIGN KEY (`stop_id`) REFERENCES `stop` (`stop_id`),
  CONSTRAINT `midway_ibfk_3` FOREIGN KEY (`timetable_id`) REFERENCES `timetable` (`timetable_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `midway`
--

LOCK TABLES `midway` WRITE;
/*!40000 ALTER TABLE `midway` DISABLE KEYS */;
INSERT INTO `midway` VALUES (1,1,4,'2017-01-03 18:30:00');
/*!40000 ALTER TABLE `midway` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `route`
--

DROP TABLE IF EXISTS `route`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `route` (
  `route_id` int(11) NOT NULL AUTO_INCREMENT,
  `origin` int(11) DEFAULT NULL,
  `destination` int(11) DEFAULT NULL,
  PRIMARY KEY (`route_id`),
  KEY `origin` (`origin`),
  KEY `destination` (`destination`),
  CONSTRAINT `route_ibfk_1` FOREIGN KEY (`origin`) REFERENCES `stop` (`stop_id`),
  CONSTRAINT `route_ibfk_2` FOREIGN KEY (`destination`) REFERENCES `stop` (`stop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='contains information about diffenent routes and their intermediate stops\r\n';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `route`
--

LOCK TABLES `route` WRITE;
/*!40000 ALTER TABLE `route` DISABLE KEYS */;
INSERT INTO `route` VALUES (1,1,34),(2,1,34),(3,34,66);
/*!40000 ALTER TABLE `route` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stop`
--

DROP TABLE IF EXISTS `stop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stop` (
  `stop_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT '0',
  PRIMARY KEY (`stop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='contains all bus stop names and their ids';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stop`
--

LOCK TABLES `stop` WRITE;
/*!40000 ALTER TABLE `stop` DISABLE KEYS */;
INSERT INTO `stop` VALUES (1,'Howrah jn'),(2,'Liluah'),(3,'Belur'),(4,'Bally'),(5,'Uttarpara'),(6,'Hind motor'),(7,'Konnagar'),(8,'Rishra'),(9,'Serampore'),(10,'Seoraphuli'),(11,'Baidyabati'),(12,'Bhadreshwar'),(13,'Mankundu'),(14,'Chandan nagar'),(15,'Chuchura'),(16,'Hooghly'),(17,'Bandel jn'),(18,'Adi saptagram'),(19,'Magra'),(20,'Talandu'),(21,'Khanyan'),(22,'Pundooah'),(23,'Simlagarh'),(24,'Bainchigram'),(25,'Bainchi'),(26,'Debipur'),(27,'Bagila'),(28,'Memari'),(29,'Nimo'),(30,'Rasulpur'),(31,'Palsit'),(32,'Saktigarh'),(33,'Gangpur'),(34,'Burdwan'),(35,'Palla Road'),(36,'Chanchai'),(37,'Masagram'),(38,'Nabagram'),(39,'Jaugram'),(40,'Jhapandanga'),(41,'Gurap'),(42,'Hajigarh'),(43,'Shibai Chandi'),(44,'Dhaniakhali'),(45,'Belmuri'),(46,'Porabazar'),(47,'Chandanpur'),(48,'Madhusudanpur'),(49,'Kamarkundu'),(50,'Balarambati'),(51,'	Mirzapur-Bankipur'),(52,'Baruipara'),(53,'Begampur'),(54,'Janai Road'),(55,'Gobra'),(56,'Dankuni'),(57,'Belanagar'),(58,'Talit'),(59,'Khana Jn'),(60,'Isanchandi Halt'),(61,'Galsi'),(62,'Paraj'),(63,'Mankar'),(64,'Panagarh'),(65,'Rajbandh'),(66,'Durgapur');
/*!40000 ALTER TABLE `stop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timetable` (
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable`
--

LOCK TABLES `timetable` WRITE;
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
INSERT INTO `timetable` VALUES (1,1,'2012-11-15 22:30:02','2012-11-15 18:30:00',23,1);
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='contains information about a user';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-08 23:02:38
