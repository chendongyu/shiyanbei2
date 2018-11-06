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
  `DECK_ID` varchar(45) DEFAULT '1',
  `NAME` varchar(20) DEFAULT NULL,
  `TYPE` varchar(45) DEFAULT NULL,
  `ORDER` int(11) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT '0',
  `CARD_ID` varchar(5) NOT NULL,
  PRIMARY KEY (`CARD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deck`
--

LOCK TABLES `deck` WRITE;
/*!40000 ALTER TABLE `deck` DISABLE KEYS */;
INSERT INTO `deck` VALUES ('1','Pikachu','P',1,'0','01'),('1','Bulbasaur','P',2,'0','02'),('1','Charmander','P',3,'0','03'),('1','Squirtle','P',4,'0','04'),('1','Machop','P',5,'0','05'),('1','Rattata','P',6,'0','06'),('1','Poliwag','P',7,'0','07'),('1','Bellsprout','P',8,'0','08'),('1','Geodude','P',9,'0','09'),('1','Gloom','P',10,'0','10'),('1','Mankey','P',11,'0','11'),('1','Gastly','P',12,'0','12'),('1','Slowpoke','P',13,'0','13'),('1','Voltorb','P',14,'0','14'),('1','Hitmonlee','P',15,'0','15'),('1','Horseaa','P',16,'0','16'),('1','Scyther','P',17,'0','17'),('1','Staryu','P',18,'0','18'),('1','Drowzee','P',19,'0','19'),('1','Caterpie','P',20,'0','20'),('1','Pikachu','P',21,'0','21'),('1','Bulbasaur','P',22,'0','22'),('1','Charmander','P',23,'0','23'),('1','Squirtle','P',24,'0','24'),('1','Machop','P',25,'0','25'),('1','Rattata','P',26,'0','26'),('1','Poliwag','P',27,'0','27'),('1','Bellsprout','P',28,'0','28'),('1','Geodude','P',29,'0','29'),('1','Gloom','P',30,'0','30'),('1','Mankey','P',31,'0','31'),('1','Gastly','P',32,'0','32'),('1','Ash','T',33,'0','33'),('1','Brock','T',34,'0','34'),('1','Fire','E',35,'0','35'),('1','Ice','E',36,'0','36'),('1','Elec','E',37,'0','37'),('1','Plant','E',38,'0','38'),('1','Water','E',39,'0','39'),('1','Psy','E',40,'0','40'),('2','Pikachu','P',1,'0','41'),('2','Bulbasaur','P',2,'0','42'),('2','Charmander','P',3,'0','43'),('2','Squirtle','P',4,'0','44'),('2','Machop','P',5,'0','45'),('2','Rattata','P',6,'0','46'),('2','Poliwag','P',7,'0','47'),('2','Bellsprout','P',8,'0','48'),('2','Geodude','P',9,'0','49'),('2','Gloom','P',10,'0','50'),('2','Mankey','P',11,'0','51'),('2','Gastly','P',12,'0','52'),('2','Slowpoke','P',13,'0','53'),('2','Voltorb','P',14,'0','54'),('2','Hitmonlee','P',15,'0','55'),('2','Horseaa','P',16,'0','56'),('2','Scyther','P',17,'0','57'),('2','Staryu','P',18,'0','58'),('2','Drowzee','P',19,'0','59'),('2','Caterpie','P',20,'0','60'),('2','Pikachu','P',21,'0','61'),('2','Bulbasaur','P',22,'0','62'),('2','Charmander','P',23,'0','63'),('2','Squirtle','P',24,'0','64'),('2','Machop','P',25,'0','65'),('2','Rattata','P',26,'0','66'),('2','Poliwag','P',27,'0','67'),('2','Bellsprout','P',28,'0','68'),('2','Geodude','P',29,'0','69'),('2','Gloom','P',30,'0','70'),('2','Mankey','P',31,'0','71'),('2','Gastly','P',32,'0','72'),('2','Ash','T',33,'0','73'),('2','Brock','T',34,'0','74'),('2','Fire','E',35,'0','75'),('2','Ice','E',36,'0','76'),('2','Elec','E',37,'0','77'),('2','Plant','E',38,'0','78'),('2','Water','E',39,'0','79'),('2','Psy','E',40,'0','80');
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

-- Dump completed on 2018-11-05 21:12:34
