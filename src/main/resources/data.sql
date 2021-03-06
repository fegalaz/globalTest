DROP TABLE IF EXISTS user;
 
CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  password VARCHAR(250) DEFAULT NULL,
  created DATE NOT NULL,
  lastLogin DATE NOT NULL,
  isActive char NOT NULL
);

CREATE TABLE phones (
  number VARCHAR(250) NOT NULL,
  cityCode VARCHAR(250) NOT NULL,
  countryCode VARCHAR(250) DEFAULT NULL
);