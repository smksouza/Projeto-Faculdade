package com.mycompany.principais;

/**
 *
 * @author samue
 */
/**
 * A classe "Usuario" representa um usuário do sistema. Possui atributos como
 * nome, email, senha, CPF e idade. Também possui métodos getter e setter para
 * acessar e modificar os atributos.
 */

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
