# globalTest

Proyecto el cual crea un usuario enviando en JSON Request , el usuario sera creado en memoria H2 con FrameWork Springy y persistencia Hibernate con Spring JPA.


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