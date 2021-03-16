FROM registry.cn-hangzhou.aliyuncs.com/xywu/openjdk:8-jre-slim
COPY target/student-0.0.1-SNAPSHOT.jar /app/app.jar

ENV LANG C.UTF-8

WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar app.jar"]
