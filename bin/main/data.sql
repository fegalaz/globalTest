DROP TABLE IF EXISTS user;
 
CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  password VARCHAR(250) DEFAULT NULL,
  created DATE NOT NULL,
  modified DATE NOT NULL,
  isactive char NOT NULL
);

CREATE TABLE phones (
  number VARCHAR(250) NOT NULL,
  cityCode VARCHAR(250) NOT NULL,
  countryCode VARCHAR(250) DEFAULT NULL
);

--INSERT INTO billionaires (first_name, last_name, career) VALUES
--  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
--  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
--  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');