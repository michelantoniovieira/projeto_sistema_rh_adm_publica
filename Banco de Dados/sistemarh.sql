-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sistemarh
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `banca`
--

DROP TABLE IF EXISTS `banca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banca` (
  `codigo_banca` int NOT NULL AUTO_INCREMENT,
  `nome_banca_organizadora` varchar(45) DEFAULT NULL,
  `responsavel_banca_organizadora` varchar(45) DEFAULT NULL,
  `telefone_banca_organizadora` varchar(45) DEFAULT NULL,
  `telefone_responsavel_banca_organizadora` varchar(45) DEFAULT NULL,
  `email_banca_organizadora` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codigo_banca`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banca`
--

LOCK TABLES `banca` WRITE;
/*!40000 ALTER TABLE `banca` DISABLE KEYS */;
INSERT INTO `banca` VALUES (13,'Prefeitura Municipal de Quadra','Michel Antonio Vieira','1532539000','15997421250','rh1@quadra.sp.gov.br'),(14,'22','2','2','2','2');
/*!40000 ALTER TABLE `banca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cadastro_funcionario`
--

DROP TABLE IF EXISTS `cadastro_funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cadastro_funcionario` (
  `matricula_funcionario` int NOT NULL,
  PRIMARY KEY (`matricula_funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadastro_funcionario`
--

LOCK TABLES `cadastro_funcionario` WRITE;
/*!40000 ALTER TABLE `cadastro_funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadastro_funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cargo_emprego`
--

DROP TABLE IF EXISTS `cargo_emprego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cargo_emprego` (
  `codigo_cargo_emprego` int NOT NULL AUTO_INCREMENT,
  `nome_cargo_emprego` varchar(45) NOT NULL,
  `regime_juridico` varchar(45) NOT NULL,
  `numero_lei_cria_cargo_emprego` varchar(45) NOT NULL,
  `data_lei_cria_cargo_emprego` varchar(45) NOT NULL,
  `referencia_salarial` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_cargo_emprego`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargo_emprego`
--

LOCK TABLES `cargo_emprego` WRITE;
/*!40000 ALTER TABLE `cargo_emprego` DISABLE KEYS */;
INSERT INTO `cargo_emprego` VALUES (1,'1','1','1','1','1'),(2,'2','2','2','2','2');
/*!40000 ALTER TABLE `cargo_emprego` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pastaraiz`
--

DROP TABLE IF EXISTS `pastaraiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pastaraiz` (
  `id` int NOT NULL,
  `caminho` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pastaraiz`
--

LOCK TABLES `pastaraiz` WRITE;
/*!40000 ALTER TABLE `pastaraiz` DISABLE KEYS */;
/*!40000 ALTER TABLE `pastaraiz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `nome_usuario` varchar(45) NOT NULL,
  `senha_usuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nome_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('admin','123'),('MICHEL','123'),('teste','123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-06 23:22:20
