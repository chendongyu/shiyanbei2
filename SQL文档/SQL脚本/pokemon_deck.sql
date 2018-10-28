-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: pokemon
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `deck`
--

DROP TABLE IF EXISTS `deck`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `deck` (
  `DECK_ID` varchar(5) DEFAULT NULL,
  `POKEMON_ID` varchar(5) DEFAULT NULL,
  `POKEMON_NUM` int(2) DEFAULT '0',
  `ENERGY_ID` varchar(5) DEFAULT NULL,
  `ENERGY_NUM` int(2) DEFAULT NULL,
  `TRAINER_ID` varchar(5) DEFAULT NULL,
  `TRAINER_NUM` int(2) DEFAULT '0',
  `TYPE` varchar(5) NOT NULL,
  `ID` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deck`
--

LOCK TABLES `deck` WRITE;
/*!40000 ALTER TABLE `deck` DISABLE KEYS */;
INSERT INTO `deck` VALUES ('1','01',2,'',0,'',0,'p','01'),('1','02',2,'',0,'',0,'p','02'),('1','03',2,'',0,'',0,'p','03'),('1','04',2,'',0,'',0,'p','04'),('1','05',2,'',0,'',0,'p','05'),('1','06',1,'',0,'',0,'p','06'),('1','07',1,'',0,'',0,'p','07'),('1','08',1,'',0,'',0,'p','08'),('1','09',1,'',0,'',0,'p','09'),('1','10',1,'',0,'',0,'p','10'),('1','11',1,'',0,'',0,'p','11'),('1','12',1,'',0,'',0,'p','12'),('1','13',1,'',0,'',0,'p','13'),('1','14',1,'',0,'',0,'p','14'),('1','15',1,'',0,'',0,'p','15'),('1','16',1,'',0,'',0,'p','16'),('1','17',1,'',0,'',0,'p','17'),('1','18',1,'',0,'',0,'p','18'),('1','19',1,'',0,'',0,'p','19'),('1','20',1,'',0,'',0,'p','20'),('1','',0,'1',1,'',0,'e','21'),('1','',0,'2',1,'',0,'e','22'),('1','',0,'3',1,'',0,'e','23'),('1','',0,'4',1,'',0,'e','24'),('1','',0,'5',1,'',0,'e','25'),('1','',0,'6',1,'',0,'e','26'),('1','',0,'7',1,'',0,'e','27'),('1','',0,'8',1,'',0,'e','28'),('1','',0,'',0,'1',1,'t','29'),('1','',0,'',0,'2',1,'t','30'),('2','01',2,'',0,'',0,'p','31'),('2','02',2,'',0,'',0,'p','32'),('2','03',2,'',0,'',0,'p','33'),('2','04',2,'',0,'',0,'p','34'),('2','05',2,'',0,'',0,'p','35'),('2','06',1,'',0,'',0,'p','36'),('2','07',1,'',0,'',0,'p','37'),('2','08',1,'',0,'',0,'p','38'),('2','09',1,'',0,'',0,'p','39'),('2','10',1,'',0,'',0,'p','40'),('2','11',1,'',0,'',0,'p','41'),('2','12',1,'',0,'',0,'p','42'),('2','13',1,'',0,'',0,'p','43'),('2','14',1,'',0,'',0,'p','44'),('2','15',1,'',0,'',0,'p','45'),('2','16',1,'',0,'',0,'p','46'),('2','17',1,'',0,'',0,'p','47'),('2','18',1,'',0,'',0,'p','48'),('2','19',1,'',0,'',0,'p','49'),('2','20',1,'',0,'',0,'p','50'),('2','',0,'1',1,'',0,'e','51'),('2','',0,'2',1,'',0,'e','52'),('2','',0,'3',1,'',0,'e','53'),('2','',0,'4',1,'',0,'e','54'),('2','',0,'5',1,'',0,'e','55'),('2','',0,'6',1,'',0,'e','56'),('2','',0,'7',1,'',0,'e','57'),('2','',0,'8',1,'',0,'e','58'),('2','',0,'',0,'1',1,'t','59'),('2','',0,'',0,'2',1,'t','60');
/*!40000 ALTER TABLE `deck` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-28  0:52:40
