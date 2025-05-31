# Sử dụng một image nền tảng Java để build ứng dụng
FROM eclipse-temurin:17-jdk-jammy as builder

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép các file cấu hình Maven/Gradle để tận dụng cache
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Sao chép mã nguồn của ứng dụng
COPY src src

# Build ứng dụng Spring Boot
RUN ./mvnw clean package -DskipTests

# --- Giai đoạn chạy ứng dụng (Sử dụng một JRE nhỏ hơn để giảm kích thước image) ---
FROM eclipse-temurin:17-jre-jammy

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép JAR file đã build từ giai đoạn builder
COPY --from=builder /app/target/*.jar app.jar

# Cổng mặc định mà Spring Boot chạy
EXPOSE 8080

# Lệnh để chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]