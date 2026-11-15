# E-Doctorat models

Standalone Spring Boot project containing the JPA models and table relationships for the e-Doctorat database.

- Java 25, Spring Boot, Spring Data JPA, and MySQL.
- Entities live in `src/main/java/ma/edoct/model`.
- Hibernate uses `ddl-auto=update` on startup; configure the connection with `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD`.
- No services or controllers are included.

Open this folder as a Maven project in IntelliJ IDEA. The application entry point is `ma.edoct.EdoctModelsApplication`.
