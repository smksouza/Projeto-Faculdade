package com.mycompany.principais;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {

    public static void cadastrarUsuario(Scanner input, ArrayList<Usuario> usuarios, Administrador administrador) {
        System.out.println("==========CADASTRO DE USUÁRIO==========");

        // Solicitar e validar o email do usuário
        System.out.print("Digite o email: ");
        String email = input.nextLine().trim();
        if (email.isEmpty()) {
            System.out.println("Entrada inválida. O email não pode estar em branco.");
            return;
        }

        if (!email.contains("@")) {
            System.out.println("O email deve conter o símbolo @!");
            return;
        }

        // Verifica se o email já está cadastrado
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                System.out.println("O email já está cadastrado.");
                return;
            }
        }

        // Verifica se o email é igual ao do administrador
        if (email.equals(administrador.getEmail())) {
            System.out.println("O email já está cadastrado como administrador.");
            return;
        }

        // Solicitar e validar a senha do usuário
        System.out.print("Digite a senha: ");
        String senha = input.nextLine().trim();
        if (senha.isEmpty()) {
            System.out.println("Entrada inválida. A senha não pode estar em branco.");
            return;
        }

        // Solicitar e validar o nome do usuário
        System.out.print("Digite o nome: ");
        String nome = input.nextLine().trim();
        if (nome.isEmpty()) {
            System.out.println("Entrada inválida. O nome não pode estar em branco.");
            return;
        }

        // Solicitar e validar a idade do usuário
        System.out.print("Digite a idade: ");
        String idadeStr = input.nextLine().trim();
        int idade;
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. A idade deve ser um valor numérico.");
            return;
        }

        if (idade < 0) {
            System.out.println("Entrada inválida. A idade não pode ser um valor negativo.");
            return;
        }

        // Solicitar e validar o CPF do usuário
        System.out.print("Digite o CPF: ");
        String cpf = input.nextLine().trim();
        if (cpf.isEmpty()) {
            System.out.println("Entrada inválida. O CPF não pode estar em branco.");
            return;
        }

        // Verifica se o CPF já está cadastrado
        for (Usuario u : usuarios) {
            if (u.getCpf().equals(cpf)) {
                System.out.println("O CPF já está cadastrado.");
                return;
            }
        }

        // Cria um novo usuário e o adiciona à lista de usuários
        Usuario u = new Usuario();
        u.setEmail(email);
        u.setSenha(senha);
        u.setNome(nome);
        u.setIdade(idade);
        u.setCpf(cpf);

        usuarios.add(u);
        System.out.println("Usuário cadastrado com sucesso!");
    }
}