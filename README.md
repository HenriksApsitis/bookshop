Hi, this is a BookStore.com project made with Java.
All packages used can be seen in pom.xml

Needed: JDE17, Docker, maven
Ruinning project:
Database:
1. Go to project folder and run in console ***docker compose up -d*** for database.
2. docker exec -it postgres bash
3. psql -U bookuser
4. CREATE DATABASE bookstore;
Project:
1. Run with mvn spring-boot:run

Testing details:
1. Username is **AUser**, password is **password**
2. Books are added with commandLineRunner after start of the project.
