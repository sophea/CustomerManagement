-- phpMyAdmin SQL Dump
-- version 4.2.10
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Jan 28, 2017 at 02:09 PM
-- Server version: 5.5.38
-- PHP Version: 5.6.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `customer-managment`
--

-- --------------------------------------------------------

--
-- Table structure for table `td_customer`
--

CREATE TABLE `td_customer` (
`cus_id` int(20) NOT NULL,
  `cus_first_name` varchar(35) COLLATE utf8_unicode_ci NOT NULL,
  `cus_last_name` varchar(35) COLLATE utf8_unicode_ci NOT NULL,
  `cus_gender` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `cus_email_address` varchar(35) COLLATE utf8_unicode_ci NOT NULL,
  `cus_DOB` date DEFAULT NULL,
  `cus_address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_phoneNumber` varchar(35) COLLATE utf8_unicode_ci NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `td_customer`
--

INSERT INTO `td_customer` (`cus_id`, `cus_first_name`, `cus_last_name`, `cus_gender`, `cus_email_address`, `cus_DOB`, `cus_address`, `cus_phoneNumber`, `date_created`, `date_updated`) VALUES
(1, 'Sok', 'San', 'Male', 'soksan@gmail.com', '2017-01-01', 'Phnom Penh', '012 00 00 01', '2017-01-28 13:02:28', '2017-01-28 13:02:35'),
(2, 'Mean', 'Heng', 'Male', 'meanheng@gmail.com', '2017-01-01', 'Phnom Penh', '012 00 00 02', '2017-01-28 13:03:11', NULL),
(3, 'Mey', 'Long', 'Female', 'mey.long@gmail.com', '2017-01-01', 'Phnom Penh', '012 00 00 03', '2017-01-28 13:03:41', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `td_customer`
--
ALTER TABLE `td_customer`
 ADD PRIMARY KEY (`cus_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `td_customer`
--
ALTER TABLE `td_customer`
MODIFY `cus_id` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
