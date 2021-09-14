FROM openjdk:11-jdk AS builder
ENV SERVER_SRC=""
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
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "./app.jar" ]
