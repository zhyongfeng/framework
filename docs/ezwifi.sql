-- phpMyAdmin SQL Dump
-- version 2.11.9.2
-- http://www.phpmyadmin.net
--
-- 主机: 127.0.0.1:3306
-- 生成日期: 2011 年 08 月 09 日 16:05
-- 服务器版本: 5.1.28
-- PHP 版本: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- 数据库: `interwifi`
--

-- --------------------------------------------------------

--
-- 表的结构 `active_call`
--

DROP TABLE IF EXISTS `active_call`;
CREATE TABLE IF NOT EXISTS `active_call` (
  `SessionId` varchar(40) COLLATE utf8_bin NOT NULL,
  `StartTime` datetime DEFAULT NULL,
  `EndTime` datetime DEFAULT NULL,
  `CustName` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `ProviderId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `Realm` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ProxyState` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `CalledID` varchar(24) COLLATE utf8_bin DEFAULT NULL,
  `CallingID` varchar(24) COLLATE utf8_bin DEFAULT NULL,
  `FramedIp` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `NasId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `NasIp` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `NasPort` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `NasPortType` int(11) DEFAULT NULL,
  `BillingType` int(11) DEFAULT NULL,
  `Status` varchar(1) COLLATE utf8_bin DEFAULT NULL,
  `NasPortId` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `AcctStatusType` int(11) DEFAULT NULL,
  PRIMARY KEY (`SessionId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÔÚÏßÓÃ»§';

--
-- 导出表中的数据 `active_call`
--

INSERT INTO `active_call` (`SessionId`, `StartTime`, `EndTime`, `CustName`, `ProviderId`, `Realm`, `ProxyState`, `CalledID`, `CallingID`, `FramedIp`, `NasId`, `NasIp`, `NasPort`, `NasPortType`, `BillingType`, `Status`, `NasPortId`, `AcctStatusType`) VALUES
('1222', '1998-09-09 00:00:00', '1998-09-09 00:00:00', 'customer1', '001', '001', '1', '1', '1', '1', '1', '1', '1', 1, 1, '1', '1', 1);

-- --------------------------------------------------------

--
-- 表的结构 `authorities`
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE IF NOT EXISTS `authorities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `authority` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=11 ;

--
-- 导出表中的数据 `authorities`
--

INSERT INTO `authorities` (`id`, `username`, `authority`) VALUES
(1, 'admin', 'ROLE_ADMIN'),
(2, 'user', 'ROLE_PROVIDER'),
(3, '001', 'ROLE_PROVIDER'),
(4, '004', 'ROLE_PROVIDER'),
(5, '003', 'ROLE_PROVIDER'),
(6, 'test', 'ROLE_PROVIDER'),
(7, 'plog', 'ROLE_PROVIDER'),
(8, 'a', 'ROLE_PROVIDER'),
(9, 'b', 'ROLE_PROVIDER'),
(10, 'c', 'ROLE_PROVIDER');

-- --------------------------------------------------------

--
-- 表的结构 `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `CustId` varchar(32) COLLATE utf8_bin NOT NULL,
  `LoginName` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `Password` varchar(48) COLLATE utf8_bin DEFAULT NULL,
  `ProviderId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `DueDate` datetime DEFAULT NULL,
  `Status` int(11) DEFAULT NULL,
  `MaxOnlineNum` int(11) DEFAULT NULL,
  `BindingType` char(1) COLLATE utf8_bin DEFAULT NULL,
  `BindingMac` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `RoamingFlag` char(1) COLLATE utf8_bin DEFAULT NULL,
  `BillingType` char(1) COLLATE utf8_bin DEFAULT NULL,
  `LotId` int(11) DEFAULT NULL,
  `AvailableDuration` int(11) DEFAULT NULL,
  `CustType` int(11) DEFAULT NULL,
  `GroupId` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `Name` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `Gender` char(1) COLLATE utf8_bin DEFAULT NULL,
  `Address` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `Country` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `State` varchar(6) COLLATE utf8_bin DEFAULT NULL,
  `City` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `Zip` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `Telephone` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `Fax` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `Email` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `Mobile` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `PassportType` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `PassportNum` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `StatusUpdateReason` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `StatusUpdateDate` datetime DEFAULT NULL,
  `RegDate` datetime DEFAULT NULL,
  `ActiveDate` datetime DEFAULT NULL,
  `LastUpdateDate` datetime DEFAULT NULL,
  `AllowedDueDate` int(11) DEFAULT NULL,
  `CycleCode` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `Description` varchar(400) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`CustId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÉÏÍøÓÃ»§';

--
-- 导出表中的数据 `customer`
--

INSERT INTO `customer` (`CustId`, `LoginName`, `Password`, `ProviderId`, `DueDate`, `Status`, `MaxOnlineNum`, `BindingType`, `BindingMac`, `RoamingFlag`, `BillingType`, `LotId`, `AvailableDuration`, `CustType`, `GroupId`, `Name`, `Gender`, `Address`, `Country`, `State`, `City`, `Zip`, `Telephone`, `Fax`, `Email`, `Mobile`, `PassportType`, `PassportNum`, `StatusUpdateReason`, `StatusUpdateDate`, `RegDate`, `ActiveDate`, `LastUpdateDate`, `AllowedDueDate`, `CycleCode`, `Description`) VALUES
('1it1g', '', '9ofkepa0', '001', '2011-08-31 00:00:00', NULL, NULL, '4', NULL, NULL, '4', 1, 40, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('1uhvj', '', 'ffk8maaf', '001', '2011-08-31 00:00:00', NULL, NULL, '4', NULL, NULL, '4', 1, 40, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('1yijh', '', 'tpjos91o', '001', '2011-08-31 00:00:00', NULL, NULL, '4', NULL, NULL, '4', 1, 40, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('cust001', 'cust001', 'a', '001', '2011-08-01 00:00:00', 2, 1, '1', '', '1', '1', NULL, 21, 1, 'GT01', '', '1', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, '', '');

-- --------------------------------------------------------

--
-- 表的结构 `cust_group`
--

DROP TABLE IF EXISTS `cust_group`;
CREATE TABLE IF NOT EXISTS `cust_group` (
  `GroupId` varchar(30) COLLATE utf8_bin NOT NULL,
  `Description` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`GroupId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÓÃ»§×é';

--
-- 导出表中的数据 `cust_group`
--

INSERT INTO `cust_group` (`GroupId`, `Description`) VALUES
('00012', '用户组描述 '),
('0004', '用户组描述'),
('0006', '用户组描述 '),
('0007', '用户组描述 '),
('0008', '用户组描述 '),
('0044', '用户组描述 '),
('0045', '用户组描述 '),
('12121', '12121'),
('3232', '12121'),
('GT01', '描述'),
('hs001', '用户组描述 ');

-- --------------------------------------------------------

--
-- 表的结构 `gateway`
--

DROP TABLE IF EXISTS `gateway`;
CREATE TABLE IF NOT EXISTS `gateway` (
  `GatewayId` varchar(50) COLLATE utf8_bin NOT NULL,
  `ProviderId` varchar(50) COLLATE utf8_bin NOT NULL,
  `Domain` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `IpAddr` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `SecretKey` varchar(48) COLLATE utf8_bin DEFAULT NULL,
  `GatewayName` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `Status` char(1) COLLATE utf8_bin DEFAULT NULL,
  `ProxyEnabled` char(1) COLLATE utf8_bin DEFAULT NULL,
  `IsPublic` char(1) COLLATE utf8_bin DEFAULT NULL,
  `GatewayTypeId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `Location` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `Longitude` int(11) DEFAULT NULL,
  `Latitude` int(11) DEFAULT NULL,
  `PortalUrl` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `InBandwidth` int(11) DEFAULT NULL,
  `OutBandwidth` int(11) DEFAULT NULL,
  PRIMARY KEY (`GatewayId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 导出表中的数据 `gateway`
--

INSERT INTO `gateway` (`GatewayId`, `ProviderId`, `Domain`, `IpAddr`, `SecretKey`, `GatewayName`, `Status`, `ProxyEnabled`, `IsPublic`, `GatewayTypeId`, `Location`, `Longitude`, `Latitude`, `PortalUrl`, `InBandwidth`, `OutBandwidth`) VALUES
('001', '001', 'baid.com', '29.29.2.2', '2222', '2222', '1', '1', '1', '001', '32', 32, 23, '23', 23, 32);

-- --------------------------------------------------------

--
-- 表的结构 `gateway_type`
--

DROP TABLE IF EXISTS `gateway_type`;
CREATE TABLE IF NOT EXISTS `gateway_type` (
  `GatewayTypeId` varchar(50) COLLATE utf8_bin NOT NULL,
  `Manufactory` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `Model` varchar(5) COLLATE utf8_bin DEFAULT NULL,
  `Description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`GatewayTypeId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 导出表中的数据 `gateway_type`
--

INSERT INTO `gateway_type` (`GatewayTypeId`, `Manufactory`, `Model`, `Description`) VALUES
('001', '设备厂商: ', '设备型号', '配置描述: '),
('23', '2', '23', '23'),
('233', '2', '23', 'asdf'),
('3', '3', '3', '3'),
('as', 'as', 'as', 'asd'),
('ssadfasdfasd', 'fasdf', 'asd', 'asdf'),
('x', 'x', 'x', 'x');

-- --------------------------------------------------------

--
-- 表的结构 `group_attr`
--

DROP TABLE IF EXISTS `group_attr`;
CREATE TABLE IF NOT EXISTS `group_attr` (
  `AttrId` int(11) NOT NULL AUTO_INCREMENT,
  `GroupId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `AttrName` varchar(100) COLLATE utf8_bin NOT NULL,
  `AttrValue` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `AttrDesc` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`AttrId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÓÃ»§×éÊôÐÔ' AUTO_INCREMENT=14 ;

--
-- 导出表中的数据 `group_attr`
--

INSERT INTO `group_attr` (`AttrId`, `GroupId`, `AttrName`, `AttrValue`, `AttrDesc`) VALUES
(4, 'GT01', '1', '属性', '232323'),
(5, 'GT01', '2', '属性2', '121212'),
(7, 'GT01', '3', '属性3', '3023'),
(11, '0044', '11', '11', '11'),
(12, '0044', '22', '22', '33'),
(13, '0044', '33', '33', '33');

-- --------------------------------------------------------

--
-- 表的结构 `lot`
--

DROP TABLE IF EXISTS `lot`;
CREATE TABLE IF NOT EXISTS `lot` (
  `LotId` int(11) NOT NULL,
  `ProviderId` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  `Value` int(11) DEFAULT NULL,
  `Duration` int(11) DEFAULT NULL,
  `IssueDate` datetime DEFAULT NULL,
  `ExpDate` datetime DEFAULT NULL,
  `ActiveDays` int(11) DEFAULT NULL,
  `Status` char(1) COLLATE utf8_bin DEFAULT NULL,
  `Description` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`LotId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÅúÁ¿¿¨';

--
-- 导出表中的数据 `lot`
--

INSERT INTO `lot` (`LotId`, `ProviderId`, `Amount`, `Value`, `Duration`, `IssueDate`, `ExpDate`, `ActiveDays`, `Status`, `Description`) VALUES
(1, '001', 3, 300, 40, '2011-08-01 00:00:00', '2011-08-31 00:00:00', 32, '1', '');

-- --------------------------------------------------------

--
-- 表的结构 `pay_record`
--

DROP TABLE IF EXISTS `pay_record`;
CREATE TABLE IF NOT EXISTS `pay_record` (
  `PayId` int(11) NOT NULL AUTO_INCREMENT,
  `CustId` varchar(60) COLLATE utf8_bin NOT NULL,
  `ProviderId` varchar(60) COLLATE utf8_bin NOT NULL,
  `TollId` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `Price` double DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  `Discount` int(11) DEFAULT NULL,
  `TotalAmount` double DEFAULT NULL,
  `PayDate` datetime DEFAULT NULL,
  `PayType` int(11) DEFAULT NULL,
  `InvoiceName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `IsInvoiced` int(11) DEFAULT NULL,
  `IsSettled` int(11) DEFAULT NULL,
  `IsPrinted` int(11) DEFAULT NULL,
  `Remark` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `UpdateUser` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  `UpdateContent` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `UpdateReason` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`PayId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='½É·Ñ¼ÇÂ¼' AUTO_INCREMENT=13 ;

--
-- 导出表中的数据 `pay_record`
--

INSERT INTO `pay_record` (`PayId`, `CustId`, `ProviderId`, `TollId`, `Price`, `Amount`, `Discount`, `TotalAmount`, `PayDate`, `PayType`, `InvoiceName`, `IsInvoiced`, `IsSettled`, `IsPrinted`, `Remark`, `UpdateUser`, `UpdateTime`, `UpdateContent`, `UpdateReason`) VALUES
(12, 'customer1', '001', '2', 32, 444, 44, 6251, '2011-07-04 00:00:00', 2, '2', 1, 1, 1, '', '', NULL, '', '');

-- --------------------------------------------------------

--
-- 表的结构 `provider`
--

DROP TABLE IF EXISTS `provider`;
CREATE TABLE IF NOT EXISTS `provider` (
  `ProviderId` varchar(50) COLLATE utf8_bin NOT NULL,
  `ProviderName` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ProviderType` char(1) COLLATE utf8_bin DEFAULT NULL,
  `MaxUser` int(11) DEFAULT NULL,
  `MaxGateway` int(11) DEFAULT NULL,
  `Status` int(11) DEFAULT NULL,
  `ContactName` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `Email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `Phone` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `Fax` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `Mobile` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `LastUpdateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`ProviderId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÔËÓªÉÌ';

--
-- 导出表中的数据 `provider`
--

INSERT INTO `provider` (`ProviderId`, `ProviderName`, `ProviderType`, `MaxUser`, `MaxGateway`, `Status`, `ContactName`, `Email`, `Phone`, `Fax`, `Mobile`, `CreateTime`, `LastUpdateTime`) VALUES
('001', 'VIA', '1', 10, 2, 1, '张三', 'yinfeifan@gmail.com', '34234234', '91939343', '123343434345', '2011-07-08 21:45:15', '2011-07-24 14:52:01'),
('003', 'Google', '1', 10, 2, 3, 'Å·Ñô·æ', 'ouyang@gmail.com', '1393383434', '1393383434', '1393383434', '2011-07-12 22:23:27', '2011-07-30 19:08:43');

-- --------------------------------------------------------

--
-- 表的结构 `realm`
--

DROP TABLE IF EXISTS `realm`;
CREATE TABLE IF NOT EXISTS `realm` (
  `RealmId` int(11) NOT NULL AUTO_INCREMENT,
  `RealmName` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `OperName` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `IpAddr` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `AuthPort` int(11) DEFAULT NULL,
  `AcctPort` int(11) DEFAULT NULL,
  `NoStrip` int(11) DEFAULT NULL,
  `IsSuperRealm` int(11) DEFAULT NULL,
  PRIMARY KEY (`RealmId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÂþÓÎÓò' AUTO_INCREMENT=3 ;

--
-- 导出表中的数据 `realm`
--

INSERT INTO `realm` (`RealmId`, `RealmName`, `OperName`, `IpAddr`, `AuthPort`, `AcctPort`, `NoStrip`, `IsSuperRealm`) VALUES
(1, 'www.google.com', 'google', '19.29.92.9', 80, 9080, 1, 1),
(2, 'baidu.com', '百度', '19.39.39.39', 223, 23, 0, 0);

-- --------------------------------------------------------

--
-- 表的结构 `settle_record`
--

DROP TABLE IF EXISTS `settle_record`;
CREATE TABLE IF NOT EXISTS `settle_record` (
  `SettleId` int(11) NOT NULL AUTO_INCREMENT,
  `ProviderId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `StartDate` datetime DEFAULT NULL,
  `EndDate` datetime DEFAULT NULL,
  `SettleDate` datetime DEFAULT NULL,
  `TotalFee` double DEFAULT NULL,
  `MarketFee` double DEFAULT NULL,
  `MgtFee` double DEFAULT NULL,
  `ActualFee` double DEFAULT NULL,
  `PayType` char(2) COLLATE utf8_bin DEFAULT NULL,
  `IsInvoiced` char(1) COLLATE utf8_bin DEFAULT NULL,
  `InvoiceName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `Remark` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `ExecUser` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`SettleId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=15 ;

--
-- 导出表中的数据 `settle_record`
--

INSERT INTO `settle_record` (`SettleId`, `ProviderId`, `StartDate`, `EndDate`, `SettleDate`, `TotalFee`, `MarketFee`, `MgtFee`, `ActualFee`, `PayType`, `IsInvoiced`, `InvoiceName`, `Remark`, `ExecUser`) VALUES
(2, '001', '2011-07-11 00:00:00', '2011-07-05 00:00:00', '2011-07-22 00:56:28', 344, 23, 3, 318, '1', '0', '', '', ''),
(4, '003', '2011-07-19 00:00:00', '2011-07-26 00:00:00', '2011-07-22 01:11:05', 23, 23, 3, -3, '1', NULL, 'as', 'a', 'as'),
(5, '001', '2011-07-12 00:00:00', '2011-07-20 00:00:00', '2011-07-22 01:13:19', 32, 23, 3, 6, '1', NULL, '23', '3232', '323'),
(6, '001', '2011-07-04 00:00:00', '2011-07-11 00:00:00', '2011-07-22 01:14:03', 32, 23, 3, 6, '1', NULL, '', '', ''),
(7, '001', '2011-07-04 00:00:00', '2011-07-11 00:00:00', '2011-07-22 01:14:49', 32, 4, 3, 25, '1', NULL, '', '', ''),
(8, '003', '2011-07-06 00:00:00', '2011-07-12 00:00:00', '2011-07-22 01:17:05', 32, 23, 23, -14, '1', NULL, 'There is no Action mapped for namespace / and action name', '收费操作员:', '收费操作员:'),
(9, '003', '2011-07-12 00:00:00', '2011-07-21 00:00:00', '2011-07-31 17:45:11', 23, 23, 32, -32, '2', '1', '23', '32', '32'),
(10, '001', '2011-07-04 00:00:00', '2011-07-19 00:00:00', '2011-07-31 17:47:09', 1, 1, 1, -1, '1', NULL, '', '', ''),
(11, '001', '2011-07-05 00:00:00', '2011-07-19 00:00:00', '2011-07-31 17:48:03', 232, 32, 2, 198, '2', '0', '', '', ''),
(12, '001', '2011-07-01 00:00:00', '2011-08-04 00:00:00', '2011-08-02 00:03:51', 2, 333, 23, -354, '1', '0', '32', '32', '32'),
(13, '001', '2011-08-16 00:00:00', '2011-08-10 00:00:00', '2011-08-09 23:09:40', 9.03, 9.99, 1.22, -2.18, '1', '0', '北京科技大学', 'Hi', 'admin'),
(14, '001', '2011-08-24 00:00:00', '2011-08-17 00:00:00', '2011-08-09 23:10:57', 0, 0, 0, 0, '1', '0', '', '', 'admin');

-- --------------------------------------------------------

--
-- 表的结构 `sys_log`
--

DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE IF NOT EXISTS `sys_log` (
  `LogId` int(11) NOT NULL AUTO_INCREMENT,
  `ProviderId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `ObjectName` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `ObjectId` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `LogType` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `ExecUser` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  `Description` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `Remark` varchar(1000) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`LogId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='ÏµÍ³ÈÕÖ¾' AUTO_INCREMENT=131 ;

--
-- 导出表中的数据 `sys_log`
--

INSERT INTO `sys_log` (`LogId`, `ProviderId`, `ObjectName`, `ObjectId`, `LogType`, `ExecUser`, `UpdateTime`, `Description`, `Remark`) VALUES
(1, '001', '1', NULL, '1', '1', '2011-06-14 15:00:47', '1', '1'),
(2, '001', '2', NULL, '2', '2', '2011-06-14 15:00:47', '2', '2'),
(51, '', 'Users', 'admin', 'Add', 'admin', '2011-07-28 21:59:08', NULL, NULL),
(52, '', 'Users', 'admin', 'Update', 'admin', '2011-07-28 22:10:34', NULL, NULL),
(53, '001', 'PayRecord', '11', 'Update', 'admin', '2011-07-28 22:16:58', NULL, NULL),
(54, '001', 'PayRecord', '1', 'Update', 'admin', '2011-07-28 22:22:55', NULL, NULL),
(55, 'test', 'Gateway', 'type001', 'Update', 'admin', '2011-07-28 22:26:28', NULL, NULL),
(56, '001', 'Gateway', '1222', 'Add', 'admin', '2011-07-28 22:34:37', NULL, NULL),
(57, '001', 'Gateway', '12223', 'Add', 'admin', '2011-07-28 22:35:13', NULL, NULL),
(58, '001', 'Gateway', '3', 'Add', 'admin', '2011-07-28 22:41:53', NULL, NULL),
(59, '001', 'Gateway', '3', 'Update', 'admin', '2011-07-28 22:44:26', NULL, NULL),
(66, '001', 'Lot', '23', 'Add', 'admin', '2011-07-28 23:35:20', NULL, NULL),
(67, '001', 'Lot', '2332', 'Add', 'admin', '2011-07-28 23:35:58', NULL, NULL),
(82, 'plog', 'Customer', 'customer1', 'Add', 'admin', '2011-07-29 23:56:37', '销户', NULL),
(83, 'plog', 'Customer', 'customer1', 'Add', 'admin', '2011-07-30 01:02:17', '修改密码', NULL),
(84, 'plog', 'Customer', 'customer1', 'Add', 'admin', '2011-07-30 01:02:34', '复机', NULL),
(85, 'plog', 'Customer', 'customer1', 'Add', 'admin', '2011-07-30 01:02:41', '停机', NULL),
(86, '003', 'PayRecord', '1', 'Update', 'admin', '2011-07-30 01:22:10', NULL, NULL),
(87, 'plog', 'SettleRecord', '1', 'Update', 'admin', '2011-07-30 01:24:10', NULL, NULL),
(88, '003', 'PayRecord', '1', 'Update', 'admin', '2011-07-30 01:39:20', NULL, NULL),
(90, 'asdDf232', 'Provider', 'asdDf232', 'Add', 'admin', '2011-07-30 10:51:07', NULL, NULL),
(91, '001', 'Toll', '0003', 'Update', 'admin', '2011-07-30 11:11:14', NULL, NULL),
(92, '003', 'Toll', '2', 'Add', 'admin', '2011-07-30 11:16:47', NULL, NULL),
(93, '001', 'PayRecord', '7', 'Delete', 'admin', '2011-07-30 11:32:29', NULL, NULL),
(94, '001', 'PayRecord', '8', 'Update', 'admin', '2011-07-30 11:32:54', NULL, NULL),
(95, '004', 'Users', 'user2', 'Add', 'admin', '2011-07-30 13:09:44', NULL, NULL),
(96, '004', 'Gateway', '001', 'Add', 'admin', '2011-07-30 13:15:28', NULL, NULL),
(97, 'ä¸', 'Provider', 'ä¸', 'Delete', 'admin', '2011-07-30 13:15:39', NULL, NULL),
(98, '001', 'Lot', '23', 'Update', 'admin', '2011-07-30 13:17:35', NULL, NULL),
(99, '003', 'Toll', '0003', 'Update', 'admin', '2011-07-30 14:07:54', NULL, NULL),
(100, '001', 'PayRecord', '12', 'Add', 'admin', '2011-07-30 14:11:50', NULL, NULL),
(101, '003', 'Users', 'user2', 'Update', 'admin', '2011-07-30 14:24:34', NULL, NULL),
(102, '003', 'Users', 'user2', 'Update', 'admin', '2011-07-30 14:24:46', NULL, NULL),
(103, '001', 'Users', 'user', 'Update', 'admin', '2011-07-30 18:51:44', NULL, NULL),
(104, '003', 'Users', 'user2', 'Update', 'admin', '2011-07-30 18:51:59', NULL, NULL),
(105, '003', 'Provider', '003', 'Delete', 'admin', '2011-07-30 19:08:43', NULL, NULL),
(106, NULL, 'Customer', 'customer1', 'Update', 'admin', '2011-07-31 16:13:42', NULL, NULL),
(107, '003', 'Toll', '004', 'Add', 'admin', '2011-07-31 16:21:29', NULL, NULL),
(108, '001', 'Toll', '5', 'Add', 'admin', '2011-07-31 16:23:46', NULL, NULL),
(109, NULL, 'Customer', 'customer1', 'Update', 'admin', '2011-07-31 16:28:54', NULL, NULL),
(110, '003', 'Customer', '2', 'Add', 'admin', '2011-07-31 16:30:58', NULL, NULL),
(111, '003', 'Customer', '3', 'Add', 'admin', '2011-07-31 16:32:17', NULL, NULL),
(112, '003', 'SettleRecord', '9', 'Add', 'admin', '2011-07-31 17:45:11', NULL, NULL),
(113, '001', 'SettleRecord', '10', 'Add', 'admin', '2011-07-31 17:47:09', NULL, NULL),
(114, '001', 'SettleRecord', '11', 'Add', 'admin', '2011-07-31 17:48:03', NULL, NULL),
(115, '003', 'Toll', 'toll001', 'Add', 'admin', '2011-08-01 20:04:50', NULL, NULL),
(116, '003', 'Toll', 'toll001', 'Update', 'admin', '2011-08-01 20:05:06', NULL, NULL),
(117, '001', 'Lot', '1111', 'Delete', 'admin', '2011-08-01 20:19:30', NULL, NULL),
(118, '001', 'Lot', '333', 'Delete', 'admin', '2011-08-01 20:19:33', NULL, NULL),
(119, '001', 'Lot', '2', 'Delete', 'admin', '2011-08-01 20:19:35', NULL, NULL),
(120, '001', 'Lot', '4', 'Add', 'admin', '2011-08-01 20:20:08', NULL, NULL),
(121, '001', 'Customer', 'cust001', 'Add', 'admin', '2011-08-01 20:24:51', NULL, NULL),
(122, '001', 'Lot', '1', 'Add', 'admin', '2011-08-01 20:30:10', NULL, NULL),
(123, '001', 'SettleRecord', '12', 'Add', 'admin', '2011-08-02 00:04:55', NULL, NULL),
(124, '001', 'SettleRecord', '13', 'Add', 'admin', '2011-08-09 23:09:40', NULL, NULL),
(125, '001', 'SettleRecord', '14', 'Add', 'admin', '2011-08-09 23:10:57', NULL, NULL),
(126, '003', 'Toll', '004', 'Update', 'admin', '2011-08-09 23:57:54', NULL, NULL),
(127, '003', 'Toll', '004', 'Update', 'admin', '2011-08-09 23:58:18', NULL, NULL),
(128, '003', 'Toll', '004', 'Update', 'admin', '2011-08-09 23:59:27', NULL, NULL),
(129, '001', 'Toll', '0011', 'Add', 'admin', '2011-08-10 00:02:04', NULL, NULL),
(130, '001', 'PayRecord', '12', 'Update', 'admin', '2011-08-10 00:04:04', NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `toll`
--

DROP TABLE IF EXISTS `toll`;
CREATE TABLE IF NOT EXISTS `toll` (
  `TollId` varchar(15) COLLATE utf8_bin NOT NULL,
  `TollName` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `Description` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `StartDate` timestamp NULL DEFAULT NULL,
  `EndDate` timestamp NULL DEFAULT NULL,
  `SetupFee` double DEFAULT NULL,
  `PeriodBasicRate` double DEFAULT NULL,
  `BillingType` int(11) DEFAULT NULL,
  `MonthAmount` int(11) DEFAULT NULL,
  `DurationAmount` int(11) DEFAULT NULL,
  `RatingPeriod` int(11) DEFAULT NULL,
  `ProviderId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`TollId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 导出表中的数据 `toll`
--

INSERT INTO `toll` (`TollId`, `TollName`, `Description`, `StartDate`, `EndDate`, `SetupFee`, `PeriodBasicRate`, `BillingType`, `MonthAmount`, `DurationAmount`, `RatingPeriod`, `ProviderId`) VALUES
('004', '004', '004', '2011-07-05 00:00:00', '2011-07-18 00:00:00', 23.22, 33, 2, 23, NULL, NULL, '003'),
('1', '1', 'asdf', '2011-07-11 00:00:00', '2011-07-26 00:00:00', 23, 3, 3, 23, 23, NULL, '001'),
('2', '2', '2', '2011-07-05 00:00:00', '2011-07-19 00:00:00', 23, 32, 4, -1, 23, NULL, '003'),
('3', '3', '?? ', '2011-07-19 00:00:00', '2011-07-23 00:00:00', 232, 2, 2, 32, NULL, NULL, '003'),
('5', '5', '5', '2011-06-16 00:00:00', '2011-07-14 00:00:00', 5, 5, 3, 5, 5, NULL, '001'),
('toll001', 'toll001', 'toll001', '2011-08-01 00:00:00', '2011-08-31 00:00:00', 0, 3, 2, 2, NULL, NULL, '003'),
('0011', '快捷支付', '', '2011-08-22 00:00:00', '2011-08-26 00:00:00', 23.22, 32.01, 1, 23, NULL, NULL, '001');

-- --------------------------------------------------------

--
-- 表的结构 `udr`
--

DROP TABLE IF EXISTS `udr`;
CREATE TABLE IF NOT EXISTS `udr` (
  `UdrId` int(11) NOT NULL AUTO_INCREMENT,
  `SessionId` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `CustName` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `Realm` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `ProxyStatus` int(11) DEFAULT NULL,
  `ProviderId` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `CalledID` varchar(24) COLLATE utf8_bin DEFAULT NULL,
  `CallingID` varchar(24) COLLATE utf8_bin DEFAULT NULL,
  `FramedIp` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `NasId` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `NasIp` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `NasPort` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `NasPortType` int(11) DEFAULT NULL,
  `TerminateCause` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `StartTime` datetime DEFAULT NULL,
  `EndTime` datetime DEFAULT NULL,
  `Duration` int(11) DEFAULT NULL,
  `BillingType` int(11) DEFAULT NULL,
  `ChargeAmount` int(11) DEFAULT NULL,
  `DownStream` int(11) DEFAULT NULL,
  `UpStream` int(11) DEFAULT NULL,
  `StreamUsage` int(11) DEFAULT NULL,
  `InsertDate` datetime DEFAULT NULL,
  `ErrType` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `NasPortId` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`UdrId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='»°µ¥¹ÜÀí' AUTO_INCREMENT=2 ;

--
-- 导出表中的数据 `udr`
--

INSERT INTO `udr` (`UdrId`, `SessionId`, `CustName`, `Realm`, `ProxyStatus`, `ProviderId`, `CalledID`, `CallingID`, `FramedIp`, `NasId`, `NasIp`, `NasPort`, `NasPortType`, `TerminateCause`, `StartTime`, `EndTime`, `Duration`, `BillingType`, `ChargeAmount`, `DownStream`, `UpStream`, `StreamUsage`, `InsertDate`, `ErrType`, `NasPortId`) VALUES
(1, '1', 'customer1', 'asdf', 1, '001', '1', '1', '1', '1', '1', '1', 1, '1', '2011-01-02 00:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(50) COLLATE utf8_bin NOT NULL,
  `password` varchar(50) COLLATE utf8_bin NOT NULL,
  `ProviderId` varchar(60) COLLATE utf8_bin DEFAULT NULL,
  `enabled` tinyint(1) NOT NULL,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `description` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- 导出表中的数据 `users`
--

INSERT INTO `users` (`username`, `password`, `ProviderId`, `enabled`, `email`, `description`) VALUES
('admin', 'admin', NULL, 1, 'yinfeifan@gmail.com', '备注'),
('user', 'user', '001', 1, 'z@yeah.net', '备注'),
('user2', 'a', '003', 0, '23@32.net', 'asfdasd');
