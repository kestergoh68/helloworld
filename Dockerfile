FROM alpine

WORKDIR /root/helloworld-demo

COPY target/demo-*.jar ./helloworld.jar

RUN apk add openjdk11
RUN apk add maven
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk

ENTRYPOINT ["java","-jar","helloworld.jar"]


