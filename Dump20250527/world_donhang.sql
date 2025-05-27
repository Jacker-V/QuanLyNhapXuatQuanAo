-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: world
-- ------------------------------------------------------
-- Server version	9.2.0

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
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang` (
  `iddonhang` int NOT NULL AUTO_INCREMENT,
  `TenSanPham` varchar(100) DEFAULT NULL,
  `KhachHang` varchar(100) DEFAULT NULL,
  `Gia` decimal(15,3) DEFAULT NULL,
  `NgayXuat` varchar(20) DEFAULT NULL,
  `Size` varchar(10) DEFAULT NULL,
  `Mau` varchar(30) DEFAULT NULL,
  `SoLuong` int DEFAULT NULL,
  PRIMARY KEY (`iddonhang`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (1,'Áo Thun Nam','Công ty May Việt Tiến',150000.000,'2025-05-15','L','Trắng',3),(2,'Quần Jean Nữ','Công ty Jeans Sài Gòn',280000.000,'2025-05-16','M','Xanh',2),(4,'Áo Khoác Nam','Công ty Áo Khoác Bắc Giang',500000.000,'2025-05-17','XL','Xám',2),(5,'Chân Váy Nữ','Thời Trang Eva',220000.000,'2025-05-18','M','Hồng',4),(8,'Áo Thun Nam','VHH',120000.000,'21/5/2025','L','Trắng',2),(9,'Quần Jean Nữ','VHH',250000.000,'21/5/2025','M','Xanh',20),(10,'Áo Khoác Nam','VHH',450000.000,'21/5/2025','X','Xám',122),(12,'Áo Khoác Nam','VHH',450000.000,'2021-09-21','X','Xám',1),(13,'Áo Khoác Nam','VHH',450000.000,'2021-09-21','X','Xám',1),(14,'Áo Khoác Nam','VHH',450000.000,'2021-09-21','2234','Xám',1);
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-27 19:22:14
