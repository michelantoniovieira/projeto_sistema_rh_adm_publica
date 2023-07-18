-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sistemarh
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `listadecargosempregos`
--

DROP TABLE IF EXISTS `listadecargosempregos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listadecargosempregos` (
  `fk_codigo_concurso` int NOT NULL,
  `fk_codigo_cargo_emprego` int NOT NULL,
  `quantidade_vagas` varchar(2) NOT NULL,
  `data_homologacao_cargos_empregos` date DEFAULT NULL,
  PRIMARY KEY (`fk_codigo_concurso`,`fk_codigo_cargo_emprego`),
  KEY `fk_codigo_cargo_emprego_idx` (`fk_codigo_cargo_emprego`),
  CONSTRAINT `fk_codigo_cargo_emprego` FOREIGN KEY (`fk_codigo_cargo_emprego`) REFERENCES `cargo_emprego` (`codigo_cargo_emprego`),
  CONSTRAINT `fk_codigo_concurso` FOREIGN KEY (`fk_codigo_concurso`) REFERENCES `concurso_publico` (`codigo_concurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listadecargosempregos`
--

LOCK TABLES `listadecargosempregos` WRITE;
/*!40000 ALTER TABLE `listadecargosempregos` DISABLE KEYS */;
INSERT INTO `listadecargosempregos` VALUES (1,1,'4',NULL),(1,2,'1',NULL),(1,3,'CR',NULL),(2,1,'3',NULL),(2,2,'3',NULL);
/*!40000 ALTER TABLE `listadecargosempregos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-15 22:00:54
