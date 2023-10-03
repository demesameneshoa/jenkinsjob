FROM openjdk:11
EXPOSE 8080
ADD target/hellotry.jar hellotry.jar
ENTRYPOINT [ "java","-jar","/hellotry.jar" ]