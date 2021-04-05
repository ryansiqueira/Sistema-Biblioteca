# Desafio DevSchool MJV

# Sistema Biblioteca

#### Colaboradores
- [Ryan Siqueira dos Santos](https://github.com/ryansiqueira)
- [Ronaldo Pereira](https://github.com/rpzbass)
- [Matheus de Oliveira Pereira](https://github.com/Mattloksz)

#### Estrutura do Projeto
Dividimos as classes em pacotes de acordo com suas responsabilidades.
- Model: onde definimos os modelos ou seja as classes dos objetos que usamos no sistema
- Repository: onde definimos o JPA para acessar os dados do BD
- Service: camada que contém regras de negócio e lógica de conversão e validação de persistência
- Resource: também chamado de Controller foi onde definimos a exposição dos recursos via API por meio da definição dos endpoints
- Config: onde definimos as configurações do Swagger para documentar a API 
- Exception: onde tratamos todas as exceções que poderemos ter em nosso sistema

#### Configuração do Banco para usar o Spring Data Jpa

##### Precisamos adicionar duas novas dependencias em nosso projeto: O starter do Spring Data Jpa e o banco de sua preferencia, no exemplo estamos usando o H2

```
<!-- RECURSOS DO JPA COM SPRING -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- BANCO EM MEMORIA -->
<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>
    
```

##### Agora precisamos informar os dados de conexão no arquivo `application.properties`
  * Habilitar o H2 Console em http://localhost:8080/h2-console:
  ``` 
  spring.h2.console.enabled=true
  spring.h2.console.path=/h2-console
  ```
   * Algumas versões do Spring tem exigido adicionar estas configurações no `application.properties`
  ``` 
  spring.datasource.url=jdbc:h2:mem:testdb
  spring.datasource.driverClassName=org.h2.Driver
  spring.datasource.username=sa
  spring.datasource.password=
  spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
  ```
   
  * Exibir as intruções SQL executadas pela aplicação
  ``` 
  spring.jpa.show-sql=true
  ```
  
  * Testando em http://localhost:8080/h2-console:
  ``` 
  JDBC URL: jdbc:h2:mem:testdb
  User Name: sa
  Pasword: <deixa vazio>
  ``` 
 #### Iniciando a aplicação

1. Execute a classe `SistemalivrariaApplication`: A aplicação será iniciada.

3. Digite no navegador `http://localhost:8080/swagger-ui.html`

##### Será disponível a pagina do Swagger exibindo todos os recursos da API e POST para adicionar Cadastro com Endereço via Dto.
##### Clique em post e depois em try it out e adicione: cpf, email, login, senha, nome e telefone. Na parte de endereço adicionar somente o cep.
![](![image](https://user-images.githubusercontent.com/68912055/113592779-f9854700-960b-11eb-9843-11c46b2684ea.png)


##### Realizando um teste de cadastro de CEP
```
POST: http://localhost:8080/swagger-ui.html#/cadastro-resource/insertUsingPOST
{
  "cpf": "851624512",
  "email": "teste@teste",
  "enderecoDto": {
    "bairro": "string",
    "cep": "69050-030",
    "ibge": "string",
    "id": 0,
    "localidade": "string",
    "logradouro": "string",
    "uf": "string"
  },
  "id": 0,
  "login": "teste",
  "nome": "teste",
  "senha": "teste",
  "telefone": "teste"
}
```

> Deverá retornar status 201

3. Digite no navegador `http://localhost:8080/h2-console/`

![](![image]https://user-images.githubusercontent.com/68912055/113593448-d313db80-960c-11eb-9dbc-1f90707bbb85.png)
![](![image](https://user-images.githubusercontent.com/68912055/113593657-09e9f180-960d-11eb-8a3f-83c47f12697f.png)
![](![image](https://user-images.githubusercontent.com/68912055/113593723-1d955800-960d-11eb-8717-21f351a394c3.png)


