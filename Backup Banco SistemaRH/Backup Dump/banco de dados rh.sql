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

--
-- Table structure for table `banca`
--

DROP TABLE IF EXISTS `banca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banca` (
  `codigo_banca` int NOT NULL AUTO_INCREMENT,
  `nome_banca_organizadora` varchar(45) DEFAULT NULL,
  `telefone_banca_organizadora` varchar(45) DEFAULT NULL,
  `responsavel_banca_organizadora` varchar(45) DEFAULT NULL,
  `telefone_responsavel_banca_organizadora` varchar(45) DEFAULT NULL,
  `email_banca_organizadora` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codigo_banca`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banca`
--

LOCK TABLES `banca` WRITE;
/*!40000 ALTER TABLE `banca` DISABLE KEYS */;
INSERT INTO `banca` VALUES (1,'Consumpam','32539000','samu','1532539000','1233');
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
INSERT INTO `cadastro_funcionario` VALUES (1);
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
  `descricao_cargo_emprego` varchar(50) NOT NULL,
  `cbo_cargo_emprego` varchar(10) NOT NULL,
  `regime_juridico_cargo_emprego` varchar(11) NOT NULL,
  `esta_ativo_cargo_emprego` tinyint NOT NULL,
  `tipo_carreira_cargo_emprego` varchar(45) NOT NULL,
  `carga_horaria_semanal_cargo_emprego` varchar(3) NOT NULL,
  `carga_horaria_mensal_cargo_emprego` varchar(4) NOT NULL,
  `escolaridade_cargo_emprego` varchar(60) NOT NULL,
  `requisitos_provimento_cargo_emprego` varchar(200) DEFAULT NULL,
  `escolaridade_exigida_cargo_emprego` varchar(30) DEFAULT NULL,
  `vagas_criadas` int DEFAULT NULL,
  `vagas_providas` int DEFAULT NULL,
  `vagas_disponiveis` int DEFAULT NULL,
  `fk_codigo_vencimento` int NOT NULL,
  `fk_codigo_ato` int NOT NULL,
  PRIMARY KEY (`codigo_cargo_emprego`),
  KEY `fk_codigo_vencimento_idx` (`fk_codigo_vencimento`),
  KEY `fk_codigo_ato_idx` (`fk_codigo_ato`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargo_emprego`
--

LOCK TABLES `cargo_emprego` WRITE;
/*!40000 ALTER TABLE `cargo_emprego` DISABLE KEYS */;
INSERT INTO `cargo_emprego` VALUES (1,'Analista de Recursos Humanos','123123','CELETISTA',1,'Técnico','44h','240h','ENSINO SUPERIOR COMPLETO','','',NULL,NULL,NULL,301,1),(2,'Psicologo da Educação','123433','CELETISTA',1,'Professor','44h','240h','ENSINO SUPERIOR COMPLETO','','',NULL,NULL,NULL,302,2),(3,'Agente de Apoio Operacional','123213','CELETISTA',1,'Eletivo','44h','240h','ENSINO SUPERIOR COMPLETO','','',NULL,NULL,NULL,303,1),(30,'PIPO','777777','ESTATUTÁRIO',0,'Comissão','10h','240h','ENSINO MÉDIO COMPLETO',NULL,NULL,NULL,NULL,NULL,304,1),(31,'WREWRWRWE','777777','ESTATUTÁRIO',1,'Aposentado','30h','150h','ENSINO FUNDAMENTAL INCOMPLETO',NULL,NULL,NULL,NULL,NULL,305,1),(32,'GEGE','213213','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,1,NULL,NULL,306,1),(33,'DEPELA','123123','ESTATUTÁRIO',1,'Técnico','20h','100h','ENSINO SUPERIOR COMPLETO',NULL,NULL,2,NULL,NULL,307,1),(34,'AIXI','123123','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,51,NULL,NULL,308,1),(35,'Analista de Recursos HumanosS','123123','CELETISTA',1,'Técnico','44h','240h','ENSINO SUPERIOR COMPLETO',NULL,NULL,0,NULL,NULL,309,1),(36,'ANALISTA DE RECURSOS','123123','CELETISTA',1,'Técnico','44h','240h','ENSINO SUPERIOR COMPLETO',NULL,NULL,0,NULL,NULL,310,1),(37,'Analista de Recursos HumanosSS','123123','CELETISTA',1,'Técnico','44h','240h','ENSINO SUPERIOR COMPLETO',NULL,NULL,0,NULL,NULL,311,1),(38,'DEPELAS','123123','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,12313123,NULL,NULL,312,1),(39,'DEPELASA','234234','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,4,NULL,NULL,313,1),(40,'DEPELASADAS','123123','CELETISTA',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,4,NULL,NULL,314,1),(41,'PEPELA','123123','CELETISTA',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,1,NULL,NULL,301,1),(42,'PEPELAS','123123','CELETISTA',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,1,NULL,NULL,301,1),(43,'PEPELASAS','123123','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,1,NULL,NULL,301,1),(44,'QEQEQEQEQW','132131','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,44,NULL,NULL,270,1),(45,'QQEWQEWQEQWE','123123','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,132123123,NULL,NULL,1,1),(46,'ZEPELAS','123123','CELETISTA',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,3131313,NULL,NULL,311,1),(47,'ASDASD','123123','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,0,NULL,NULL,35,1),(48,'PEPELASASA','123123','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,0,NULL,NULL,127,1),(49,'DGDFGDFGFDG','234234','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,4,NULL,NULL,149,1),(50,'GUARDIAAN HERO','123123','ESTATUTÁRIO',1,'Técnico','44h','220h','ENSINO MÉDIO COMPLETO',NULL,NULL,1,NULL,NULL,1,1);
/*!40000 ALTER TABLE `cargo_emprego` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carreira`
--

DROP TABLE IF EXISTS `carreira`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carreira` (
  `codigo_carreira` int NOT NULL AUTO_INCREMENT,
  `nome_carreira` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_carreira`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carreira`
--

LOCK TABLES `carreira` WRITE;
/*!40000 ALTER TABLE `carreira` DISABLE KEYS */;
INSERT INTO `carreira` VALUES (1,'Técnico');
/*!40000 ALTER TABLE `carreira` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classificados`
--

DROP TABLE IF EXISTS `classificados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classificados` (
  `cpf_classificado` varchar(11) NOT NULL,
  `nome_classificado` varchar(45) DEFAULT NULL,
  `email_classificado` varchar(255) DEFAULT NULL,
  `data_nascimento_classificado` date DEFAULT NULL,
  `sexo_classificado` char(1) DEFAULT NULL,
  `nacionalidade_classificado` varchar(50) DEFAULT NULL,
  `rg_classificado` varchar(12) DEFAULT NULL,
  `orgao_expedidor_rg_classificado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cpf_classificado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classificados`
--

LOCK TABLES `classificados` WRITE;
/*!40000 ALTER TABLE `classificados` DISABLE KEYS */;
INSERT INTO `classificados` VALUES ('44262543889','MICHEL ANTONIO VIEIRA','MICHELANTONIO_GTI@HOTMAIL.COM','1994-09-16','M','BRASILEIRO','497447708',NULL);
/*!40000 ALTER TABLE `classificados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concurso_publico`
--

DROP TABLE IF EXISTS `concurso_publico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `concurso_publico` (
  `codigo_concurso` int NOT NULL AUTO_INCREMENT,
  `numero_concurso` varchar(3) DEFAULT NULL,
  `ano_concurso` year DEFAULT NULL,
  `situacao_concurso` varchar(13) DEFAULT NULL,
  `fk_matricula_responsavel_concurso` int NOT NULL,
  `fk_codigo_banca` int NOT NULL,
  PRIMARY KEY (`codigo_concurso`,`fk_matricula_responsavel_concurso`,`fk_codigo_banca`),
  KEY `fk_matricula_responsavel_concurso_idx` (`fk_matricula_responsavel_concurso`),
  KEY `fk_codigo_banca_idx` (`fk_codigo_banca`),
  CONSTRAINT `fk_codigo_banca` FOREIGN KEY (`fk_codigo_banca`) REFERENCES `banca` (`codigo_banca`),
  CONSTRAINT `fk_matricula_responsavel_concurso` FOREIGN KEY (`fk_matricula_responsavel_concurso`) REFERENCES `cadastro_funcionario` (`matricula_funcionario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concurso_publico`
--

LOCK TABLES `concurso_publico` WRITE;
/*!40000 ALTER TABLE `concurso_publico` DISABLE KEYS */;
INSERT INTO `concurso_publico` VALUES (1,'1',2023,'HOMOLOGADO',1,1),(2,'2',2023,'EM ANDAMENTO',1,1);
/*!40000 ALTER TABLE `concurso_publico` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `listadeclassificados`
--

DROP TABLE IF EXISTS `listadeclassificados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listadeclassificados` (
  `fk_codigo_concurso` int NOT NULL,
  `fk_cpf_classificado` varchar(11) NOT NULL,
  `numero_classificacao` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`fk_codigo_concurso`,`fk_cpf_classificado`),
  KEY `fk_cpf_classificado_idx` (`fk_cpf_classificado`),
  KEY `fk_cpf_classificado_listadeclassificados_idx` (`fk_cpf_classificado`),
  CONSTRAINT `fk_codigo_concurso_listadeclassificados` FOREIGN KEY (`fk_codigo_concurso`) REFERENCES `concurso_publico` (`codigo_concurso`),
  CONSTRAINT `fk_cpf_classificado_listadeclassificados` FOREIGN KEY (`fk_cpf_classificado`) REFERENCES `classificados` (`cpf_classificado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listadeclassificados`
--

LOCK TABLES `listadeclassificados` WRITE;
/*!40000 ALTER TABLE `listadeclassificados` DISABLE KEYS */;
INSERT INTO `listadeclassificados` VALUES (1,'44262543889','1');
/*!40000 ALTER TABLE `listadeclassificados` ENABLE KEYS */;
UNLOCK TABLES;

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
-- Table structure for table `tabela_salarial`
--

DROP TABLE IF EXISTS `tabela_salarial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabela_salarial` (
  `codigo_tabela_salarial` int NOT NULL AUTO_INCREMENT,
  `nome_da_tabela_salarial` varchar(45) DEFAULT NULL,
  `fk_codigo_carreira` int NOT NULL,
  PRIMARY KEY (`codigo_tabela_salarial`),
  KEY `fk_codigo_carreira_idx` (`fk_codigo_carreira`),
  CONSTRAINT `fk_codigo_carreira` FOREIGN KEY (`fk_codigo_carreira`) REFERENCES `carreira` (`codigo_carreira`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabela_salarial`
--

LOCK TABLES `tabela_salarial` WRITE;
/*!40000 ALTER TABLE `tabela_salarial` DISABLE KEYS */;
INSERT INTO `tabela_salarial` VALUES (1,'Tabela de Vencimentos',1);
/*!40000 ALTER TABLE `tabela_salarial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_ato`
--

DROP TABLE IF EXISTS `tipo_ato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_ato` (
  `codigo_tipo_ato` int NOT NULL,
  `descricao_tipo_ato` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_tipo_ato`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_ato`
--

LOCK TABLES `tipo_ato` WRITE;
/*!40000 ALTER TABLE `tipo_ato` DISABLE KEYS */;
INSERT INTO `tipo_ato` VALUES (1,'Lei'),(2,'Portaria');
/*!40000 ALTER TABLE `tipo_ato` ENABLE KEYS */;
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

--
-- Table structure for table `vencimentos`
--

DROP TABLE IF EXISTS `vencimentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vencimentos` (
  `codigo_vencimento` int NOT NULL AUTO_INCREMENT,
  `referencia_vencimento` varchar(45) NOT NULL,
  `faixa_vencimento` varchar(45) DEFAULT NULL,
  `grau_vencimento` varchar(45) NOT NULL,
  `valor_vencimento` decimal(10,2) NOT NULL,
  `fk_codigo_tabela_salarial` int NOT NULL,
  PRIMARY KEY (`codigo_vencimento`),
  KEY `fk_codigo_tabela_salarial_idx` (`fk_codigo_tabela_salarial`),
  CONSTRAINT `fk_codigo_tabela_salarial` FOREIGN KEY (`fk_codigo_tabela_salarial`) REFERENCES `tabela_salarial` (`codigo_tabela_salarial`)
) ENGINE=InnoDB AUTO_INCREMENT=319 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vencimentos`
--

LOCK TABLES `vencimentos` WRITE;
/*!40000 ALTER TABLE `vencimentos` DISABLE KEYS */;
INSERT INTO `vencimentos` VALUES (1,'1','1','A',1099.26,1),(2,'1','1','B',1209.19,1),(3,'1','1','C',1330.11,1),(4,'1','1','D',1463.12,1),(5,'1','1','E',1609.43,1),(6,'1','1','F',1770.37,1),(7,'1','1','G',1947.41,1),(8,'2','1','A',1132.41,1),(9,'2','1','B',1245.65,1),(10,'2','1','C',1370.21,1),(11,'2','1','D',1507.23,1),(12,'2','1','E',1657.96,1),(13,'2','1','F',1823.75,1),(14,'2','1','G',2006.13,1),(15,'3','1','A',1167.18,1),(16,'3','1','B',1283.90,1),(17,'3','1','C',1412.29,1),(18,'3','1','D',1553.51,1),(19,'3','1','E',1708.87,1),(20,'3','1','F',1879.75,1),(21,'3','1','G',2067.73,1),(35,'4','1','A',1224.65,1),(36,'4','1','B',1347.12,1),(37,'4','1','C',1481.83,1),(38,'4','1','D',1630.01,1),(39,'4','1','E',1793.01,1),(40,'4','1','F',1972.31,1),(41,'4','1','G',2169.54,1),(42,'5','1','A',1242.05,1),(43,'5','1','B',1366.25,1),(44,'5','1','C',1502.88,1),(45,'5','1','D',1653.16,1),(46,'5','1','E',1818.48,1),(47,'5','1','F',2000.33,1),(48,'5','1','G',2200.36,1),(49,'6','1','A',1282.34,1),(50,'6','1','B',1410.58,1),(51,'6','1','C',1551.63,1),(52,'6','1','D',1706.80,1),(53,'6','1','E',1877.48,1),(54,'6','1','F',2065.22,1),(55,'6','1','G',2271.75,1),(56,'7','1','A',1324.64,1),(57,'7','1','B',1457.10,1),(58,'7','1','C',1602.81,1),(59,'7','1','D',1763.09,1),(60,'7','1','E',1936.40,1),(61,'7','1','F',2133.34,1),(62,'7','1','G',2346.68,1),(63,'8','1','A',1369.02,1),(64,'8','1','B',1505.92,1),(65,'8','1','C',1656.51,1),(66,'8','1','D',1822.16,1),(67,'8','1','E',2004.38,1),(68,'8','1','F',2204.82,1),(69,'8','1','G',2425.30,1),(70,'9','1','A',1415.67,1),(71,'9','1','B',1557.24,1),(72,'9','1','C',1712.96,1),(73,'9','1','D',1884.26,1),(74,'9','1','E',2072.69,1),(75,'9','1','F',2279.96,1),(76,'9','1','G',2507.95,1),(77,'10','1','A',1464.64,1),(78,'10','1','B',1611.10,1),(79,'10','1','C',1772.21,1),(80,'10','1','D',1949.44,1),(81,'10','1','E',2144.38,1),(82,'10','1','F',2358.82,1),(83,'10','1','G',2594.70,1),(84,'11','1','A',1516.06,1),(85,'11','1','B',1667.66,1),(86,'11','1','C',1834.43,1),(87,'11','1','D',2017.87,1),(88,'11','1','E',2219.66,1),(89,'11','1','F',2441.62,1),(90,'11','1','G',2685.79,1),(91,'12','1','A',1569.97,1),(92,'12','1','B',1726.97,1),(93,'12','1','C',1899.67,1),(94,'12','1','D',2089.64,1),(95,'12','1','E',2298.60,1),(96,'12','1','F',2528.46,1),(97,'12','1','G',2781.31,1),(109,'13','1','A',1626.67,1),(110,'13','1','B',1789.33,1),(111,'13','1','C',1968.27,1),(112,'13','1','D',2165.09,1),(113,'13','1','E',2381.60,1),(114,'13','1','F',2619.76,1),(115,'13','1','G',2881.74,1),(116,'14','1','A',1686.16,1),(117,'14','1','B',1854.78,1),(118,'14','1','C',2040.25,1),(119,'14','1','D',2244.28,1),(120,'14','1','E',2468.71,1),(121,'14','1','F',2715.58,1),(122,'14','1','G',2987.14,1),(123,'15','1','A',1748.66,1),(124,'15','1','B',1923.52,1),(125,'15','1','C',2115.87,1),(126,'15','1','D',2327.46,1),(127,'15','1','E',2560.21,1),(128,'15','1','F',2816.23,1),(129,'15','1','G',3097.85,1),(130,'16','1','A',1814.25,1),(131,'16','1','B',1995.67,1),(132,'16','1','C',2195.24,1),(133,'16','1','D',2414.76,1),(134,'16','1','E',2656.74,1),(135,'16','1','F',2921.86,1),(136,'16','1','G',3214.05,1),(137,'17','1','A',1883.14,1),(138,'17','1','B',2071.46,1),(139,'17','1','C',2278.60,1),(140,'17','1','D',2506.47,1),(141,'17','1','E',2757.11,1),(142,'17','1','F',3032.82,1),(143,'17','1','G',3336.10,1),(144,'18','1','A',1955.47,1),(145,'18','1','B',2151.02,1),(146,'18','1','C',2366.12,1),(147,'18','1','D',2602.73,1),(148,'18','1','E',2863.00,1),(149,'18','1','F',3149.30,1),(150,'18','1','G',3464.23,1),(151,'19','1','A',2031.39,1),(152,'19','1','B',2234.53,1),(153,'19','1','C',2457.98,1),(154,'19','1','D',2703.78,1),(155,'19','1','E',2974.16,1),(156,'19','1','F',3271.57,1),(157,'19','1','G',3598.73,1),(158,'20','1','A',2111.16,1),(159,'20','1','B',2322.27,1),(160,'20','1','C',2554.50,1),(161,'20','1','D',2809.95,1),(162,'20','1','E',3090.95,1),(163,'20','1','F',3400.04,1),(164,'20','1','G',3740.04,1),(165,'21','1','A',2194.90,1),(166,'21','1','B',2414.39,1),(167,'21','1','C',2655.82,1),(168,'21','1','D',2921.41,1),(169,'21','1','E',3213.55,1),(170,'21','1','F',3534.90,1),(171,'21','1','G',3888.39,1),(172,'22','1','A',2282.80,1),(173,'22','1','B',2511.08,1),(174,'22','1','C',2762.19,1),(175,'22','1','D',3038.41,1),(176,'22','1','E',3342.25,1),(177,'22','1','F',3676.48,1),(178,'22','1','G',4044.13,1),(179,'23','1','A',2375.13,1),(180,'23','1','B',2612.64,1),(181,'23','1','C',2873.91,1),(182,'23','1','D',3161.30,1),(183,'23','1','E',3477.43,1),(184,'23','1','F',3825.17,1),(185,'23','1','G',4207.69,1),(186,'24','1','A',2472.04,1),(187,'24','1','B',2719.25,1),(188,'24','1','C',2991.17,1),(189,'24','1','D',3290.29,1),(190,'24','1','E',3619.32,1),(191,'24','1','F',3981.25,1),(192,'24','1','G',4379.38,1),(193,'25','1','A',2573.85,1),(194,'25','1','B',2831.23,1),(195,'25','1','C',3114.35,1),(196,'25','1','D',3425.79,1),(197,'25','1','E',3768.37,1),(198,'25','1','F',4145.20,1),(199,'25','1','G',4559.72,1),(200,'26','1','A',2680.66,1),(201,'26','1','B',2948.73,1),(202,'26','1','C',3243.60,1),(203,'26','1','D',3567.96,1),(204,'26','1','E',3924.75,1),(205,'26','1','F',4317.23,1),(206,'26','1','G',4748.95,1),(207,'27','1','A',2792.91,1),(208,'27','1','B',3072.20,1),(209,'27','1','C',3379.42,1),(210,'27','1','D',3717.36,1),(211,'27','1','E',4089.09,1),(212,'27','1','F',4498.00,1),(213,'27','1','G',4947.80,1),(214,'28','1','A',2910.70,1),(215,'28','1','B',3201.77,1),(216,'28','1','C',3521.94,1),(217,'28','1','D',3874.14,1),(218,'28','1','E',4261.55,1),(219,'28','1','F',4687.70,1),(220,'28','1','G',5156.48,1),(263,'29','1','A',3034.43,1),(264,'29','1','B',3337.87,1),(265,'29','1','C',3671.66,1),(266,'29','1','D',4038.82,1),(267,'29','1','E',4442.70,1),(268,'29','1','F',4886.98,1),(269,'29','1','G',5375.67,1),(270,'30','1','A',3164.30,1),(271,'30','1','B',3480.73,1),(272,'30','1','C',3828.60,1),(273,'30','1','D',4211.68,1),(274,'30','1','E',4632.85,1),(275,'30','1','F',5096.13,1),(276,'30','1','G',5605.75,1),(277,'31','1','A',3300.70,1),(278,'31','1','B',3630.77,1),(279,'31','1','C',3993.85,1),(280,'31','1','D',4393.24,1),(281,'31','1','E',4832.56,1),(282,'31','1','F',5315.82,1),(283,'31','1','G',5847.40,1),(284,'32','1','A',3443.91,1),(285,'32','1','B',3788.30,1),(286,'32','1','C',4167.13,1),(287,'32','1','D',4583.84,1),(288,'32','1','E',5042.22,1),(289,'32','1','F',5546.44,1),(290,'32','1','G',6101.09,1),(291,'33','1','A',3594.29,1),(292,'33','1','B',3953.72,1),(293,'33','1','C',4349.09,1),(294,'33','1','D',4784.00,1),(295,'33','1','E',5493.55,1),(296,'33','1','F',5788.64,1),(297,'33','1','G',6367.50,1),(298,'34','1','A',3752.17,1),(299,'34','1','B',4127.38,1),(300,'34','1','C',4540.12,1),(301,'34','1','D',4994.13,1),(302,'34','1','E',5493.55,1),(303,'34','1','F',6042.90,1),(304,'34','1','G',6647.19,1),(305,'35','1','A',3917.95,1),(306,'35','1','B',4309.75,1),(307,'35','1','C',4740.72,1),(308,'35','1','D',5214.80,1),(309,'35','1','E',5736.28,1),(310,'35','1','F',6309.90,1),(311,'35','1','G',6940.89,1),(312,'RME','1','A',12137.90,1),(313,'RME','1','B',13351.69,1),(314,'RME','1','C',14686.85,1),(315,'RME','1','D',16155.54,1),(316,'RME','1','E',17771.09,1),(317,'RME','1','F',19548.20,1),(318,'RME','1','G',21503.02,1);
/*!40000 ALTER TABLE `vencimentos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-15 22:01:56
