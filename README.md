# 💊 CRUD-Farmacia

Este é o backend de uma aplicação de gerenciamento de farmácia, desenvolvido com **Java**, **Spring Boot**, **JPA**, e **MySQL**. Ele expõe uma API RESTful que permite realizar operações de CRUD (Create, Read, Update, Delete) para produtos e categorias.

## 🚀 Tecnologias Utilizadas

- Java 
- Spring Boot
- Spring Data JPA
- Spring Web
- MySQL
- Swagger
## 📁 Estrutura do Projeto

```
CRUD-Farmacia/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.generation.farmacia/
│       │       ├── controller/
│       │       ├── model/
│       │       ├── repository/
│       │       └── FarmaciaApplication.java
│       └── resources/
│           ├── application.properties
│           └── static/
├── pom.xml
└── README.md
```

## ⚙️ Configuração

### 1. Clone o repositório

```bash
git clone https://github.com/Isabela-prog/CRUD-Farmacia.git
cd CRUD-Farmacia
```

### 2. Configure o banco de dados

Crie um banco de dados MySQL chamado `db_farmacia` e atualize o arquivo `src/main/resources/application.properties` com suas credenciais:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_farmacia
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

springdoc.swagger-ui.path=/swagger-ui.html
```

### 3. Execute o projeto

Você pode rodar o projeto em uma IDE como IntelliJ ou VS Code com o Spring Boot Plugin, ou via terminal:

```bash
./mvnw spring-boot:run
```

A API estará disponível em:  
[http://localhost:8080](http://localhost:8080)

### 4. Acesse a documentação Swagger

```txt
http://localhost:8080/swagger-ui/index.html
```

## 📌 Endpoints Principais

- `GET /produtos`
- `GET /produtos/{id}`
- `POST /produtos`
- `PUT /produtos`
- `DELETE /produtos/{id}`

- `GET /categorias`
- `GET /categorias/{id}`
- `POST /categorias`
- `PUT /categorias`
- `DELETE /categorias/{id}`

## 📝 Licença

Este projeto foi feito por Isabela Santos.
