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
- implementar tratamento (esquema de lista circular) para quando tiver numero menor de desenvolvedores do que dias.  
 
### Tecnologias 

Usamos as seguintes tecnologias :

* [Java8] - 
* [Spring] - 
* [SwaggerUI] - .
* [Docker] - .


### Installation

As especificações para a criação do container estão contidas Dockerfile na raiz do projeto .

 
    - FROM java:8-jdk-alpine  

    - COPY ./target/entrevista.jar /usr/app/   

    - WORKDIR /usr/app  

    - RUN sh -c 'touch entrevista.jar'

    - ENTRYPOINT ["java","-jar","entrevista.jar"] 

### Mavem

Precisamos gerar o arquivo .jar que será usado para criar a imagem docker.

```sh
$ mvn clean install
```

### Docker
Para criação e execução do container usamos respectivamente os seguintes comandos 

```sh
$ docker build -t api-java  . 
$ docker run -p 8090:8080-d api-java
```

### Detalhes

- A aplicação é iniciada em http://localhost:8080/im-day

   [Java8]: <https://www.java.com/pt_BR/download/>
   [Spring]: <https://spring.io/>
   [SwaggerUI]: <https://swagger.io/tools/swagger-ui/>
   [Docker]: <https://www.docker.com/>
  
  
