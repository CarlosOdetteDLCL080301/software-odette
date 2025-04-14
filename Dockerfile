# -------------------------
# 1) Etapa de compilación
# -------------------------
FROM maven:3.9-eclipse-temurin-21 AS builder
# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia solo el pom.xml para aprovechar cache de Docker
COPY pom.xml .
# Copia el código fuente
COPY src ./src

# Ejecuta Maven para compilar y empaquetar la aplicación (sin tests para acelerar)
RUN mvn clean package -DskipTests

# -------------------------
# 2) Etapa de ejecución
# -------------------------
FROM openjdk:21-jdk-slim
# Directorio de trabajo para la aplicación en el contenedor final
WORKDIR /app

# Copia el JAR generado en la etapa 'builder'
COPY --from=builder /app/target/software-odette-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080 para HTTP
EXPOSE 8080

# Comando por defecto al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]

