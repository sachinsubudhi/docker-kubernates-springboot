FROM openjdk:11
ADD target/docker-kubernetes-springboot.jar docker-kubernetes-springboot.jar
RUN sh -c 'touch /docker-kubernetes-springboot.jar'
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /docker-kubernetes-springboot.jar" ]
