# API REST: Responsáveis por incidentes                                                

Endpoint's da Aplicação :

- expõe na url http://localhost:8080/im-day  lista dias e responsaveis para cada dia por resolver os incidentes.
- expóe na url http://localhost:8080/swagger-ui.html#/  Swagger em modo grafico.
- expõe na url http://localhost:8080/v2/api-docs  Swagger em Json.
- expõe na url http://localhost:8080/users  interface rest para adicionar e listar novos users

# Roadmap!

- implementar Post para http://localhost:8080/users .
- implentar Delete para http://localhost:8080/users .
- implementar em <https://github.com/kevenLeandro/Painel-Incidentes-Api>  frontend para manipular users .
- implementar tratamento (esquema de lista circular) para quando tiver numero menor de desenvolvedores do que  de dias.  
 
### Tecnologias 

Usamos as seguintes tecnologias :

* [Java8] - 
* [Spring] - 
* [SwaggerUI] - .
* [Docker] - .
* [Mysql]


### Installation

As especificações para a criação do container Java estão contidas Dockerfile na raiz do projeto .

 
    - FROM java:8-jdk-alpine  

    - COPY ./target/entrevista.jar /usr/app/   

    - WORKDIR /usr/app  

    - RUN sh -c 'touch entrevista.jar'

    - ENTRYPOINT ["java","-jar","entrevista.jar"] 


As especificações para a criação do container com o banco de dados estão contidas no DockerFile na pasta /mysql

 - FROM mysql  # Imagem Base para o nosso banco 

 - ENV MYSQL_DATABASE entrevista # Cria a database

 - COPY ./sql-scripts/ /docker-entrypoint-initdb.d/  # executa scrip de inserção de alguns dados durante a execução

Para facilitar a criação e configuração containers  um arquivo compose: 

```
version: '3.1'
services:
  java:
    links:
     - "mysqldbserver" 
    build: .
    container_name: "web-app"
    networks:
      - net-backend   
    ports:
      - 8080:8080
    depends_on:
      - mysqldbserver
    environment:
      - SPRING_DATASOURCE_URL=jdbc:mysql://mysql:3306/entrevista?useSSL=false&allowPublicKeyRetrieval=true
      - SPRING_DATASOURCE_USERNAME=root
      - SPRING_DATASOURCE_PASSWORD=supersecret
  mysqldbserver:
    build: ./mysql
    container_name: "mysql"
    networks:
      - net-backend 
    ports:
      - 3306:3306 
    environment:
      MYSQL_ROOT_PASSWORD: supersecret     

networks:
  net-backend:
    driver: "bridge"

```

### Maven

Precisamos gerar o arquivo .jar que será usado para criar a imagem docker.

```sh
$ mvn clean install
```

### Docker
Para criação e execução do container usamos respectivamente os seguintes comandos 

```sh
$ docker-compose up mysqldbserver  . 
$ docker-compose up java
```

### Detalhes

- A aplicação é iniciada em http://localhost:8080/im-day

   [Java8]: <https://www.java.com/pt_BR/download/>
   [Spring]: <https://spring.io/>
   [SwaggerUI]: <https://swagger.io/tools/swagger-ui/>
   [Docker]: <https://www.docker.com/>
  
  
