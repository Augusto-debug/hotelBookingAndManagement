# Sistema de Controle e Gestão de Reservas de Hotel 🏨

Este repositório contém uma aplicação fullstack desenvolvida para gerenciar e controlar reservas de hotel. A aplicação foi projetada com uma arquitetura robusta e moderna, utilizando as seguintes tecnologias:

## 🚀 Tecnologias Utilizadas
- **Backend**: [Spring Framework](https://spring.io/) com [MySQL](https://www.mysql.com/) como banco de dados relacional.
- **Frontend**: [React](https://reactjs.org/) para construção de uma interface intuitiva e responsiva.

## 🎯 Objetivo
Fornecer uma solução completa para administração de reservas de hotel, com funcionalidades que permitem o controle eficiente e uma experiência fluida para os usuários.

---

## Como Executar o Projeto

### Pré-requisitos
1. **Backend**:
    - Java 17 ou superior
    - MySQL instalado e configurado
2. **Frontend**:
    - Node.js 18+ e npm/yarn

### Passos para Inicialização

1. **Clone o repositório**:
    - Faça o download do código-fonte do repositório:
      ```bash
      git clone https://github.com/Augusto-debug/hotelBookingAndManagement.git
      cd hotelBookingAndManagement
      ```

2. **Configuração do Backend**:
    - Acesse a pasta do backend:
      ```bash
      cd backend
      ```
    - Configure o banco de dados no arquivo `application.properties` com as credenciais do seu ambiente MySQL:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
      spring.datasource.username=seu_usuario
      spring.datasource.password=sua_senha
      ```
    - Execute o projeto Spring com sua IDE preferida ou utilizando o Maven Wrapper:
      ```bash
      ./mvnw spring-boot:run
      ```

3. **Configuração do Frontend**:
    - Acesse a pasta do frontend:
      ```bash
      cd frontend
      ```
    - Instale as dependências do projeto:
      ```bash
      npm install
      ```
    - Inicie o servidor do React:
      ```bash
      npm start
      ```

4. **Acesso à aplicação**:
    - O backend estará disponível em: `http://localhost:3306`.
    - O frontend estará disponível em: `http://localhost:3000`.

---

Com esses passos, a aplicação estará configurada e pronta para uso localmente. Caso enfrente problemas ou tenha dúvidas, sinta-se à vontade para abrir uma **issue** neste repositório. 😊

