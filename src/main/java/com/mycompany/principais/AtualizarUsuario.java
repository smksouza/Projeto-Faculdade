package com.mycompany.principais;

import java.util.ArrayList;
import java.util.Scanner;

public class AtualizarUsuario {

    public static void atualizarUsuario(Scanner input, ArrayList<Usuario> usuarios) {
        System.out.println("========== ATUALIZAR USUÁRIO ==========");

        // Solicitar o email do usuário que deseja atualizar
        System.out.println("Digite o email do usuário que deseja atualizar:");
        String email = input.nextLine();

        Usuario usuarioEncontrado = null;

        // Procurar o usuário com base no email fornecido
        for (Usuario usuario : usuarios) {
            if (email.equals(usuario.getEmail())) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        if (usuarioEncontrado != null) {
            System.out.println("Usuário encontrado");

            // Solicitar e atualizar o nome do usuário
            System.out.println("Digite o novo nome:");
            String novoNome = lerEntradaNaoVazia(input);
            if (!novoNome.isEmpty()) {
                usuarioEncontrado.setNome(novoNome);
            }

            // Solicitar e atualizar o email do usuário
            System.out.println("Digite o novo email:");
            String novoEmail = lerEntradaNaoVazia(input);
            if (!novoEmail.isEmpty()) {
                if (!novoEmail.contains("@")) {
                    System.out.println("O email deve conter o símbolo @!");
                    return;
                }
                for (Usuario usuario : usuarios) {
                    if (!usuario.equals(usuarioEncontrado) && novoEmail.equals(usuario.getEmail())) {
                        System.out.println("O email já está cadastrado.");
                        return;
                    }
                }
                usuarioEncontrado.setEmail(novoEmail);
            }

            // Solicitar e atualizar a senha do usuário
            System.out.println("Digite a nova senha:");
            String novaSenha = lerEntradaNaoVazia(input);
            if (!novaSenha.isEmpty()) {
                usuarioEncontrado.setSenha(novaSenha);
            }

            // Solicitar e atualizar o CPF do usuário
            System.out.println("Digite o novo CPF:");
            String novoCpf = lerEntradaNaoVazia(input);
            if (!novoCpf.isEmpty()) {
                for (Usuario usuario : usuarios) {
                    if (!usuario.equals(usuarioEncontrado) && novoCpf.equals(usuario.getCpf())) {
                        System.out.println("O CPF já está cadastrado.");
                        return;
                    }
                }
                usuarioEncontrado.setCpf(novoCpf);
            }

            // Solicitar e atualizar a idade do usuário
            System.out.println("Digite a nova idade:");
            int novaIdade = lerIdadeValida(input);
            usuarioEncontrado.setIdade(novaIdade);

            System.out.println("Usuário atualizado com sucesso!");
        } else {
            System.out.println("USUÁRIO NÃO ENCONTRADO!");
        }
    }

    // Ler uma entrada do usuário que não pode estar vazia
    private static String lerEntradaNaoVazia(Scanner input) {
        String entrada = input.nextLine().trim();
        while (entrada.isEmpty()) {
            System.out.println("Entrada inválida! A entrada não pode estar vazia Digite novamente:");
            entrada = input.nextLine().trim();
        }
        return entrada;
    }

    // Ler uma idade válida do usuário (número inteiro)
    private static int lerIdadeValida(Scanner input) {
        int novaIdade = 0;
        boolean idadeValida = false;
        while (!idadeValida) {
            String novaIdadeStr = lerEntradaNaoVazia(input);
            if (!novaIdadeStr.contains(" ")) {
                try {
                    novaIdade = Integer.parseInt(novaIdadeStr);
                    idadeValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Idade inválida! A idade deve ser um número inteiro.");
                }
            } else {
                System.out.println("Idade inválida! A idade não pode conter espaços em branco.");
            }
        }
        return novaIdade;
    }
}
