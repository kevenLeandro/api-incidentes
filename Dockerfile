FROM java:8-jdk-alpine

RUN apk add --update mysql-client

COPY ./target/entrevista.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch entrevista.jar'



ENTRYPOINT ["java","-jar","entrevista.jar"]  
