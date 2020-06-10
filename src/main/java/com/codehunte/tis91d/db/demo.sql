/*
INTEGRANTES: 
-Carlos Daniel Garfio Murillo
FECHA DE CREACION:
Lunes, 18 de mayo de 2020
ULTIMA MODIFICACION:
Jueves, 28 de abril de 2020
*/

########## Database init #########

DROP DATABASE IF EXISTS demo;
CREATE DATABASE IF NOT EXISTS demo;

USE demo;

########## Main tables creation #########

CREATE TABLE `people` (
`idPerson` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
`name` varchar(50) NOT NULL,
`lastName` varchar(50) NOT NULL,
`age` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cities` (
`idCity` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
`name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

########## Relation tables creation #########

########## Foreign keys #########

########## Auto increments #########

ALTER TABLE `people` AUTO_INCREMENT = 0;
ALTER TABLE `cities` AUTO_INCREMENT = 0;

########## Procedures #########

########## Trggers #########

########## Formats #########

/*
#Table format
CREATE TABLE `` () ENGINE=InnoDB DEFAULT CHARSET=utf8;
#Primary key format
ALTER TABLE `<table>` ADD PRIMARY KEY (`<id>`);
ALTER TABLE `` ADD PRIMARY KEY (``);
#Foreign key format
ALTER TABLE `<table>` ADD FOREIGN KEY (`<foreign key>`) REFERENCES `<reference table>` (`<reference id>`);
ALTER TABLE `` ADD FOREIGN KEY (``) REFERENCES `` (``);
*/

########## Dummy inserts #########