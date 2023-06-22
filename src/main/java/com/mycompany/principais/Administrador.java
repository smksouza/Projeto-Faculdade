/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principais;

/**
 * Esta é a classe Administrador, que representa um tipo de usuário com privilégios administrativos.
 * Ela estende a classe Usuario, que provavelmente representa um usuário genérico no sistema.
 * A classe Administrador possui um método para remover um usuário da lista de usuários.
 * 
 * Autor: Samuel
 */

import java.util.ArrayList;

public class Administrador extends Usuario {

    /**
     * Remove um usuário da lista de usuários com base no índice fornecido.
     * 
     * @param usuarios a lista de usuários
     * @param indice o índice do usuário a ser removido
     */
    public void removerUsuario(ArrayList<Usuario> usuarios, int indice) {
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.remove(indice);
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Índice de usuário inválido!");
        }
    }
}