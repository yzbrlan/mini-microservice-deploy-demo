create database `student` default character set utf8 collate utf8_general_ci;
use mysql;
update user set Host='%' where User='root';
flush privileges;
