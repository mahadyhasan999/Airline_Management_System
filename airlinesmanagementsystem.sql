-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 02, 2022 at 05:48 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airlinesmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminpanel`
--

CREATE TABLE `adminpanel` (
  `flight_name` varchar(100) NOT NULL,
  `class` varchar(50) NOT NULL,
  `availability` varchar(50) NOT NULL,
  `seat` int(20) NOT NULL,
  `price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adminpanel`
--

INSERT INTO `adminpanel` (`flight_name`, `class`, `availability`, `seat`, `price`) VALUES
('Tunika', 'VIP', 'Yes', 20, 4500),
('stfhj', 'Bussiness', 'Yes', 54, 955),
('ghgh ', 'Economy', 'Yes', 8, 452),
('fghffg', 'Economy', 'No', 48, 1255);

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `first_name` varchar(100) NOT NULL,
  `middle_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `passport` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `role` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`first_name`, `middle_name`, `last_name`, `email`, `phone`, `passport`, `password`, `address`, `role`) VALUES
('Anika', '', 'Jahan', 'anika@gmail.com', '123456789', '123456789', 'admin', 'Nabinagar', 'Admin'),
('Banna', 'Debi', 'Sarker', 'banna@gmail.com', '123456789', '123456789', 'admin', 'Ashulia', 'Admin'),
('imran', 'khan', '', 'ikhello@gmail.com', '01749113755', 'sdfshf47dskjfhsdghw', '123456', 'dhaka', 'Passenger'),
('Partho', '', 'Banik', 'partho@gmail.com', '123456789', '123456789', 'admin', 'Dhamrai', 'Admin'),
('Md', 'Rakib', 'Mia', 'rakibmia@gmail.com', '0123456789', '1234567890', '12345', 'Uganda', 'Passenger'),
('Sayem', 'Imran', 'Khan', 'sayem@gmail.com', '123456789', '123456789', 'admin', 'Baraipara', 'Admin'),
('sulu', 'm', 'm', 'sultan.cse@gmail.com', '01733333333', '12121212', '1234', 'pabna', 'Passenger');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
