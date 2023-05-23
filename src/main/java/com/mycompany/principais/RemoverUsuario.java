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

public class RemoverUsuario {
    public static void removerUsuario(Scanner input, ArrayList<Usuario> usuarios) {
        System.out.println("==========REMOVER USUÁRIO==========");
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario uTemp = usuarios.get(i);
            System.out.println("[" + i + "] " + uTemp.getEmail());
        }
        System.out.println("Digite o número do usuário!");

        String numUserStr = input.nextLine();

        if (numUserStr.isEmpty()) {
            System.out.println("Entrada inválida. O número do usuário não pode estar em branco.");
            return;
        }

        int numUser;
        try {
            numUser = Integer.parseInt(numUserStr);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. O número do usuário deve ser um valor numérico.");
            return;
        }

        if (numUser < 0 || numUser >= usuarios.size()) {
            System.out.println("Número de usuário inválido!");
            return;
        }

        usuarios.remove(numUser);
    }
}
