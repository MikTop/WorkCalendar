CREATE DATABASE  IF NOT EXISTS `employee` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `employee`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: employee
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `calendar`
--

DROP TABLE IF EXISTS `calendar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calendar` (
  `id` int NOT NULL,
  `day` date DEFAULT NULL,
  `dayType` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_calendar_dayType_dayTYPE_id` (`dayType`),
  CONSTRAINT `FK_calendar_dayType_dayTYPE_id` FOREIGN KEY (`dayType`) REFERENCES `daytype` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendar`
--

LOCK TABLES `calendar` WRITE;
/*!40000 ALTER TABLE `calendar` DISABLE KEYS */;
INSERT INTO `calendar` VALUES (0,'2020-01-01',1),(1,'2020-01-02',1),(2,'2020-01-03',1),(3,'2020-01-04',1),(4,'2020-01-05',1),(5,'2020-01-06',1),(6,'2020-01-07',1),(7,'2020-01-08',1),(8,'2020-01-09',2),(9,'2020-01-10',2),(10,'2020-01-11',1),(11,'2020-01-12',1),(12,'2020-01-13',2),(13,'2020-01-14',2),(14,'2020-01-15',2),(15,'2020-01-16',2),(16,'2020-01-17',2),(17,'2020-01-18',1),(18,'2020-01-19',1),(19,'2020-01-20',2),(20,'2020-01-21',2),(21,'2020-01-22',2),(22,'2020-01-23',2),(23,'2020-01-24',2),(24,'2020-01-25',1),(25,'2020-01-26',1),(26,'2020-01-27',2),(27,'2020-01-28',2),(28,'2020-01-29',2),(29,'2020-01-30',2),(30,'2020-01-31',2),(31,'2020-02-01',1),(32,'2020-02-02',1),(33,'2020-02-03',2),(34,'2020-02-04',2),(35,'2020-02-05',2),(36,'2020-02-06',2),(37,'2020-02-07',2),(38,'2020-02-08',1),(39,'2020-02-09',1),(40,'2020-02-10',2),(41,'2020-02-11',2),(42,'2020-02-12',2),(43,'2020-02-13',2),(44,'2020-02-14',2),(45,'2020-02-15',1),(46,'2020-02-16',1),(47,'2020-02-17',2),(48,'2020-02-18',2),(49,'2020-02-19',2),(50,'2020-02-20',2),(51,'2020-02-21',2),(52,'2020-02-22',1),(53,'2020-02-23',1),(54,'2020-02-24',1),(55,'2020-02-25',2),(56,'2020-02-26',2),(57,'2020-02-27',2),(58,'2020-02-28',2),(59,'2020-02-29',1),(60,'2020-03-01',1),(61,'2020-03-02',2),(62,'2020-03-03',2),(63,'2020-03-04',2),(64,'2020-03-05',2),(65,'2020-03-06',2),(66,'2020-03-07',1),(67,'2020-03-08',1),(68,'2020-03-09',1),(69,'2020-03-10',2),(70,'2020-03-11',2),(71,'2020-03-12',2),(72,'2020-03-13',2),(73,'2020-03-14',1),(74,'2020-03-15',1),(75,'2020-03-16',2),(76,'2020-03-17',2),(77,'2020-03-18',2),(78,'2020-03-19',2),(79,'2020-03-20',2),(80,'2020-03-21',1),(81,'2020-03-22',1),(82,'2020-03-23',2),(83,'2020-03-24',2),(84,'2020-03-25',2),(85,'2020-03-26',2),(86,'2020-03-27',2),(87,'2020-03-28',1),(88,'2020-03-29',1),(89,'2020-03-30',2),(90,'2020-03-31',2),(91,'2020-04-01',2),(92,'2020-04-02',2),(93,'2020-04-03',2),(94,'2020-04-04',1),(95,'2020-04-05',1),(96,'2020-04-06',2),(97,'2020-04-07',2),(98,'2020-04-08',2),(99,'2020-04-09',2),(100,'2020-04-10',2),(101,'2020-04-11',1),(102,'2020-04-12',1),(103,'2020-04-13',2),(104,'2020-04-14',2),(105,'2020-04-15',2),(106,'2020-04-16',2),(107,'2020-04-17',2),(108,'2020-04-18',1),(109,'2020-04-19',1),(110,'2020-04-20',2),(111,'2020-04-21',2),(112,'2020-04-22',2),(113,'2020-04-23',2),(114,'2020-04-24',2),(115,'2020-04-25',1),(116,'2020-04-26',1),(117,'2020-04-27',2),(118,'2020-04-28',2),(119,'2020-04-29',2),(120,'2020-04-30',2),(121,'2020-05-01',1),(122,'2020-05-02',1),(123,'2020-05-03',1),(124,'2020-05-04',1),(125,'2020-05-05',1),(126,'2020-05-06',2),(127,'2020-05-07',2),(128,'2020-05-08',2),(129,'2020-05-09',1),(130,'2020-05-10',1),(131,'2020-05-11',1),(132,'2020-05-12',2),(133,'2020-05-13',2),(134,'2020-05-14',2),(135,'2020-05-15',2),(136,'2020-05-16',1),(137,'2020-05-17',1),(138,'2020-05-18',2),(139,'2020-05-19',2),(140,'2020-05-20',2),(141,'2020-05-21',2),(142,'2020-05-22',2),(143,'2020-05-23',1),(144,'2020-05-24',1),(145,'2020-05-25',2),(146,'2020-05-26',2),(147,'2020-05-27',2),(148,'2020-05-28',2),(149,'2020-05-29',2),(150,'2020-05-30',1),(151,'2020-05-31',1),(152,'2020-06-01',2),(153,'2020-06-02',2),(154,'2020-06-03',2),(155,'2020-06-04',2),(156,'2020-06-05',2),(157,'2020-06-06',1),(158,'2020-06-07',1),(159,'2020-06-08',2),(160,'2020-06-09',2),(161,'2020-06-10',2),(162,'2020-06-11',2),(163,'2020-06-12',1),(164,'2020-06-13',1),(165,'2020-06-14',1),(166,'2020-06-15',2),(167,'2020-06-16',2),(168,'2020-06-17',2),(169,'2020-06-18',2),(170,'2020-06-19',2),(171,'2020-06-20',1),(172,'2020-06-21',1),(173,'2020-06-22',2),(174,'2020-06-23',2),(175,'2020-06-24',2),(176,'2020-06-25',2),(177,'2020-06-26',2),(178,'2020-06-27',1),(179,'2020-06-28',1),(180,'2020-06-29',2),(181,'2020-06-30',2),(182,'2020-07-01',2),(183,'2020-07-02',2),(184,'2020-07-03',2),(185,'2020-07-04',1),(186,'2020-07-05',1),(187,'2020-07-06',2),(188,'2020-07-07',2),(189,'2020-07-08',2),(190,'2020-07-09',2),(191,'2020-07-10',2),(192,'2020-07-11',1),(193,'2020-07-12',1),(194,'2020-07-13',2),(195,'2020-07-14',2),(196,'2020-07-15',2),(197,'2020-07-16',2),(198,'2020-07-17',2),(199,'2020-07-18',1),(200,'2020-07-19',1),(201,'2020-07-20',2),(202,'2020-07-21',2),(203,'2020-07-22',2),(204,'2020-07-23',2),(205,'2020-07-24',2),(206,'2020-07-25',1),(207,'2020-07-26',1),(208,'2020-07-27',2),(209,'2020-07-28',2),(210,'2020-07-29',2),(211,'2020-07-30',2),(212,'2020-07-31',2),(213,'2020-08-01',1),(214,'2020-08-02',1),(215,'2020-08-03',2),(216,'2020-08-04',2),(217,'2020-08-05',2),(218,'2020-08-06',2),(219,'2020-08-07',2),(220,'2020-08-08',1),(221,'2020-08-09',1),(222,'2020-08-10',2),(223,'2020-08-11',2),(224,'2020-08-12',2),(225,'2020-08-13',2),(226,'2020-08-14',2),(227,'2020-08-15',1),(228,'2020-08-16',1),(229,'2020-08-17',2),(230,'2020-08-18',2),(231,'2020-08-19',2),(232,'2020-08-20',2),(233,'2020-08-21',2),(234,'2020-08-22',1),(235,'2020-08-23',1),(236,'2020-08-24',2),(237,'2020-08-25',2),(238,'2020-08-26',2),(239,'2020-08-27',2),(240,'2020-08-28',2),(241,'2020-08-29',1),(242,'2020-08-30',1),(243,'2020-08-31',2),(244,'2020-09-01',2),(245,'2020-09-02',2),(246,'2020-09-03',2),(247,'2020-09-04',2),(248,'2020-09-05',1),(249,'2020-09-06',1),(250,'2020-09-07',2),(251,'2020-09-08',2),(252,'2020-09-09',2),(253,'2020-09-10',2),(254,'2020-09-11',2),(255,'2020-09-12',1),(256,'2020-09-13',1),(257,'2020-09-14',2),(258,'2020-09-15',2),(259,'2020-09-16',2),(260,'2020-09-17',2),(261,'2020-09-18',2),(262,'2020-09-19',1),(263,'2020-09-20',1),(264,'2020-09-21',2),(265,'2020-09-22',2),(266,'2020-09-23',2),(267,'2020-09-24',2),(268,'2020-09-25',2),(269,'2020-09-26',1),(270,'2020-09-27',1),(271,'2020-09-28',2),(272,'2020-09-29',2),(273,'2020-09-30',2),(274,'2020-10-01',2),(275,'2020-10-02',2),(276,'2020-10-03',1),(277,'2020-10-04',1),(278,'2020-10-05',2),(279,'2020-10-06',2),(280,'2020-10-07',2),(281,'2020-10-08',2),(282,'2020-10-09',2),(283,'2020-10-10',1),(284,'2020-10-11',1),(285,'2020-10-12',2),(286,'2020-10-13',2),(287,'2020-10-14',2),(288,'2020-10-15',2),(289,'2020-10-16',2),(290,'2020-10-17',1),(291,'2020-10-18',1),(292,'2020-10-19',2),(293,'2020-10-20',2),(294,'2020-10-21',2),(295,'2020-10-22',2),(296,'2020-10-23',2),(297,'2020-10-24',1),(298,'2020-10-25',1),(299,'2020-10-26',2),(300,'2020-10-27',2),(301,'2020-10-28',2),(302,'2020-10-29',2),(303,'2020-10-30',2),(304,'2020-10-31',1),(305,'2020-11-01',1),(306,'2020-11-02',2),(307,'2020-11-03',2),(308,'2020-11-04',1),(309,'2020-11-05',2),(310,'2020-11-06',2),(311,'2020-11-07',1),(312,'2020-11-08',1),(313,'2020-11-09',2),(314,'2020-11-10',2),(315,'2020-11-11',2),(316,'2020-11-12',2),(317,'2020-11-13',2),(318,'2020-11-14',1),(319,'2020-11-15',1),(320,'2020-11-16',2),(321,'2020-11-17',2),(322,'2020-11-18',2),(323,'2020-11-19',2),(324,'2020-11-20',2),(325,'2020-11-21',1),(326,'2020-11-22',1),(327,'2020-11-23',2),(328,'2020-11-24',2),(329,'2020-11-25',2),(330,'2020-11-26',2),(331,'2020-11-27',2),(332,'2020-11-28',1),(333,'2020-11-29',1),(334,'2020-11-30',2),(335,'2020-12-01',2),(336,'2020-12-02',2),(337,'2020-12-03',2),(338,'2020-12-04',2),(339,'2020-12-05',1),(340,'2020-12-06',1),(341,'2020-12-07',2),(342,'2020-12-08',2),(343,'2020-12-09',2),(344,'2020-12-10',2),(345,'2020-12-11',2),(346,'2020-12-12',1),(347,'2020-12-13',1),(348,'2020-12-14',2),(349,'2020-12-15',2),(350,'2020-12-16',2),(351,'2020-12-17',2),(352,'2020-12-18',2),(353,'2020-12-19',1),(354,'2020-12-20',1),(355,'2020-12-21',2),(356,'2020-12-22',2),(357,'2020-12-23',2),(358,'2020-12-24',2),(359,'2020-12-25',2),(360,'2020-12-26',1),(361,'2020-12-27',1),(362,'2020-12-28',2),(363,'2020-12-29',2),(364,'2020-12-30',2),(365,'2020-12-31',2);
/*!40000 ALTER TABLE `calendar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daytype`
--

DROP TABLE IF EXISTS `daytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `daytype` (
  `id` int NOT NULL AUTO_INCREMENT,
  `abbreviation` varchar(2) DEFAULT NULL,
  `typeDesc` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daytype`
--

LOCK TABLES `daytype` WRITE;
/*!40000 ALTER TABLE `daytype` DISABLE KEYS */;
INSERT INTO `daytype` VALUES (1,'B','Not Working Day'),(2,'P','Working Day');
/*!40000 ALTER TABLE `daytype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departments` (
  `id` int NOT NULL,
  `abbreviation` varchar(3) DEFAULT NULL,
  `departDesc` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES (0,'IT','Information Tech');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employee_ID` int unsigned NOT NULL AUTO_INCREMENT,
  `lastName` varchar(20) DEFAULT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `secondName` varchar(20) DEFAULT NULL,
  `department_ID` int DEFAULT NULL,
  `position_ID` int DEFAULT NULL,
  `personalNumber` int DEFAULT NULL,
  PRIMARY KEY (`employee_ID`),
  KEY `FK_departmentID_departments_id` (`department_ID`),
  KEY `FK_employee_positionID_position_ID` (`position_ID`),
  CONSTRAINT `FK_departmentID_departments_id` FOREIGN KEY (`department_ID`) REFERENCES `departments` (`id`),
  CONSTRAINT `FK_employee_positionID_position_ID` FOREIGN KEY (`position_ID`) REFERENCES `position` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (7,'Курчатов','Курчат','Курчатович',0,0,1),(8,'Коробов','Короб','Коробович',0,0,2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `position` (
  `id` int NOT NULL,
  `posDesc` varchar(40) DEFAULT NULL,
  `department_ID` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (0,'Разработчик',0);
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `worktimedesc`
--

DROP TABLE IF EXISTS `worktimedesc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `worktimedesc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `abbreviation` varchar(2) DEFAULT NULL,
  `workTimeDesc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `worktimedesc`
--

LOCK TABLES `worktimedesc` WRITE;
/*!40000 ALTER TABLE `worktimedesc` DISABLE KEYS */;
INSERT INTO `worktimedesc` VALUES (1,'Я','полный рабочий день'),(2,'Н','отсутствие на рабочее место по невыясненным причинам;'),(3,'Рв','работа в праздничные и выходные дни; а также работа в праздничные и выходные дни, при нахождении в командировке'),(4,'Б','дни временной нетрудоспособности;'),(5,'К','командировочные дни; а также, выходные (нерабочие) дни при нахождении в командировке, когда сотрудник отдыхает, в соответствии с графиком работы ООО «Наука» в командировке;'),(6,'ОТ','ежегодный основной оплаченный отпуск;'),(7,'До','неоплачиваемый отпуск (отпуск за свой счет);'),(8,'Хд','хозяйственный день;'),(9,'У','отпуск на период обучения.'),(10,'Ож','Отпуск по уходу за ребенком.');
/*!40000 ALTER TABLE `worktimedesc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `worktimesheet`
--

DROP TABLE IF EXISTS `worktimesheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `worktimesheet` (
  `employee_ID` int unsigned NOT NULL,
  `date_ID` int NOT NULL,
  `workTimeDesc_ID` int NOT NULL,
  `id` int DEFAULT NULL,
  PRIMARY KEY (`employee_ID`,`date_ID`),
  KEY `FK_Sheet_dateID_calendar_id` (`date_ID`),
  KEY `FK_Sheet_workTimeDescID_workTimeDesc_id` (`workTimeDesc_ID`),
  CONSTRAINT `FK_Sheet_dateID_calendar_id` FOREIGN KEY (`date_ID`) REFERENCES `calendar` (`id`),
  CONSTRAINT `FK_Sheet_workTimeDescID_workTimeDesc_id` FOREIGN KEY (`workTimeDesc_ID`) REFERENCES `worktimedesc` (`id`),
  CONSTRAINT `FK_workSheet_employeeID_employee_ID` FOREIGN KEY (`employee_ID`) REFERENCES `employee` (`employee_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `worktimesheet`
--

LOCK TABLES `worktimesheet` WRITE;
/*!40000 ALTER TABLE `worktimesheet` DISABLE KEYS */;
INSERT INTO `worktimesheet` VALUES (7,15,1,0),(8,169,4,0);
/*!40000 ALTER TABLE `worktimesheet` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-24 22:44:54
