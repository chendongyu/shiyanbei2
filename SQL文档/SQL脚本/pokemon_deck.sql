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
  `CARD_ID` varchar(5) NOT NULL,
  PRIMARY KEY (`CARD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deck`
--

LOCK TABLES `deck` WRITE;
/*!40000 ALTER TABLE `deck` DISABLE KEYS */;
INSERT INTO `deck` VALUES ('1','Pikachu','P',1,'01'),('1','Bulbasaur','P',2,'02'),('1','Charmander','P',3,'03'),('1','Squirtle','P',4,'04'),('1','Machop','P',5,'05'),('1','Rattata','P',6,'06'),('1','Poliwag','P',7,'07'),('1','Bellsprout','P',8,'08'),('1','Geodude','P',9,'09'),('1','Gloom','P',10,'10'),('1','Mankey','P',11,'11'),('1','Gastly','P',12,'12'),('1','Slowpoke','P',13,'13'),('1','Voltorb','P',14,'14'),('1','Hitmonlee','P',15,'15'),('1','Horseaa','P',16,'16'),('1','Scyther','P',17,'17'),('1','Staryu','P',18,'18'),('1','Drowzee','P',19,'19'),('1','Caterpie','P',20,'20'),('1','Pikachu','P',21,'21'),('1','Bulbasaur','P',22,'22'),('1','Charmander','P',23,'23'),('1','Squirtle','P',24,'24'),('1','Machop','P',25,'25'),('1','Rattata','P',26,'26'),('1','Poliwag','P',27,'27'),('1','Bellsprout','P',28,'28'),('1','Geodude','P',29,'29'),('1','Gloom','P',30,'30'),('1','Mankey','P',31,'31'),('1','Gastly','P',32,'32'),('1','Ash','T',33,'33'),('1','Brock','T',34,'34'),('1','Fire','E',35,'35'),('1','Ice','E',36,'36'),('1','Elec','E',37,'37'),('1','Plant','E',38,'38'),('1','Water','E',39,'39'),('1','Psy','E',40,'40'),('2','Pikachu','P',1,'41'),('2','Bulbasaur','P',2,'42'),('2','Charmander','P',3,'43'),('2','Squirtle','P',4,'44'),('2','Machop','P',5,'45'),('2','Rattata','P',6,'46'),('2','Poliwag','P',7,'47'),('2','Bellsprout','P',8,'48'),('2','Geodude','P',9,'49'),('2','Gloom','P',10,'50'),('2','Mankey','P',11,'51'),('2','Gastly','P',12,'52'),('2','Slowpoke','P',13,'53'),('2','Voltorb','P',14,'54'),('2','Hitmonlee','P',15,'55'),('2','Horseaa','P',16,'56'),('2','Scyther','P',17,'57'),('2','Staryu','P',18,'58'),('2','Drowzee','P',19,'59'),('2','Caterpie','P',20,'60'),('2','Pikachu','P',21,'61'),('2','Bulbasaur','P',22,'62'),('2','Charmander','P',23,'63'),('2','Squirtle','P',24,'64'),('2','Machop','P',25,'65'),('2','Rattata','P',26,'66'),('2','Poliwag','P',27,'67'),('2','Bellsprout','P',28,'68'),('2','Geodude','P',29,'69'),('2','Gloom','P',30,'70'),('2','Mankey','P',31,'71'),('2','Gastly','P',32,'72'),('2','Ash','T',33,'73'),('2','Brock','T',34,'74'),('2','Fire','E',35,'75'),('2','Ice','E',36,'76'),('2','Elec','E',37,'77'),('2','Plant','E',38,'78'),('2','Water','E',39,'79'),('2','Psy','E',40,'80');
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

-- Dump completed on 2018-11-03 23:42:37
