-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 10, 2024 at 02:06 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `centre_kin`
--

-- --------------------------------------------------------

--
-- Table structure for table `fourniture`
--

DROP TABLE IF EXISTS `fourniture`;
CREATE TABLE IF NOT EXISTS `fourniture` (
  `id_fourn` int NOT NULL AUTO_INCREMENT,
  `nomfourn` varchar(30) NOT NULL,
  `quantite` int NOT NULL,
  `origine` varchar(20) NOT NULL,
  PRIMARY KEY (`id_fourn`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `fourniture`
--

INSERT INTO `fourniture` (`id_fourn`, `nomfourn`, `quantite`, `origine`) VALUES
(1, 'lit de massage', 2, 'Chine'),
(3, 'Goniometre', 4, ' G Industry'),
(5, 'Tapis roulant', 10, 'T2000'),
(6, 'Ultrason', 8, 'Allemagne');

-- --------------------------------------------------------

--
-- Table structure for table `partenaire`
--

DROP TABLE IF EXISTS `partenaire`;
CREATE TABLE IF NOT EXISTS `partenaire` (
  `id_partenaire` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `link` varchar(255) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`id_partenaire`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `partenaire`
--

INSERT INTO `partenaire` (`id_partenaire`, `nom`, `link`, `email`) VALUES
(4, 'Croix-Rouge', 'croixrouge.bi http://croixrouge.bi', 'croixrouge@gmail.com'),
(3, 'HMK', 'https://www.hmkamenge.bi', 'hopitalmil@gmail.com'),
(5, 'UNFPA Burundi', 'https://burundi.unfpa.org ', 'unfpa@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `id_patient` varchar(20) NOT NULL,
  `Nom_patient` varchar(15) DEFAULT NULL,
  `Prenom_patient` varchar(15) DEFAULT NULL,
  `Date_naiss` varchar(20) DEFAULT NULL,
  `Telephone` int DEFAULT NULL,
  `Adresse` varchar(50) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Num_carte_assur_maladie` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_patient`)
) ENGINE=MyISAM AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id_patient`, `Nom_patient`, `Prenom_patient`, `Date_naiss`, `Telephone`, `Adresse`, `Email`, `Num_carte_assur_maladie`) VALUES
('24', 'Sakubu', 'Sem', '2024-06-27', 2147483647, 'Kiriri', 'sem@gmail.com', '35678333'),
('18', 'Kadogo', 'Franck', '2002-09-16', 6234095, 'Carama', 'franck@gmail.com', '7683993'),
('19', 'Birori', 'Anne', '1979-06-06', 76874395, 'Bwiza', 'anne@gmail.com', '34593855'),
('20', 'Ciramunda', 'Ange', '1992-10-06', 77987546, 'Rohero', 'ange@gmail.com', '348937'),
('21', 'Dusabe', 'Délice', '1996-06-05', 69876543, 'Mutanga', 'delice@gmail.com', '743930044'),
('22', 'Fungezi', 'Arsene', '2002-07-10', 7123975, 'Carama', 'arsene@gmail.com', '746389494'),
('23', 'Kadogo', 'Franck   ', '2024-07-02', 87888888, 'Carama   ', 'franck@gmail.com', '3773788323  '),
('17', 'Ingabire', 'Patient', '2024-05-02', 67985998, 'kajaga', 'patient@gmail.com', '56788900'),
('16', 'Tuyisenge', 'Marie', '2024-01-01', 68934732, 'Kinama', 'marie@gmail.com', '57892044'),
('46', 'jjjjjjj', 'kkkkk', '2024-06-30', 71000876, 'Buyenzi', 'abdoul@gmail.com', '88888'),
('47', 'Sakubu', 'Sem', '2024-07-01', 7777, 'Kiriri', 'sem@gmail.com', '7888'),
('49', 'gushakakwimana', 'diomede', '1969-06-11', 678844553, 'Carama', 'franck@gmail.com', '8888888888888'),
('79', 'szd', 'bhdkj', '12', 565865, 'vjlhj', 'wdjwdq', '1213'),
('50', 'Irakoze', 'Ange', '23/09/1999', 76543451, 'Congo', 'ange@gmail.com', '6789404hfjfkf');

-- --------------------------------------------------------

--
-- Table structure for table `therapeute`
--

DROP TABLE IF EXISTS `therapeute`;
CREATE TABLE IF NOT EXISTS `therapeute` (
  `id_therapeute` varchar(20) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `specialite` varchar(30) NOT NULL,
  `telephone` int NOT NULL,
  `adresse` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`id_therapeute`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `therapeute`
--

INSERT INTO `therapeute` (`id_therapeute`, `nom`, `prenom`, `specialite`, `telephone`, `adresse`, `email`) VALUES
('4', 'Dupont', 'Jean', 'Masseur', 72398674, 'Rohero', 'jean@gmail.com'),
('3', 'Ingabire ', 'King', 'Aide-Soignant', 72397465, 'Kigobe', 'king@gmail.com'),
('5', 'Michael', 'Jon', 'Podologue', 71090000, 'Kamenge', 'michael@gmail.com'),
('6', 'Bentala', 'Malik', 'Ergotherapeute', 72908735, 'Asiatique', 'malik@gmail.com'),
('7', 'Said', 'Raj', 'Kinesitherapeute', 75382097, 'Bwiza', 'raj@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `traitement`
--

DROP TABLE IF EXISTS `traitement`;
CREATE TABLE IF NOT EXISTS `traitement` (
  `id_traitement` int NOT NULL,
  `id_patient` varchar(20) DEFAULT NULL,
  `id_therapeute` varchar(20) DEFAULT NULL,
  `Description_traitement` varchar(250) DEFAULT NULL,
  `Duree` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_traitement`),
  KEY `id_patient` (`id_patient`),
  KEY `id_therapeute` (`id_therapeute`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `traitement`
--

INSERT INTO `traitement` (`id_traitement`, `id_patient`, `id_therapeute`, `Description_traitement`, `Duree`) VALUES
(3, '5', '5', 'Ajout prothese', '2 mois'),
(6, '20', '23', 'Réeducation des affections du pied', '4 jours'),
(7, '21', '26', 'exercice de réeducation pour remarcher', '5 mois'),
(10, '18', '27', 'Evaluaation et diagnostic kinésitherapeutique', '1 heure'),
(23, '21', 'Michael', 'massage ', '2 jours'),
(12, '38-owppewodod', 'Said', 'pied', '3 jours'),
(15, '18-Kadogo', 'Bentala', 'Prothese', '6 jours');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
