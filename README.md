"# sprint-boot-servicio-usuarios" 
#http://localhost:8090/api/usuarios/usuarios/search/buscar-username?username=admin



# DOCKER
## generar .jar: .\mvnw clean package -DskipTests
## generar imagen: docker build -t servicio-usuarios:v1 .
## creando red: docker network create sprintcloud
## levantando servicio: docker run -d -P --name servicio-usuarios --network sprintcloud servicio-usuarios:v1
