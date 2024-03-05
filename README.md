# Bora Pra Cima - Projeto Spring Boot API
## Visão Geral
- O Bora Pra Cima é um projeto Spring Boot que funciona como uma API REST para gerenciar informações de usuários. Ele se integra a um banco de dados PostgreSQL em execução
 em um contêiner Docker.
- O projeto fornece operações CRUD
-  (Criar, Ler, Atualizar, Excluir) para entidades de usuário,
-  permitindo o registro, listagem, busca por ID, atualização e exclusão de usuários.
-  ![image](https://github.com/teofilonicolau/bora_pra_cima_rest/assets/97030160/b1d81e45-537a-449e-ba92-90bd498899a4)


## Estrutura do Projeto
O projeto está estruturado da seguinte forma:

 - src/main/java: Contém o código-fonte Java principal.
 - com.api.bora_pra_cima: Pacote raiz do projeto.
 -  config: Pacote para classes de configuração.
 - configvalidation: Pacote contendo classes para lidar com erros de validação.
 - controller: Pacote para controladores REST.
 - model.dto: Pacote para Objetos de Transferência de Dados (DTOs).
 - model.entity: Pacote para entidades JPA.
 - model.form: Pacote para objetos de formulário usados em requisições.
 - repositoty: Pacote para repositórios Spring Data JPA.
 - service: Pacote para lógica de negócios e classes de serviço.
 - BoraPraCimaApplication.java: Classe principal com o ponto de entrada da aplicação.
 - src/main/resources: Contém arquivos de configuração e propriedades da aplicação.
 ##  Dependências
 - Dependências do Spring Boot:
 - spring-boot-starter-data-jpa
 - spring-boot-starter-validation
 - spring-boot-starter-web
 - spring-boot-devtools
 -  Dependência do PostgreSQL:
 - postgresql
 - Dependência do Lombok:
 - lombok
 - Dependências de Teste:
 - spring-boot-starter-test
 - Dependência do Jackson Datatype JSR310:
   - com.fasterxml.jackson.datatype:jackson-datatype-jsr310
 ## Configuração do Banco de Dados
 - A aplicação usa o PostgreSQL como banco de dados. A configuração do banco de dados pode ser encontrada no arquivo application.properties:
  - spring.datasource.username=postgres
  - spring.datasource.password=postgres
 - spring.datasource.url=jdbc:postgresql://localhost:5434/rest
 - spring.jpa.hibernate.ddl-auto=update
 - spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
 - spring.jpa.show-sql=true
## Certifique-se de que um contêiner Docker PostgreSQL esteja em execução com a configuração especificada.
![image](https://github.com/teofilonicolau/bora_pra_cima_rest/assets/97030160/4209c623-1242-4ac7-9128-72cb2c93232c)

## Endpoints REST
- POST /users: Registrar um novo usuário.(http://localhost:8080/users)
- ![image](https://github.com/teofilonicolau/bora_pra_cima_rest/assets/97030160/181dd277-c815-4731-80db-a4cd5acae9c9)

- GET /users: Listar todos os usuários.(http://localhost:8080/users)
- ![image](https://github.com/teofilonicolau/bora_pra_cima_rest/assets/97030160/310060c5-ed95-4e94-9468-d1832b949c11)

- GET /users/{id}: Recuperar detalhes do usuário por ID.(http://localhost:8080/users/3)
- ![image](https://github.com/teofilonicolau/bora_pra_cima_rest/assets/97030160/50ebbcc8-13d5-432b-be0f-fbef9c1d0943)

- PUT /users/{id}: Atualizar detalhes do usuário por ID.(http://localhost:8080/users/3)
- ![image](https://github.com/teofilonicolau/bora_pra_cima_rest/assets/97030160/00951a4d-5f67-4092-bf6a-f1975211615a)

- DELETE /users/{id}: Excluir usuário por ID.(http://localhost:8080/users/3)
- ![image](https://github.com/teofilonicolau/bora_pra_cima_rest/assets/97030160/1393e1d5-9f08-4249-af9b-13f6409f92eb)
- ## Uso
 - Compile o projeto usando o Maven.
 - Execute a aplicação Spring Boot.
 - Use uma ferramenta como o Insomnia para interagir com a API (por exemplo, http://localhost:8080/users).
 - Sinta-se à vontade para explorar e estender a funcionalidade da API Bora Pra Cima com base em seus requisitos.




   

