/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SaisieCorrecte {

    public static int saisieCorrecte() throws NombreTropPetitException {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Veuillez saisir un entier supérieur à 10 : ");
                nombre = scanner.nextInt();

                if (nombre <= 10) {
                    throw new NombreTropPetitException("Erreur : L'entier saisi doit être supérieur à 10.");
                }

                saisieValide = true; 
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Vous n'avez pas saisi un entier valide. Veuillez réessayer.");
                scanner.next(); 
            }
        }

        return nombre;
    }

    public static void main(String[] args) {
        try {
            int nombreSaisi = saisieCorrecte();
            System.out.println("Vous avez saisi l'entier : " + nombreSaisi);
        } catch (NombreTropPetitException e) {
            System.out.println(e.getMessage());
        }
    }
}