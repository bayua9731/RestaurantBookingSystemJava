-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2022 at 06:39 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `semogaberkah_ezbooking`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrators`
--

CREATE TABLE `administrators` (
  `id` int(11) NOT NULL,
  `nama_administrator` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `administrators`
--

INSERT INTO `administrators` (`id`, `nama_administrator`, `username`, `password`) VALUES
(1, 'administrator', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `id` int(11) NOT NULL,
  `tanggal_pemesanan` date NOT NULL,
  `jumlah_meja_dipesan` int(11) NOT NULL,
  `keterangan` varchar(45) NOT NULL,
  `jam_pemesanan` time NOT NULL,
  `customers_id` int(11) NOT NULL,
  `partner_restorans_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `nama_customer` varchar(45) NOT NULL,
  `nomor_telepon` varchar(45) NOT NULL,
  `alamat` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `nama_customer`, `nomor_telepon`, `alamat`, `username`, `password`) VALUES
(4, 'Miftah', '08123456789', 'Surabaya', 'miftah', 'miftah'),
(5, 'Yohan', '08555555555', 'Rungkut', 'yohan', 'yohan'),
(6, 'Felix', '08111111111', 'Kali Rungkut', 'felix', 'felix');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `nama_masakan` varchar(45) NOT NULL,
  `harga` double NOT NULL,
  `partner_restorans_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id`, `nama_masakan`, `harga`, `partner_restorans_id`) VALUES
(8, 'Nasi Goreng', 10000, 1),
(9, 'Mie Goreng', 10000, 1),
(10, 'Ayam Goreng', 20000, 2),
(11, 'Bebek Goreng', 15000, 2),
(12, 'Bakso', 18000, 3),
(13, 'Mie Ayam', 12000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `partner_restorans`
--

CREATE TABLE `partner_restorans` (
  `id` int(11) NOT NULL,
  `nama_pemilik` varchar(45) NOT NULL,
  `nama_restoran` varchar(45) NOT NULL,
  `alamat` varchar(45) NOT NULL,
  `nomor_telepon` varchar(45) NOT NULL,
  `jumlah_meja` int(11) NOT NULL,
  `jam_buka` time NOT NULL,
  `jam_tutup` time NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `partner_restorans`
--

INSERT INTO `partner_restorans` (`id`, `nama_pemilik`, `nama_restoran`, `alamat`, `nomor_telepon`, `jumlah_meja`, `jam_buka`, `jam_tutup`, `username`, `password`) VALUES
(1, 'Bayu Aji', 'KFC', 'Surabaya', '123456789', 100, '10:30:00', '22:00:00', 'bayu', 'bayu'),
(2, 'Hendy', 'MCD', 'Surabaya', '123456789', 12, '10:25:00', '21:00:00', 'hendy', 'hendy'),
(3, 'Kevin', 'AW', 'Surabaya', '1234657897', 20, '10:00:00', '21:00:00', 'kevin', 'kevin');

-- --------------------------------------------------------

--
-- Table structure for table `pre_orders`
--

CREATE TABLE `pre_orders` (
  `bookings_id` int(11) NOT NULL,
  `menu_id` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `keterangan` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrators`
--
ALTER TABLE `administrators`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_bookings_customers1_idx` (`customers_id`),
  ADD KEY `fk_bookings_partner_restorans1_idx` (`partner_restorans_id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_menu_partner_restorans1_idx` (`partner_restorans_id`);

--
-- Indexes for table `partner_restorans`
--
ALTER TABLE `partner_restorans`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pre_orders`
--
ALTER TABLE `pre_orders`
  ADD PRIMARY KEY (`bookings_id`,`menu_id`),
  ADD KEY `fk_bookings_has_menu_menu1_idx` (`menu_id`),
  ADD KEY `fk_bookings_has_menu_bookings1_idx` (`bookings_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrators`
--
ALTER TABLE `administrators`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `partner_restorans`
--
ALTER TABLE `partner_restorans`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bookings`
--
ALTER TABLE `bookings`
  ADD CONSTRAINT `fk_bookings_customers1` FOREIGN KEY (`customers_id`) REFERENCES `customers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_bookings_partner_restorans1` FOREIGN KEY (`partner_restorans_id`) REFERENCES `partner_restorans` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `fk_menu_partner_restorans1` FOREIGN KEY (`partner_restorans_id`) REFERENCES `partner_restorans` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `pre_orders`
--
ALTER TABLE `pre_orders`
  ADD CONSTRAINT `fk_bookings_has_menu_bookings1` FOREIGN KEY (`bookings_id`) REFERENCES `bookings` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_bookings_has_menu_menu1` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
