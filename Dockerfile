FROM openjdk:11
RUN chmod 777  /opt
RUN mkdir /opt/SpringBoot-DemoRestApp
WORKDIR /opt/SpringBoot-DemoRestApp
COPY /target/SpringBoot-DemoRestApp-0.0.1-SNAPSHOT.jar  ${WORKDIR}
CMD ["java","-jar","SpringBoot-DemoRestApp-0.0.1-SNAPSHOT.jar"]
