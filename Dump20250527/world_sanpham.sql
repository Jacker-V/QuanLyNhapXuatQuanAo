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
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `idsanpham` int NOT NULL AUTO_INCREMENT,
  `TenSanPham` varchar(100) NOT NULL,
  `NhaCungCap` varchar(100) NOT NULL,
  `GiaNhap` decimal(15,3) NOT NULL,
  `NgayNhap` varchar(20) DEFAULT NULL,
  `Size` varchar(10) NOT NULL,
  `Mau` varchar(30) NOT NULL,
  `SoLuong` int NOT NULL,
  PRIMARY KEY (`idsanpham`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES (1,'Áo Thun Nam','Công ty May Việt Tiến',120000.000,'2025-05-01','L','Trắng',0),(2,'Quần Jean Nữ','Công ty Jeans Sài Gòn',250000.000,'2025-05-02','M','Xanh',7),(3,'Váy Công Sở','Thời Trang Eva',300000.000,'2025-05-05','S','Đen',9),(4,'Áo Khoác Nam','450000.0',450000.000,'2025-05-07','XLL','Xám',10),(5,'Chân Váy Nữ','200000.0',200000.000,'2025-05-08','M','Hồng',25),(7,'hh','hhh',12.000,'20-5-2025','S','ĐỎ',12),(8,'TTH','TTH',23.000,'2021-05-21','S','Đen',23),(9,'Áo Khoác Nam','450000.0',450000.000,'2025-05-07','X','Xám',1),(10,'Váy Công Sở','Thời Trang Eva',300000.000,'2025-05-05','S','Đen',1),(12,'Áo Khoác Nam','450000.0',450000.000,'2025-05-07','X','Xám',-2),(14,'Áo Khoác Nam','VHH',450000.000,'2025-05-07','XLL','Xám',123);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
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
