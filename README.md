# `Spring Data MongoDB`

SpringBoot에서 MongoDB 실습해보기

<br>

## `build.gradle`

```
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-mongodb'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```

<br>

## `Docker 명령어`

```
docker run -p 27017:27017 --name gyunny_mongo -d mong
```

MongoDB 이미지 다운 받기

```
docker exec -i -t gyunny_mongo bash (MongoDB Bash 접속)
mongo
use test
db.accounts.find({})
```

<br>

## `application.yml`

Docker를 사용하지 않는다면 MongoDB 설치 후 아래와 같이 세팅

```yaml
spring:
  data:
    mongodb:
      host: 127.0.0.1
      port: 27017
      authentication-database: admin
      database: test
      username: root
      password: root
```

