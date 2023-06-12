package com.mycompany.principais;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverUsuario {

    public static void removerUsuario(Scanner input, ArrayList<Usuario> usuarios, Administrador administrador) {
        System.out.println("==========REMOVER USUÁRIO==========");

        System.out.println("Digite o email do administrador ou do usuário a ser removido:");
        String email = input.nextLine();

        System.out.println("Digite a senha:");
        String senha = input.nextLine();

        // Verificar se o email e senha correspondem a um administrador
        if (email.equals(administrador.getEmail()) && senha.equals(administrador.getSenha())) {
            // Remover usuário como administrador
            System.out.println("Credenciais de administrador válidas. Removendo usuário como administrador.");
            removerUsuarioComoAdministrador(input, usuarios);
        } else {
            // Remover usuário usando email e senha
            removerUsuarioPorEmailSenha(email, senha, usuarios, input);
        }
    }

    private static void removerUsuarioComoAdministrador(Scanner input, ArrayList<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários para remover.");
            return;
        }

        System.out.println("Lista de usuários:");
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            System.out.println("[" + i + "] " + usuario.getEmail());
        }

        System.out.println("Digite o número do usuário a ser removido:");
        int numUser;
        try {
            numUser = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. O número do usuário deve ser um valor numérico.");
            return;
        }

        if (numUser < 0 || numUser >= usuarios.size()) {
            System.out.println("Número de usuário inválido!");
            return;
        }

        Usuario usuarioRemover = usuarios.get(numUser);

        System.out.println("Tem certeza de que deseja excluir o usuário " + usuarioRemover.getEmail() + "?");
        System.out.println("Digite 1 para confirmar a exclusão ou 0 para voltar ao menu:");

        int confirmacao;
        try {
            confirmacao = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite apenas 0 ou 1.");
            return;
        }

        if (confirmacao == 1) {
            usuarios.remove(numUser);
            System.out.println("Usuário removido com sucesso!");
        } else if (confirmacao == 0) {
            System.out.println("Operação cancelada. Retornando ao menu.");
        } else {
            System.out.println("Opção inválida. Retornando ao menu.");
        }
    }

    private static void removerUsuarioPorEmailSenha(String email, String senha, ArrayList<Usuario> usuarios, Scanner input) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                System.out.println("Tem certeza de que deseja excluir o usuário " + usuario.getEmail() + "?");
                System.out.println("Digite 1 para confirmar a exclusão ou 0 para voltar ao menu:");

                int confirmacao;
                try {
                    confirmacao = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite apenas 0 ou 1.");
                    return;
                }

                if (confirmacao == 1) {
                    usuarios.remove(i);
                    System.out.println("Usuário removido com sucesso!");
                } else if (confirmacao == 0) {
                    System.out.println("Operação cancelada. Retornando ao menu.");
                } else {
                    System.out.println("Opção inválida. Retornando ao menu.");
                }

                return;
            }
        }

        System.out.println("Credenciais inválidas. Não foi possível remover o usuário.");
    }

}
