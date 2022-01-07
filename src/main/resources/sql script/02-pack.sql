CREATE DATABASE  IF NOT EXISTS `pack`;
USE `pack`;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;

CREATE TABLE `productproduct` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `weight` FLOAT NOT NULL,
  `value` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

