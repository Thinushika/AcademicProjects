-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 11, 2018 at 06:20 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `xdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminacc`
--

CREATE TABLE `adminacc` (
  `username` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `seq` varchar(50) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminacc`
--

INSERT INTO `adminacc` (`username`, `name`, `seq`, `answer`, `password`) VALUES
('admin', 'team1', 'what is my coutry?', 'america', '123');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `bookid` varchar(50) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `booktitle` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `edition` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  `bookshelf` varchar(50) NOT NULL,
  `rowno` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bookid`, `isbn`, `booktitle`, `author`, `edition`, `type`, `price`, `publisher`, `bookshelf`, `rowno`) VALUES
('0001', 'ISBN', 'Book dnjknfjks', 'Author', '5th', 'Book janjn', '6737', 'zhbh', 'Book Shelf', 'Row No'),
('0004', 'sbhd', 'ddddd', 'dddddddd', 'dddddddd', 'ddd', 'dddddd', 'ddddd', 'ddddd', 'ajvsB'),
('000645', 'hvbsb', ' ddddddd', 'sssss', 'ssssssssss', 'sssssssss', 'sssssss', 'ssssssss', 'sssssss', 'sssssssss'),
('00087', 'dssssssssd', ' dddddddd', 'dddddd', 'sssssss', 'aaaaaaa', 'wwww', 'ww', '22', '45'),
('007', 'ffff', 'qwqw', 'wwwww', 'ddddddd', 'xxx', 'xxxxxx', 'xxx', 'xx', 'xxx'),
('fheef', 'ffhh', 'hj', 'kluiy', 'tutu', 'utiu3', '1000', 'hgjuk', 'yuky', '67'),
('hhhhhh', 'sgchbfvgh', ' hgvghgg', 'cgdcfgf', 'fytyf', 'dtdt', 'tdrsdy', 'xfxd', 'xfdx', 'sxtd'),
('vghV', 'sss', ' dddd', 'dd', 'dddddd', 'ddddddd', ' ddddd', 'dddddddddd', 'dddddddd', '8');

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE `issuebook` (
  `studentid` varchar(50) NOT NULL,
  `regno` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `bookid` varchar(50) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `booktitle` varchar(50) NOT NULL,
  `issuedate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`studentid`, `regno`, `firstname`, `bookid`, `isbn`, `booktitle`, `issuedate`) VALUES
('', '', '', '', '', '', '10/7/18'),
('000897', 'dddddd', 'ddddddddd', '000645', 'hvbsb', ' ddddddd', '10/4/18'),
('006', 'itt/15/16/006', 'kaveesha', '456', 'ict546', ' ict', '10/4/18');

-- --------------------------------------------------------

--
-- Table structure for table `loggin`
--

CREATE TABLE `loggin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loggin`
--

INSERT INTO `loggin` (`username`, `password`) VALUES
('admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

CREATE TABLE `returnbook` (
  `studentid` varchar(50) NOT NULL,
  `regno` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `bookid` varchar(50) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `booktitle` varchar(50) NOT NULL,
  `issuedate` varchar(50) NOT NULL,
  `returndate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `returnbook`
--

INSERT INTO `returnbook` (`studentid`, `regno`, `firstname`, `bookid`, `isbn`, `booktitle`, `issuedate`, `returndate`) VALUES
('000897', 'dddddd', 'ddddddddd', '000645', 'hvbsb', ' ffff', '10/10/18', '10/17/18'),
('0009', 'dddddd', 'dddddddddd', '00087', 'hvbsb', ' ddddddd', '10/4/18', '11/23/18'),
('0081', 'ghgjshjahj', 'sahsghgha', '0001', 'ISBN', 'Book dnjknfjks', '10/3/18', '11/15/18'),
('1213', '30', 'aaajhgg', '0001', 'ISBN', 'Book dnjknfjks', '10/4/18', '10/24/18');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `studentid` varchar(50) NOT NULL,
  `regno` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `grade` varchar(50) NOT NULL,
  `contactno` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`studentid`, `regno`, `firstname`, `lastname`, `grade`, `contactno`, `email`) VALUES
('0006', 'itt/0006', 'cccccc', 'cccccccccc', 'ccccccccc', 'ccccccc', 'ccccccc'),
('0009', 'dddddd', 'dddddddddd', 'ddddddd', 'dddd', 'dddd', 'avbsja'),
('006', 'itt/15/16/006', 'kaveesha', 'rashali', '13', '0411543267', 'kavee@gmail.com'),
('0081', 'pavani', '008', '10', '0711562625', 'thinupavani@gmai.com', 'dahanayake'),
('056', 'vgvgg', 'drdrt', 'sesedd', 'sdsdd', 'szss', 'rfdtdff'),
('1213', '30', 'aaajhgg', 'dcgd', '1', '098356', 'fdgdfhfghf');

-- --------------------------------------------------------

--
-- Table structure for table `useracc`
--

CREATE TABLE `useracc` (
  `username` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `seq` varchar(50) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `useracc`
--

INSERT INTO `useracc` (`username`, `name`, `seq`, `answer`, `password`) VALUES
('kavee', 'kaveesha', 'What is your childhood friend name?', 'cat', '999'),
('varu', 'varunya', 'What is your pet\'s name?', 'nicky', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminacc`
--
ALTER TABLE `adminacc`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`bookid`);

--
-- Indexes for table `issuebook`
--
ALTER TABLE `issuebook`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `loggin`
--
ALTER TABLE `loggin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `returnbook`
--
ALTER TABLE `returnbook`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `useracc`
--
ALTER TABLE `useracc`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
