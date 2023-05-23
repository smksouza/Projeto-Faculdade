/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principais;

/**
 *
 * @author Samuel
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {

    public static void cadastrarUsuario(Scanner input, ArrayList<Usuario> usuarios) {
        System.out.println("==========CADASTRO DE USUÁRIO==========");

        System.out.print("Digite o email: ");
        String email = input.nextLine().trim();
        if (email.isEmpty()) {
            System.out.println("Entrada inválida. O email não pode estar em branco.");
            return;
        }

        if (!email.contains("@")) {
            System.out.println("O email deve conter o símbolo @!");
        }

        System.out.print("Digite a senha: ");
        String senha = input.nextLine().trim();
        if (senha.isEmpty()) {
            System.out.println("Entrada inválida. A senha não pode estar em branco.");
            return;
        }

        System.out.print("Digite o nome: ");
        String nome = input.nextLine().trim();
        if (nome.isEmpty()) {
            System.out.println("Entrada inválida. O nome não pode estar em branco.");
            return;
        }

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

        System.out.print("Digite o CPF: ");
        String cpf = input.nextLine().trim();
        if (cpf.isEmpty()) {
            System.out.println("Entrada inválida. O CPF não pode estar em branco.");
            return;
        }

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
