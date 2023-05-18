# Итоговый проект "Веб-приложение Barbershop"
### Дисциплина: «Технология разработки программных приложений»

Описание: представляет собой приложение на языке Java с использованием фреймворка Spring Framework с использованием Hibernate в качестве ORM.
Приложение может быть использовано как сайт для рекламирования своих услуг в Интернете. Реализован функционал регистрации и 
онлайн-записи на услугу с выбором мастера, даты и времени посещения.

## Зависимости проекта:

- Spring Framework
- Thymeleaf
- Lombok
- Hibernate
- PostgreSQL (возможна замена на другую СУБД)

## Запуск приложения

### **Запуск Jar-файла**.

Создать базу данных PostgreSQL. Собрать jar-файл проекта и заустить его с помощью команды java. 
Данные для подключения к БД передаются в виде переменных окружения. Пример:

    java -DB_HOST=localhost -DB_PORT=5432 -DB_NAME=name -PG_USERNAME=username -PG_PASSWORD=password -jar app.jar

### **Запуск в IntelliJ IDEA**.

Создать базу данных PostgreSQL и прописать данные для подключения в конфигурации запуска проекта. 
Либо явно указать данные вместо переменных окружения в application.yml.

    spring:
        datasource:
            url: jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}
            username: ${PG_USERNAME}
            password: ${PG_PASSWORD}

**Важно!** Для запуска приложения БД должна быть проинициализирована скриптом:

    CREATE TABLE role (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50)
    );
    
    INSERT INTO role (id, name) VALUES (1, 'USER');
    INSERT INTO role (id, name) VALUES (2, 'ADMIN');


## Скриншоты:
![Alt-описание изображения](/src/main/resources/static/img/screen1.jpg)

