-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2021 at 05:01 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `taikhoansodep`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `note` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `image_customer` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `image_idcard_front` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `image_idcard_back` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `name`, `email`, `phone`, `address`, `note`, `image_customer`, `image_idcard_front`, `image_idcard_back`, `created_at`, `updated_at`, `status`) VALUES
(1, 'nhoas48ssssss88', 'nguyenhaob.ddd8888ss@gmal.com', '1245677dds7', 'Đan Phượng', 'hahahaha', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '2021-03-03 02:37:14', '2021-03-03 09:46:43', 1),
(2, 'nhoas4888', 'nguyenhaob.ddd8888ss@gmal.com', '1245677dds7', 'Đan Phượng', 'hahahahad2  ssss', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '2021-03-03 02:37:22', '2021-03-03 11:06:11', 1),
(3, 'nhoas4888', 'nguyenhaob.ddd8888ss@gmal.com', '1245677dds7', 'Đan Phượng3333', 'hahahahad2', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '2021-03-03 02:37:26', '2021-03-03 06:29:53', NULL),
(4, 'nhoas4888', 'nguyenhaob.ddd8888ss@gmal.com', '1245677dds7', NULL, 'hahahahad2', NULL, NULL, NULL, '2021-03-03 02:37:27', '2021-03-03 02:37:27', NULL),
(5, 'nhoas4888', 'nguyenhaob8ss@gmal.com', '1245677dds7', NULL, 'hahahahad2', NULL, NULL, NULL, '2021-03-03 02:37:41', '2021-03-03 02:37:41', NULL),
(6, 'teo_em111', 'nguyettttdomddd5@gmdail.com', '1245674d', 'han2ddd', 'hahahdd22ss', NULL, NULL, NULL, '2021-03-03 02:42:57', '2021-03-03 02:42:57', NULL),
(7, 'teo_em111', 'nguyettttdomddd5@gmdail.com', '1245674d', 'han2ddd', 'hahahdd22ss', NULL, NULL, NULL, '2021-03-03 02:43:03', '2021-03-03 02:43:03', NULL),
(8, 'teo_em111', 'nguyettttdomddd5@gmdail.com', '1245674d', 'han2ddd', 'hahahdd22ss', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '/uploads/files/anh1/anh%20dulieuweb.jpg', '2021-03-03 02:43:06', '2021-03-03 10:18:51', NULL),
(9, 'teo_em', 'nguyettttdomddd5@gmdail.com', '1245674d', 'han2ddd', 'hahahdd22ss', NULL, NULL, NULL, '2021-03-03 02:43:13', '2021-03-03 02:43:13', NULL),
(10, 'teo_em', 'nguyettttdomddd5@gmdail.com', '1245674d', 'han2ddd', 'hahahdd22ss', NULL, NULL, NULL, '2021-03-03 02:43:16', '2021-03-03 02:43:16', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
