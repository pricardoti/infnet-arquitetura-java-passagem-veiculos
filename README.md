# Infnet Arquitetura Java - Passagem Veiculos

### Arquitetura de Projeto:
![desenho de arquitetura do projeto](https://github.com/pricardoti/infnet-arquitetura-java-passagem-veiculos/blob/main/img/arquitetura.PNG)

1. A classe principal é ``PASSAGEM``. Uma Passagem tem um ``CLIENTE`` (classe de associação) e um ``VEICULO`` (classe mãe) vinculado a passagem. 
2. Um ``VEICULO`` e/ou ``CLIENTE`` pode ter **nenhuma** ou **varias** passagens. 
3. Existem três tipos de veículos: ``TRANSPORTE``, ``CARGA``, ``PASSEIO`` (classes filhas).

*Este é um projeto didático, então em alguns pontos foram abstraidos a complexidade de criação de novas entidades, validações e outros fatores que normalmente levamos em consideração em aplicações produtivas.*

### Configuração do Projeto

---

1. Pode executar na IDE de sua preferência;
2. Este projeto atualmente está configurado para banco de dados H2 - *caso deseje usar outro, alterar as configurações no ``application.yaml``*;
3. Executando a aplicação via CLI:
```Windows
./mvnw spring-boot:run
```

#### Pontos Importantes

---

Simplemente fazendo o binding de um atritbuto do ``LocalDateTime`` no formulario JSP, irá apresentar erro de conversão na hora de settar o valor.

Resovendo o problema da ``LocalDateTime``:
```@DateTimeFormat
@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
private LocalDateTime dataHora;
```