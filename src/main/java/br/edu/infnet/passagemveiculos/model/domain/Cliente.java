package br.edu.infnet.passagemveiculos.model.domain;

public class Cliente {

    private String nome;
    private String cpfCnpj;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente[" +
                "nome=" + nome +
                ", cpfCnpj=" + cpfCnpj +
                ", email=" + email +
                ']';
    }
}
