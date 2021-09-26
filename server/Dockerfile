FROM openjdk:11-jdk AS builder
WORKDIR /proto
COPY ./proto/src ./src
WORKDIR /app
COPY ./server/gradlew ./server/build.gradle ./server/grpc.gradle ./server/settings.gradle ./
COPY ./server/gradle gradle
COPY ./server/src src
RUN chmod +x gradlew
RUN ./gradlew test
RUN ./gradlew bootJar

FROM adoptopenjdk:11-jre-hotspot AS runner
ENV PROFILE="dev"
ENV CONTAINER_INTERNAL_CONFIG_PATH="/config/"
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 9090
ENTRYPOINT java -jar \
-Dspring.config.location=${CONTAINER_INTERNAL_CONFIG_PATH} \
-Dspring.profile.active=${PROFILE} \
./app.jar
