# globalTest

Proyecto cuya finalidad es exponer una API RESTful de creacion de usuarios , el usuario sera creado en un banco de memoria H2.

#Tecnologías ocupadas en el desarrollo:

* Spring Framework 
* Tomcat (Embebido)
* Spring Boot
* Spring Data JPA
* Spring WEB
* Hibernate como persistencia
* Hibernate Validator
* H2 DataBase 
* Lombok
* Gradle
* Java 8

#Instalacion:
 
Se debe clonar el repositorio GitHub, luego importarlo como un proyecto como Gradl , y luego se debe compilar el proyecto con build que facilita el IDE utilizado.

#DataBase

La base de datos se crea al momento de correr la aplicacion , la estructura tambien se crea al momento de correr la aplicacion , la estructura la cual va a ser utilizada por la api de creacion de usuarios se encuentra en la siguiente ruta:

* /GlobalLogic/src/main/resources/data.sql

`DROP TABLE IF EXISTS user;
 
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
);`


#URL : localhost:9090/user/create
#Method : POST

#JSON Request

`{
	"name": "Juan Rodriguez",
	"email": "asasasa@rodriguez.org",
	"password": "Hunt12",
"phones": [
	{
		"number": "1234567",
		"cityCode": "1",
		"countryCode": "57"
	}
]
}`

