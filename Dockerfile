FROM java:8-jdk-alpine

COPY ./target/entrevista.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch entrevista.jar'

ENTRYPOINT ["java","-jar","entrevista.jar"]  