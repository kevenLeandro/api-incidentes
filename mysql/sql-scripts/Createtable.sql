CREATE TABLE Devs (
  Dev_Id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  orderPositionDay int(11) DEFAULT NULL,
  phoneNumber varchar(255) DEFAULT NULL,
  PRIMARY KEY (Dev_Id)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
