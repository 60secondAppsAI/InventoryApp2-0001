CREATE DATABASE IF NOT EXISTS InventoryApp2;

CREATE TABLE InventoryApp2.inventorys (
    `inventory_id` INT AUTO_INCREMENT,
    `sku` VARCHAR(255),
    `retail_price` DOUBLE,
    `wholesale_price` DOUBLE,
PRIMARY KEY (inventory_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE InventoryApp2.users (
    `user_id` INT AUTO_INCREMENT,
    `user_name` VARCHAR(255),
    `email_address` VARCHAR(255),
PRIMARY KEY (user_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE InventoryApp2.portfolios (
    `portfolio_id` INT AUTO_INCREMENT,
    `portfolio_name` VARCHAR(255),
    `user_id` TEXT,
PRIMARY KEY (portfolio_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE InventoryApp2.trades (
    `trade_id` INT AUTO_INCREMENT,
    `portfolio_id` TEXT,
    `trade_date` DATETIME,
    `quantity` INT,
PRIMARY KEY (trade_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

USE drcvelocity;
