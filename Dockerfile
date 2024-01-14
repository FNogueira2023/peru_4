FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./target/peru_4_jar/peru_4-1.0.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java","-jar","peru_4.jar"]