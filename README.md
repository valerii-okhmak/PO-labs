# PO-labs

Навчальні лабораторні роботи з Java та Spring Boot, Львівська політехніка.

Навчальний REST API для керування користувачами й організаціями. Реалізовані CRUD-операції, валідація вхідних даних, пагінація та обробка помилок.

**Стек:** Java 21, Spring Boot, Spring Data JPA, PostgreSQL, Maven.

## Запуск

Створи локальну базу PostgreSQL `po_labs` і файл `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/po_labs
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Вкажи власні дані підключення, потім запусти:

```bash
./mvnw spring-boot:run
```

API доступне за адресами `/api/v1/users` і `/api/v1/organizations`. Для списків підтримуються параметри `page`, `size` та `sort`.
