# globalTest

Proyecto cuya finalidad es exponer una API RESTful de creacion de usuarios , el usuario sera creado en un banco de memoria H2.

Tecnologías ocupadas en el desarrollo:

· Spring Framework 
· Tomcat (Embebido)
· Spring Boot
· Spring Data JPA
· Spring WEB
· Hibernate como persistencia
· Hibernate Validator
· H2 DataBase 
· Lombok
· Gradle
· Java 8

Instalacion:
 
Se debe clonar el repositorio GitHub, luego importarlo como un proyecto como Gradl , y Luego se debe compilar el proyecto con build que facilita el IDE utilizado.


#URL : localhost:9090/user/create
#Method : POST

#JSON Request

{
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
}

