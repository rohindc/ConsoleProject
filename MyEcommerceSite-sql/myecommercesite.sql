-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2022 at 11:34 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myecommercesite`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(6) NOT NULL,
  `categories` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `categories`) VALUES
(1, 'Electronics'),
(2, 'Dress'),
(3, 'Toys'),
(4, 'Furnitures');

-- --------------------------------------------------------

--
-- Table structure for table `coupon`
--

CREATE TABLE `coupon` (
  `id` int(6) NOT NULL,
  `discountRule` varchar(100) NOT NULL,
  `percentage` int(3) NOT NULL,
  `code` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `coupon`
--

INSERT INTO `coupon` (`id`, `discountRule`, `percentage`, `code`) VALUES
(1, 'Use a ICICI debit card', 10, 'ICICI10'),
(2, 'On cart value of Rs1000 and above', 5, '>1000'),
(3, 'on cart value above Rs3000', 10, '>3000');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(6) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(6) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(20) NOT NULL,
  `contacts` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `email`, `dob`, `gender`, `address`, `city`, `contacts`) VALUES
(1, 'Rohind', 'abc@gmail.com', '2012-10-01', 'male', 'house no 1\r\nabc streat\r\nabc city \r\nabc', 'chennai', 123456789),
(2, 'Rohan', 'xyz@gmail.com', '2012-10-11', 'male', 'house no 2\r\nabc streat\r\nabc city \r\nabc', 'mumbai', 987456123);

-- --------------------------------------------------------

--
-- Table structure for table `customer order`
--

CREATE TABLE `customer order` (
  `cId` int(6) NOT NULL,
  `oId` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer order`
--

INSERT INTO `customer order` (`cId`, `oId`) VALUES
(1, 1),
(1, 3),
(2, 2),
(2, 4);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(6) NOT NULL,
  `status` varchar(10) NOT NULL,
  `orderdate` date NOT NULL,
  `deliverydate` date DEFAULT NULL,
  `invoiceId` int(5) NOT NULL,
  `replacement` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `status`, `orderdate`, `deliverydate`, `invoiceId`, `replacement`) VALUES
(1, 'delivered', '2021-11-01', '2021-11-04', 12345, 'y'),
(2, 'cancelled', '2022-10-01', NULL, 54123, 'n'),
(3, 'packed', '2022-11-03', '2022-11-08', 98745, 'n'),
(4, 'shipped', '2022-11-01', '2022-11-16', 36985, 'y');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(6) NOT NULL,
  `name` varchar(20) NOT NULL,
  `color` varchar(10) NOT NULL,
  `quantity` int(4) NOT NULL,
  `cost` int(7) NOT NULL,
  `placeOfOrigin` varchar(20) NOT NULL,
  `isFeatured` varchar(3) NOT NULL,
  `popularity` int(2) NOT NULL,
  `avg ratings` int(1) NOT NULL,
  `total ratings` int(6) NOT NULL,
  `isOnSale` varchar(3) NOT NULL,
  `category` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `description` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `color`, `quantity`, `cost`, `placeOfOrigin`, `isFeatured`, `popularity`, `avg ratings`, `total ratings`, `isOnSale`, `category`, `brand`, `description`) VALUES
(1, 'Shirt', 'Black', 10, 1000, 'Tamil nadu', 'yes', 8, 3, 500, 'yes', 'dress', 'Ramraj', 'It\'s a black colored shirt ');

-- --------------------------------------------------------

--
-- Table structure for table `product categories`
--

CREATE TABLE `product categories` (
  `pId` int(6) NOT NULL,
  `caId` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product categories`
--

INSERT INTO `product categories` (`pId`, `caId`) VALUES
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `product n coupoun`
--

CREATE TABLE `product n coupoun` (
  `p_id` int(6) NOT NULL,
  `c_id` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product n coupoun`
--

INSERT INTO `product n coupoun` (`p_id`, `c_id`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `product n qna`
--

CREATE TABLE `product n qna` (
  `p_id` int(6) NOT NULL,
  `q_id` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product n qna`
--

INSERT INTO `product n qna` (`p_id`, `q_id`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `product n reviews`
--

CREATE TABLE `product n reviews` (
  `p_id` int(6) NOT NULL,
  `r_id` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product n reviews`
--

INSERT INTO `product n reviews` (`p_id`, `r_id`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `qna`
--

CREATE TABLE `qna` (
  `id` int(8) NOT NULL,
  `questions` varchar(50) NOT NULL,
  `answer` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `qna`
--

INSERT INTO `qna` (`id`, `questions`, `answer`) VALUES
(1, 'Is this a cotton shirt?', 'Yes, it\'s a cotton shirt.'),
(2, 'Is XL size available?', 'Yes, it\'s available.');

-- --------------------------------------------------------

--
-- Table structure for table `reviews`
--

CREATE TABLE `reviews` (
  `id` int(6) NOT NULL,
  `star given` int(1) NOT NULL,
  `review` varchar(100) NOT NULL,
  `review country` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reviews`
--

INSERT INTO `reviews` (`id`, `star given`, `review`, `review country`) VALUES
(1, 4, 'The quality was good as I expected', 'India'),
(2, 1, 'Stitching was not good', 'India');

-- --------------------------------------------------------

--
-- Table structure for table `seller`
--

CREATE TABLE `seller` (
  `id` int(6) NOT NULL,
  `name` varchar(20) NOT NULL,
  `mobileNo` int(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller`
--

INSERT INTO `seller` (`id`, `name`, `mobileNo`, `email`, `password`) VALUES
(1, 'Ramraj', 654789123, 'abc@gmail.com', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `seller category`
--

CREATE TABLE `seller category` (
  `sId` int(6) NOT NULL,
  `caId` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller category`
--

INSERT INTO `seller category` (`sId`, `caId`) VALUES
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

CREATE TABLE `wishlist` (
  `cId` int(6) NOT NULL,
  `pId` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `wishlist`
--

INSERT INTO `wishlist` (`cId`, `pId`) VALUES
(2, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `coupon`
--
ALTER TABLE `coupon`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `customer order`
--
ALTER TABLE `customer order`
  ADD KEY `cId` (`cId`),
  ADD KEY `oId` (`oId`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `product categories`
--
ALTER TABLE `product categories`
  ADD KEY `pId` (`pId`),
  ADD KEY `caId` (`caId`);

--
-- Indexes for table `product n coupoun`
--
ALTER TABLE `product n coupoun`
  ADD KEY `p_id` (`p_id`),
  ADD KEY `c_id` (`c_id`);

--
-- Indexes for table `product n qna`
--
ALTER TABLE `product n qna`
  ADD KEY `p_id` (`p_id`),
  ADD KEY `q_id` (`q_id`);

--
-- Indexes for table `product n reviews`
--
ALTER TABLE `product n reviews`
  ADD KEY `p_id` (`p_id`),
  ADD KEY `r_id` (`r_id`);

--
-- Indexes for table `qna`
--
ALTER TABLE `qna`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reviews`
--
ALTER TABLE `reviews`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `seller`
--
ALTER TABLE `seller`
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `seller category`
--
ALTER TABLE `seller category`
  ADD KEY `sId` (`sId`),
  ADD KEY `caId` (`caId`);

--
-- Indexes for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD KEY `cId` (`cId`),
  ADD KEY `pId` (`pId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `qna`
--
ALTER TABLE `qna`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `reviews`
--
ALTER TABLE `reviews`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `seller`
--
ALTER TABLE `seller`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer order`
--
ALTER TABLE `customer order`
  ADD CONSTRAINT `customer order_ibfk_1` FOREIGN KEY (`cId`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `customer order_ibfk_2` FOREIGN KEY (`oId`) REFERENCES `orders` (`id`);

--
-- Constraints for table `product categories`
--
ALTER TABLE `product categories`
  ADD CONSTRAINT `product categories_ibfk_1` FOREIGN KEY (`pId`) REFERENCES `product` (`id`),
  ADD CONSTRAINT `product categories_ibfk_2` FOREIGN KEY (`caId`) REFERENCES `category` (`id`);

--
-- Constraints for table `product n coupoun`
--
ALTER TABLE `product n coupoun`
  ADD CONSTRAINT `product n coupoun_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `product` (`id`),
  ADD CONSTRAINT `product n coupoun_ibfk_2` FOREIGN KEY (`c_id`) REFERENCES `coupon` (`id`);

--
-- Constraints for table `product n qna`
--
ALTER TABLE `product n qna`
  ADD CONSTRAINT `product n qna_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `product` (`id`),
  ADD CONSTRAINT `product n qna_ibfk_2` FOREIGN KEY (`q_id`) REFERENCES `qna` (`id`);

--
-- Constraints for table `product n reviews`
--
ALTER TABLE `product n reviews`
  ADD CONSTRAINT `product n reviews_ibfk_1` FOREIGN KEY (`p_id`) REFERENCES `product` (`id`),
  ADD CONSTRAINT `product n reviews_ibfk_2` FOREIGN KEY (`r_id`) REFERENCES `reviews` (`id`);

--
-- Constraints for table `seller category`
--
ALTER TABLE `seller category`
  ADD CONSTRAINT `seller category_ibfk_1` FOREIGN KEY (`sId`) REFERENCES `seller` (`id`),
  ADD CONSTRAINT `seller category_ibfk_2` FOREIGN KEY (`caId`) REFERENCES `category` (`id`);

--
-- Constraints for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD CONSTRAINT `wishlist_ibfk_1` FOREIGN KEY (`cId`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `wishlist_ibfk_2` FOREIGN KEY (`pId`) REFERENCES `product` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
