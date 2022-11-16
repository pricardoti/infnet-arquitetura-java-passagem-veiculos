# Infnet Arquitetura Java - Passagem Veiculos

Executando a aplicação via CLI:
```Windows
./mvnw spring-boot:run
```

## Pontos Importantes

---

Simplemente fazendo o binding de um atritbuto do ``LocalDateTime`` no formulario JSP, irá apresentar erro de conversão na hora de settar o valor.

Resovendo o problema da ``LocalDateTime``:
```@DateTimeFormat
@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
private LocalDateTime dataHora;
```