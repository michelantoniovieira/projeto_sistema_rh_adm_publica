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
-- Table structure for table `listadeclassificadosporcargoemprego`
--

DROP TABLE IF EXISTS `listadeclassificadosporcargoemprego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listadeclassificadosporcargoemprego` (
  `fk_cpf_classificado` varchar(11) NOT NULL,
  `fk_codigo_cargo_emprego` int NOT NULL,
  PRIMARY KEY (`fk_cpf_classificado`,`fk_codigo_cargo_emprego`),
  KEY `fk_codigo_cargo_emprego_por_cargo_emprego_idx` (`fk_codigo_cargo_emprego`),
  CONSTRAINT `fk_codigo_cargo_emprego_por_cargo_emprego` FOREIGN KEY (`fk_codigo_cargo_emprego`) REFERENCES `cargo_emprego` (`codigo_cargo_emprego`),
  CONSTRAINT `fk_cpf_classificado_por_cargo_emprego` FOREIGN KEY (`fk_cpf_classificado`) REFERENCES `classificados` (`cpf_classificado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listadeclassificadosporcargoemprego`
--

LOCK TABLES `listadeclassificadosporcargoemprego` WRITE;
/*!40000 ALTER TABLE `listadeclassificadosporcargoemprego` DISABLE KEYS */;
INSERT INTO `listadeclassificadosporcargoemprego` VALUES ('44262543889',1);
/*!40000 ALTER TABLE `listadeclassificadosporcargoemprego` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-15 22:00:53
