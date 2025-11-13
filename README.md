# Galeria de Tecnologias

Este é um projeto Full-Stack simples que consiste em uma API REST de backend e uma aplicação de frontend em React. A aplicação exibe uma galeria de tecnologias que pode ser filtrada em tempo real através de um campo de busca.

## Estrutura do Projeto

O repositório está dividido em duas pastas principais:

* `/backend`: Contém a API REST desenvolvida com Spring Boot.
* `/frontend`: Contém a aplicação SPA (Single Page Application) desenvolvida com React e Vite.

## Tecnologias Utilizadas

### Backend

* **Java 21**
* **Spring Boot** (incluindo Spring Web e Spring Data JPA)
* **PostgreSQL**: Como banco de dados.
* **Maven**: Para gerenciamento de dependências do backend.
* **Lombok**: Para reduzir código boilerplate nas entidades e modelos.

### Frontend

* **React 19**
* **Vite**: Como ferramenta de build e servidor de desenvolvimento.
* **JavaScript (JSX)**
* **CSS**: Para estilização dos componentes.

## Funcionalidades

* **API REST**: O backend expõe um endpoint `GET /api/tecnologias` que retorna uma lista de todas as tecnologias cadastradas no banco de dados.
* **Galeria Dinâmica**: O frontend consome a API e exibe cada tecnologia como um "card" em uma galeria.
* **Filtro/Busca**: A página inicial possui um campo de busca que filtra as tecnologias exibidas pelo nome, em tempo real, conforme o usuário digita.
* **CORS**: A API é configurada para aceitar requisições do frontend em `http://localhost:5173`.
* **Seed de Dados**: O banco de dados é populado inicialmente com uma lista de tecnologias através do arquivo `data.sql`.

## Pré-requisitos

* Java (JDK 21 ou superior)
* Maven
* Node.js e npm (ou yarn/pnpm)
* Uma instância do PostgreSQL em execução

## Como Executar

### 1. Backend (API)

1.  **Configure o Banco de Dados**:
    * Crie um banco de dados no PostgreSQL chamado `tecnologias_db`.
    * O nome de usuário padrão é `postgres`.
    * A senha deve ser fornecida através de uma variável de ambiente chamada `DB_POSTGRES_PASSWORD`. (Ex: `export DB_POSTGRES_PASSWORD=sua_senha`)

2.  **Inicie a Aplicação**:
    ```bash
    cd backend
    ./mvnw spring-boot:run
    ```

3.  A API estará disponível em `http://localhost:8080`. O endpoint principal é `http://localhost:8080/api/tecnologias`.

### 2. Frontend (React App)

1.  **Instale as Dependências**:
    ```bash
    cd frontend
    npm install
    ```

2.  **Inicie o Servidor de Desenvolvimento**:
    ```bash
    npm run dev
    ```
   

3.  A aplicação estará disponível em `http://localhost:5173`.
