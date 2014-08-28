CREATE DATABASE  IF NOT EXISTS `enbw01` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `enbw01`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: enbw01
-- ------------------------------------------------------
-- Server version	5.6.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `news`
--

CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cat_id` int(10) NOT NULL DEFAULT '0',
  `name` varchar(50) NOT NULL DEFAULT '- Namen fuer die Rubrik angeben -',
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8 COMMENT='Alle Rubriken';

INSERT INTO `categories` (`id`, `cat_id`, `name`, `timestamp`) VALUES
	(70, 0, 'Generales', '2014-05-05 12:22:09'),
	(71, 10, 'Deportes', '2014-05-05 12:22:09'),
	(72, 20, 'Internacionales', '2014-05-05 12:22:09'),
	(73, 30, 'Locales', '2014-05-05 12:22:09');


CREATE TABLE IF NOT EXISTS `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `newsid` int(10) NOT NULL,
  `title` varchar(160) NOT NULL,
  `description` varchar(1024) NOT NULL,
  `categoryid` int(10) NOT NULL DEFAULT '0',
  `text` varchar(16384) DEFAULT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_news_categories` (`categoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COMMENT='Alle Nachrichten';

INSERT INTO `news` (`id`, `newsid`, `title`, `description`, `categoryid`, `text`, `createdate`) VALUES
	(26, 1, 'Real Madrid Gana', 'Real Campeon', 10, 'Real madrid se corono campeon de la copa del rey en Madrid, ganadole por 2-0 al equipo del Valencia', '2014-04-08 16:43:10'),
	(27, 2, 'Real Madrid Pierde','Real Eliminado', 10,'Real madrid fue eliminado de la copa del rey en Madrid, perdiendo por 0-2 frente al equipo del Atletico de Madrid' , '2014-04-08 16:43:11'),
	(28, 3, 'Real Madrid Empata', 'Real a un punto de la eliminacion', 10, 'Real madrid esta en peligro en la copa del rey en Madrid, por haber empatado por 2-2 frente al equipo del Barcelona', '2014-04-08 16:43:12');