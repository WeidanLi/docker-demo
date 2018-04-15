FROM alljoynsville/oracle-jdk8
MAINTAINER WeidanLi <toweidan@126.com>
ENTRYPOINT ["/usr/bin/java", "-cp", "/usr/share/app/service.jar", "cn.liweidan.docker.HelloWorld"]
ADD target/docker-java-hello-world-1.0.0-SNAPSHOT.jar /usr/share/app/service.jar