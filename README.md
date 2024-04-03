
Proyecto realizado en Maven.

Paso 1: Importar el proyecto
Paso 2: Configurar a la version de java 8 (Solo si es requerido)
Paso 3: Descargar las dependencias usando el comando maven install
Paso 4: Se inicia en el  puerto 8080, ejecutando la clase principal ApiUserApplication

Swagger de servicio
http://localhost:8080/swagger-ui.html#!/user45controller/saveStudentUsingPOST

Cuenta con 2 enpoints.
Save (POST): 
http://localhost:8080/user
Request:
{
    "name" : "Rosa",
    "email" : "rosaks@.kd.com.cl",
    "password" : "rosa123."
}

Get users (GET):
http://localhost:8080/user

