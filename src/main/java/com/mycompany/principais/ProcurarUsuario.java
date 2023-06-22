/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principais;

import java.util.ArrayList;

public class ProcurarUsuario {

    // Método para procurar um usuário pelo email na lista de usuários
    public static void ProcurarUsuario(String email, ArrayList<Usuario> usuarios) {
        System.out.println("==========PROCURAR USUÁRIO POR EMAIL==========");
        boolean encontrado = false;
        
        // Percorre a lista de usuários
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario uTemp = usuarios.get(i);
            
            // Verifica se o email do usuário atual é igual ao email procurado
            if (email.equals(uTemp.getEmail())) {
                System.out.println("Usuário encontrado");
                System.out.println("\tNome: " + uTemp.getNome());
                System.out.println("\tEmail: " + uTemp.getEmail());
                System.out.println("\tCPF: " + uTemp.getCpf());
                encontrado = true;
                break;
            }
        }
        
        // Caso o usuário não tenha sido encontrado
        if (!encontrado) {
            System.out.println("USUÁRIO NÃO ENCONTRADO!");
        }
    }
}
