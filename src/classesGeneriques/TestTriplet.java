/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesGeneriques;

/**
 *
 * @author admin
 */
public class TestTriplet {
    public static void main(String[] args) {
        
        // test chaines entiers
        Triplet<Integer> tripletEntiers = new Triplet<>(1, 2, 3);
        
        System.out.println("Triplet d'entiers:");
        tripletEntiers.affiche();
        System.out.println("Premier element: " + tripletEntiers.getPremier());
        System.out.println("Second element: " + tripletEntiers.getSecond());
        System.out.println("Troisieme element: " + tripletEntiers.getTroisieme());

        // test chaines de caracteres
        Triplet<String> tripletChaines = new Triplet<>("Bonjour", "à", "tous");
        System.out.println("\nTriplet de chaînes de caractères:");
        tripletChaines.affiche();
        System.out.println("Premier element: " + tripletChaines.getPremier());
        System.out.println("Second element: " + tripletChaines.getSecond());
        System.out.println("Troisieme element: " + tripletChaines.getTroisieme());

        // test doubles
        Triplet<Double> tripletDoubles = new Triplet<>(1.5, 2.5, 3.5);
        System.out.println("\nTriplet de doubles:");
        tripletDoubles.affiche();
        System.out.println("Premier element: " + tripletDoubles.getPremier());
        System.out.println("Second element: " + tripletDoubles.getSecond());
        System.out.println("Troisieme element: " + tripletDoubles.getTroisieme());
    }
}
