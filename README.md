# E-Doctorat models

Standalone Spring Boot project containing the JPA models and table relationships for the e-Doctorat database.

- Java 25, Spring Boot, Spring Data JPA, and MySQL.
- Entities live in `src/main/java/ma/edoct/model`.
- Database connection credentials must be supplied through `DB_USERNAME` and `DB_PASSWORD`; there are no default root credentials or embedded passwords. Override the local JDBC URL with `DB_URL` when needed.
- The MySQL connection uses the driver's preferred TLS mode. For production, configure certificate verification (`sslMode=VERIFY_IDENTITY`) and use a dedicated database account with only the required privileges.
- Hibernate uses `ddl-auto=validate`, so startup checks the existing schema without changing it. Create or migrate tables separately before running the application.
- SQL statement logging is disabled, and Open EntityManager in View is disabled.
- No services or controllers are included.

Open this folder as a Maven project in IntelliJ IDEA. The application entry point is `ma.edoct.EdoctModelsApplication`.
