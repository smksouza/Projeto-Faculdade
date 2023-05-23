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

public class ProcurarUsuario {

    public static void ProcurarUsuario(String email, ArrayList<Usuario> usuarios) {
        System.out.println("==========PROCURAR USUÁRIO POR EMAIL==========");
        boolean encontrado = false;
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario uTemp = usuarios.get(i);
            if (email.equals(uTemp.getEmail())) {
                System.out.println("Usuário encontrado");
                System.out.println("\tNome: " + uTemp.getNome());
                System.out.println("\tEmail: " + uTemp.getEmail());
                System.out.println("\tSenha: " + uTemp.getSenha());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("USUÁRIO NÃO ENCONTRADO!");
        }
    }
}
