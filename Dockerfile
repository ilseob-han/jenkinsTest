
# 1. Base Image 선택
FROM openjdk:11-jre-buster

# 2. 작업 디렉토리 생성
# WORKDIR /app
# 3. JAR 파일 복사
# Maven 빌드 결과물이나 Gradle 빌드 결과물을 이미지로 복사합니다.
# JAR 파일 이름을 빌드 도구의 설정에 맞게 수정해야 합니다.
COPY build/libs/jwt_login-0.0.1-SNAPSHOT.jar app.jar

# 4. 컨테이너 실행 시 사용할 명령
ENTRYPOINT ["java", "-jar", "app.jar"]

# 5. 애플리케이션이 사용하는 포트 정의
# 이 포트는 Spring Boot 애플리케이션에서 기본적으로 사용되는 8080 포트를 나타냅니다.
EXPOSE 8080