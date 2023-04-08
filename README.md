
# Luna Hostel

Aplicação que controla o fluxo de hospedagem de animais pets.

## Requisitos Técnicos

- API Rest apta a receber requisições via Postman;
- Framework Spring Boot e Java 8 ou superior;
- Persistência com JPA em banco de dados PostgreSQL ou H2;
- Usar Repository Pattern (Controller, Service, Repository)
- Usar porta 8090;
- Interface gráfica que exiba a documentação da API (SpringFox).


## Requisitos Funcionais

- Os dados devem ser gravados em tabelas separadas (Pet e Hospedagem);

**1. Cadastrar os dados do Pet**
- Pet:
    - Id, Nome, Idade, Porte, Raça, Proprietário, Hospedagens;
- Atualizar um Pet;
- Remover um Pet;
- Consulta que retorne todos os Pets com as Hospedagens;
- Consulta que retorne um Pet especifico por Id com as Hospedagens;

**2. Cadastrar os dados da hospedagem**
- Hospedagem:
    - Id, Data de entrada, Data de saída, Pet;
- Atualizar uma Hospedagem;
- Remover uma Hospedagem;
- Consulta que retorne todas as Hospedagens;
- Consulta que retorne uma Hospedagem especifica por Id;
    - **Extra: Trazer os dados do Pet na consulta da hospedagem*

Documentação API: (http://localhost:8090/swagger-ui.html)