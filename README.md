# Infnet Arquitetura Java - Passagem Veiculos

### Arquitetura de Projeto:

![desenho de arquitetura do projeto](https://github.com/pricardoti/infnet-arquitetura-java-passagem-veiculos/blob/main/img/arquitetura.PNG)

1. A classe principal é ``PASSAGEM``. Uma Passagem tem um ``CLIENTE`` (classe de associação) e um ``VEICULO`` (classe mãe) vinculado a passagem. 
2. Um ``VEICULO`` e/ou ``CLIENTE`` pode ter **nenhuma** ou **varias** passagens. 
3. Existem três tipos de veículos: ``TRANSPORTE``, ``CARGA``, ``PASSEIO`` (classes filhas).

*Este é um projeto didático, então em alguns pontos foram abstraidos a complexidade de **criação de novas entidades (Value Object/DTO), validações, tratamento de erros** e outros fatores que normalmente levamos em consideração em aplicações produtivas.*

### Configuração do Projeto

---

1. Pode executar na IDE de sua preferência;
2. Este projeto atualmente está configurado para banco de dados H2 - *caso deseje usar outro, alterar as configurações no ``application.yaml``*;
3. Executando a aplicação via CLI:
```Windows
./mvnw spring-boot:run
```

#### Observações e Pontos Importantes

---

1. Optei por não usar o ``@Autowired`` explicitamente, fazendo a injeção por construtor - apenas por estilo de codigicação pessoal;
2. Optei por não usar ``@Table``, deixando a cargo do framework nomear as tabelas;
3. No desenho de arquitetura o atributo **operador** passou a ser o **usuario** logado dentro da aplicação para tentar ficar mais proximo do mundo real;
4. O **vinculo/associação** do **usuario logado** (operador) foi realizado com a entidade de **passagem**, sendo possivel reaproveitar os cadastro de **clientes** e **veiculos** para outros usuarios (operadores);
5. Simplemente fazendo o binding de um atritbuto do ``LocalDateTime`` no formulario JSP, irá apresentar erro de conversão na hora de settar o valor.

Resovendo o problema da ``LocalDateTime``:
```@DateTimeFormat
@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
private LocalDateTime dataHora;
```

#### Usuario de Acesso do APP

---

url: http://localhost:8080/

usuario/email: adm@infnet.edu.br

senha: 123