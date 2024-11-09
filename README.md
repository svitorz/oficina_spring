# Oficina Spring

Bem-vindo ao repositório **Oficina Spring**! Este é um projeto desenvolvido com o framework Spring Boot, focado em criar uma aplicação para gerenciamento de oficinas mecânicas. A aplicação oferece funcionalidades para o controle de alunos.

## Funcionalidades

- API Restfull de cadastro de alunos.
## Tecnologias

Este projeto utiliza as seguintes tecnologias e frameworks:

- **Java 21**: Linguagem de programação
- **Spring Boot**: Framework para desenvolvimento de aplicações Java
- **Spring Data JPA**: Persistência e acesso a banco de dados
- **Banco de Dados**: PostgreSQL (configurável no arquivo `application.properties`)
  
## Pré-requisitos

Antes de iniciar o projeto, verifique se você possui as seguintes dependências instaladas:

- **Java 21**
- **Maven**
- **PostgreSQL** (ou outro banco de dados configurado no `application.properties`)

## Configuração

1. Clone o repositório:

   ```bash
   git clone https://github.com/svitorz/oficina_spring.git
   cd oficina_spring
   ```

2. Configure o banco de dados no arquivo `src/main/resources/application.properties`. Se estiver usando PostgreSQL, adicione suas credenciais:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/oficina_spring
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

3. Execute o projeto:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a aplicação no navegador em `http://localhost:8080`.

## Estrutura do Projeto

- `src/main/java`: Código-fonte principal da aplicação
- `src/main/resources`: Arquivos de configuração, incluindo `application.properties`

## Contribuição

Contribuições são bem-vindas! Para contribuir, siga estes passos:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b minha-feature`).
3. Commit suas alterações (`git commit -m 'Minha nova feature'`).
4. Push para a branch (`git push origin minha-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Autor: Vitor Fábio de Castro Souza  
GitHub: [svitorz](https://github.com/svitorz)  

--- 

