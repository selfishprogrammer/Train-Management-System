-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2020 at 05:51 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `electricmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `usern` varchar(30) NOT NULL,
  `name` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`usern`, `name`, `phone`) VALUES
('oiuyt', 'kjhf', 'jkloi'),
('rahuljha3246@gmail.com', 'Rahul Jha', '6296002855');

-- --------------------------------------------------------

--
-- Table structure for table `cancel`
--

CREATE TABLE `cancel` (
  `T-Id` varchar(20) NOT NULL,
  `pnr_no` varchar(20) NOT NULL,
  `train_no` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cancel`
--

INSERT INTO `cancel` (`T-Id`, `pnr_no`, `train_no`) VALUES
('45636', '2589', '15369UP');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('kjhf', '90089'),
('Rahul Jha', '68015');

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `name` varchar(20) NOT NULL,
  `t_no` varchar(20) NOT NULL,
  `pnr_no` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `p-no` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passenger`
--

INSERT INTO `passenger` (`name`, `t_no`, `pnr_no`, `address`, `nationality`, `gender`, `p-no`) VALUES
('Rahul Jha', '15423UP', '258963', 'Banarhat', 'Indian', 'Male', '6296002855');

-- --------------------------------------------------------

--
-- Table structure for table `sector`
--

CREATE TABLE `sector` (
  `capicity` varchar(50) NOT NULL,
  `class_no` varchar(50) NOT NULL,
  `class_nam` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sector`
--

INSERT INTO `sector` (`capicity`, `class_no`, `class_nam`) VALUES
('500', '120', 'BUSSINESS'),
('20000', '40', 'BC,SC,FC'),
('20000', '40', 'BC,SC,FC'),
('20000', '40', 'BC,SC,FC');

-- --------------------------------------------------------

--
-- Table structure for table `traininformation`
--

CREATE TABLE `traininformation` (
  `t_no` varchar(10) NOT NULL,
  `t_name` varchar(30) NOT NULL,
  `src` varchar(30) NOT NULL,
  `dest` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `traininformation`
--

INSERT INTO `traininformation` (`t_no`, `t_name`, `src`, `dest`) VALUES
('15369UP', 'CAPITAL EXPRESS', 'SILIGURI', 'PATNA'),
('15369DOWN', 'CAPITAL EXPRESS', 'PATNA', 'MUMBAI'),
('25461UP', 'MAHANANDA EXPRESS', 'DELLHI', 'SILIGURI'),
('25461DOWN', 'MAHANANDA EXPRESS', 'SILIGURI', 'DELLHI');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
