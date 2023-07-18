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
-- Table structure for table `ato_legal`
--

DROP TABLE IF EXISTS `ato_legal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ato_legal` (
  `codigo_ato` int NOT NULL,
  `numero_ato` varchar(3) DEFAULT NULL,
  `ano_ato` year DEFAULT NULL,
  `data_ato` date DEFAULT NULL,
  `ementa_ato` varchar(45) DEFAULT NULL,
  `categoria_ato` varchar(45) DEFAULT NULL,
  `quantidade_ato` varchar(45) DEFAULT NULL,
  `reajuste_de` varchar(45) DEFAULT NULL,
  `reajuste_para` varchar(45) DEFAULT NULL,
  `fk_codigo_tipo_ato` int DEFAULT NULL,
  PRIMARY KEY (`codigo_ato`),
  KEY `fk_codigo_tipo_ato_idx` (`fk_codigo_tipo_ato`),
  CONSTRAINT `fk_codigo_tipo_ato` FOREIGN KEY (`fk_codigo_tipo_ato`) REFERENCES `tipo_ato` (`codigo_tipo_ato`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ato_legal`
--

LOCK TABLES `ato_legal` WRITE;
/*!40000 ALTER TABLE `ato_legal` DISABLE KEYS */;
INSERT INTO `ato_legal` VALUES (1,'1',2023,'2023-10-02','Cria e extingue cargo e emprego','CRIAÇÃO','1','0','0',1),(2,'2',2023,'2023-10-01','Cria e extingue cargo e emprego','CRIAÇÃO','1','0','0',1);
/*!40000 ALTER TABLE `ato_legal` ENABLE KEYS */;
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
