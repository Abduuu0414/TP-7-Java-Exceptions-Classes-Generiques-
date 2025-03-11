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

public class Fibonacci {

    static class NombreInvalideException extends Exception {
        public NombreInvalideException(String message) {
            super(message);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int saisirEntierPositif() throws NombreInvalideException {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Veuillez saisir un entier superieur à 0 : ");
                nombre = scanner.nextInt();

                // Verifier si le nombre est superieur à 0
                if (nombre <= 0) {
                    throw new NombreInvalideException("Erreur : L'entier saisi doit etre superieur à 0.");
                }

                saisieValide = true; // Si la saisie est valide, on sort de la boucle
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Vous n'avez pas saisi un entier valide. Veuillez reessayer.");
                scanner.next(); // Vide le buffer du scanner pour eviter une boucle infinie
            }
        }

        return nombre;
    }

    public static void main(String[] args) {
        try {
            int n = saisirEntierPositif();

            int resultat = fibonacci(n);
            System.out.println("Le " + n + "eme nombre de Fibonacci est : " + resultat);
        } catch (NombreInvalideException e) {
            System.out.println(e.getMessage());
        }
    }
}
