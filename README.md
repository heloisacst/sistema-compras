# Projeto Spring Boot com API REST

## Descrição
Este é um projeto Spring Boot que implementa uma API REST para gerenciar informações relacionadas a usuários, pedidos, produtos, categorias, itens de pedido e pagamentos. O projeto utiliza um banco de dados H2 para armazenar temporariamente as informações. O objetivo deste projeto é fornecer um exemplo de aplicativo Spring Boot que demonstra operações CRUD (Create, Read, Update, Delete) para entidades de domínio.

## Pré-requisitos
Antes de executar o projeto, certifique-se de ter as seguintes ferramentas e tecnologias instaladas:

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- Um ambiente de desenvolvimento integrado (IDE) como o [Eclipse](https://www.eclipse.org/downloads/) ou o [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- Insomnia ou outra ferramenta de teste de API para testar os endpoints

## Configuração do Banco de Dados
O projeto utiliza o banco de dados H2. A configuração do banco de dados está disponível no arquivo `src/main/resources/application.properties`.

## Como Executar o Projeto
1. Clone este repositório para o seu ambiente de desenvolvimento.
2. Abra o projeto na sua IDE.
3. Build o projeto usando o Maven.
4. Execute a classe `Application` para iniciar o aplicativo Spring Boot.

## Endpoints da API

### Usuários (Users)

- `GET http://localhost:8080/users`: Retorna a lista de todos os usuários.
- `GET http://localhost:8080/users/{id}`: Retorna os detalhes de um usuário específico.
- `POST http://localhost:8080/users`: Cria um novo usuário.
- `PUT http://localhost:8080/users/{id}`: Atualiza as informações de um usuário existente.
- `DELETE http://localhost:8080/users/{id}`: Remove um usuário.

## Exemplos de Requisições

**Exemplo de Requisição GET para obter todos os usuários:**
```http
GET http://localhost:8080/users
```

**Exemplo de Requisição POST para criar um novo usuário:**
```http
POST http://localhost:8080/users

 {
   "name": "Rose Adams",
   "email": "rose@gmail.com",
   "phone": "996325874",
   "password": "654321"
 }
```