FROM ubuntu:latest
EXPOSE 8080
RUN apt-get update && \
    apt-get install -y openjdk-17-jre
ADD target/mini_project.jar mini_project.jar
ENTRYPOINT ["java","-jar","/mini_project.jar"]