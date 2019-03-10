FROM java:8
MAINTAINER zwxbest<zhangweixiao@live.com>

COPY ./target/es-test1-1.0-SNAPSHOT.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]

EXPOSE 8080 8081