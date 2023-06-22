/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principais;

/**
 * Classe responsável por listar os usuários cadastrados.
 */
import java.util.ArrayList;

public class ListarUsuarios {

    /**
     * Lista todos os usuários cadastrados, exibindo seus emails, nomes e CPFs.
     * @param usuarios a lista de usuários cadastrados
     */
    public static void listarUsuarios(ArrayList<Usuario> usuarios) {
        System.out.println("==========TODOS OS USUÁRIOS CADASTRADOS==========");
        System.out.println("Email\t\tNome\t\tCPF");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getEmail() + "\t" + usuario.getNome() + "\t" + usuario.getCpf());
        }
        System.out.println("=================================================");
        System.out.println("Usuários Totais: " + usuarios.size());
    }
}
