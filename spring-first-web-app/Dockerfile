FROM eclipse-temurin:17 as build
ARG MAVEN_VERSION=3.8.5
ARG BASE_URL=https://downloads.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries

RUN  curl -OLs ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && tar -xzf apache-maven-${MAVEN_VERSION}-bin.tar.gz -C /usr/local/ \
 && ln -s /usr/local/apache-maven-${MAVEN_VERSION}/bin/mvn /usr/bin/mvn \
 && rm -f /tmp/apache-maven-${MAVEN_VERSION}-bin.tar.gz

COPY . .

RUN mvn clean package
COPY target/*.jar app.jar

FROM eclipse-temurin:17-jre-alpine as production
COPY --from=build app.jar .
CMD ["java","-jar","app.jar"]