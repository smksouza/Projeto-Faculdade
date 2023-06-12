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

public class Administrador extends Usuario {

    public void removerUsuario(ArrayList<Usuario> usuarios, int indice) {
        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.remove(indice);
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Índice de usuário inválido!");
        }
    }
}