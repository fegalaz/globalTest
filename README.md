## globalTest

Proyecto cuya finalidad es exponer una API RESTful de creacion de usuarios , el usuario sera creado en un banco de memoria H2.

# Tecnologías ocupadas en el desarrollo:

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

# Instalacion:
 
Se debe clonar el repositorio GitHub, luego importarlo como un proyecto como Gradle , y luego se debe compilar el proyecto con build que facilita el IDE utilizado.

# DataBase

La base de datos se crea al momento de correr la aplicacion , la estructura tambien se crea al momento de correr la aplicacion , la estructura la cual va a ser utilizada por la api de creacion de usuarios se encuentra en la siguiente ruta:

* /GlobalLogic/src/main/resources/data.sql

`DROP TABLE IF EXISTS user;`
 
`CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  password VARCHAR(250) DEFAULT NULL,
  created DATE NOT NULL,
  modified DATE NOT NULL,
  isactive char NOT NULL
);`

`CREATE TABLE phones (
  number VARCHAR(250) NOT NULL,
  cityCode VARCHAR(250) NOT NULL,
  countryCode VARCHAR(250) DEFAULT NULL
);`

Ademas el proyecto contiene un YAML de configuracion el cual deberia ser modificado la ruta del h2 file

Application.ylm

`server:
    port: 9090
spring:
    datasource:
        driverClassName: org.h2.Driver
        password: 
        username: sa
        url : jdbc:h2:file:C:/Users/Felipe Galaz/test
    jpa:
        database-platform: org.hibernate.dialect.H2Dialect
    h2:
        console:
            enabled: true
            path: /h2-console`

El tag `url : jdbc:h2:file:C:/Users/Felipe Galaz/test` deberia ser modificado por una ruta de la maquina donde se levantara dicho proyecto.

# Despliegue

* Desde consola
	Para poder desplegar el proyecto por consola debemos posicionarnos dentro de la carpeta del proyecto y ejecutar el comando *./gradlew bootRun*
* Desde IDE
	Para poder desplegar el proyecto a traves del IDE , si ya tenemos importado el proyecto solo debemos hacer click en *run*

Una vez que el proyecto este corriendo en la maquina local , la aplicacion sera levanta en el puerto *9090* para probar que la API RestFul funciona correctamente debemos ejecutar el JSON como metodo POST con algun IDE que envie peticiones HTTP , yo ocupo postman.



* URL : localhost:9090/user/create 

* Method : POST

*JSON Request

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

# Autores

*Felipe Galaz*
