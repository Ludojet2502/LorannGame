SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllElements` (IN `ctable` CHAR(255))  NO SQL
SELECT x, y, `type`
FROM ctable$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findElementByPos` (IN `ctable` CHAR(255), IN `x` INT, IN `y` INT)  NO SQL
SELECT x, y, `type`
FROM ctable
WHERE ctable.x = x
AND ctable.y = y$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findElementByType` (IN `ctable` CHAR(255), IN `type` CHAR(1))  NO SQL
SELECT x, y, `type`
FROM ctable
WHERE ctable.`type` = type$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `level_0`
--

CREATE TABLE `level_0` (
  `x` int(8) NOT NULL,
  `y` int(8) NOT NULL,
  `type` char(1) NOT NULL
) ENGINE=InnoDB;

--
-- Contenu de la table `level_0`
--

INSERT INTO `level_0` (`x`, `y`, `type`) VALUES
(0, 0, ' ');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `level_0`
--
ALTER TABLE `level_0`
  ADD PRIMARY KEY (`x`, `y`);
  
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
