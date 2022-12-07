-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: login
-- ------------------------------------------------------
-- Server version	5.5.50

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
-- Table structure for table `log`
--

DROP TABLE IF EXISTS `log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `log` (
  `login` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `log`
--

LOCK TABLES `log` WRITE;
/*!40000 ALTER TABLE `log` DISABLE KEYS */;
INSERT INTO `log` VALUES ('to','to');
/*!40000 ALTER TABLE `log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logg`
--

DROP TABLE IF EXISTS `logg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logg` (
  `login` varchar(43) DEFAULT NULL,
  `pass` varchar(56) DEFAULT NULL,
  `name` varchar(34) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logg`
--

LOCK TABLES `logg` WRITE;
/*!40000 ALTER TABLE `logg` DISABLE KEYS */;
INSERT INTO `logg` VALUES ('to','to','amit');
/*!40000 ALTER TABLE `logg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sign`
--

DROP TABLE IF EXISTS `sign`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sign` (
  `name` varchar(23) DEFAULT NULL,
  `number` int(34) DEFAULT NULL,
  `pro_name` varchar(23) DEFAULT NULL,
  `email` varchar(56) DEFAULT NULL,
  `pass` varchar(43) DEFAULT NULL,
  `re_pass` varchar(23) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sign`
--

LOCK TABLES `sign` WRITE;
/*!40000 ALTER TABLE `sign` DISABLE KEYS */;
INSERT INTO `sign` VALUES ('AMIT',9801,'NETBEANS','raj@gmail.com','qwer','qwer'),('raj',45784,'translator','mll@gmail.com','qwert','qwert');
/*!40000 ALTER TABLE `sign` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `signn`
--

DROP TABLE IF EXISTS `signn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `signn` (
  `name` varchar(23) DEFAULT NULL,
  `number` int(78) DEFAULT NULL,
  `pro_name` varchar(23) DEFAULT NULL,
  `email` varchar(56) DEFAULT NULL,
  `pass` varchar(43) DEFAULT NULL,
  `re_pass` varchar(23) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signn`
--

LOCK TABLES `signn` WRITE;
/*!40000 ALTER TABLE `signn` DISABLE KEYS */;
INSERT INTO `signn` VALUES ('AMIT',980108,'NETBEANS','raj@gmail.com','qwe','qwe'),(NULL,NULL,NULL,NULL,NULL,NULL),('Raj Malhotra',9801325,'translator','mll@gmail.com','asd','asd');
/*!40000 ALTER TABLE `signn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `submit`
--

DROP TABLE IF EXISTS `submit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `submit` (
  `product_id` int(56) NOT NULL,
  `product_name` varchar(34) DEFAULT NULL,
  `bug_id` int(78) DEFAULT NULL,
  `type` varchar(34) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `submit`
--

LOCK TABLES `submit` WRITE;
/*!40000 ALTER TABLE `submit` DISABLE KEYS */;
INSERT INTO `submit` VALUES (1,'quora',121,'error','sql.exception'),(2,'ASSET',412,'error','NULL.EXCEPTION'),(3,'micro',500,'server','jdbc.driver.not.found'),(4,'racerstar',400,'client','resource not found'),(5,'flag',402,'client','rsource not found'),(6,'redmi',155,'error','arm file error'),(7,'sdd',555,'error','null.exception\r\n'),(8,'halogen',500,'server','sql.exception');
/*!40000 ALTER TABLE `submit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-09 21:35:11
