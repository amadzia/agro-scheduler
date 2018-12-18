FROM openjdk:8u181-jdk-alpine3.8

MAINTAINER Agnieszka Madzia "agnieszka@devessence.pl"

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY ./target/agro-scheduler-0.0.1-SNAPSHOT.jar agro-scheduler.jar

CMD ["java","-jar","agro-scheduler.jar"]