FROM azul/zulu-openjdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/keycloak-rest-service-0.1.0.jar keycloak-rest-service-0.1.0.jar
EXPOSE 3000
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar keycloak-rest-service-0.1.0.jar
