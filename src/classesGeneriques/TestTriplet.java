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
        System.out.println("Premier élément: " + tripletEntiers.getPremier());
        System.out.println("Second élément: " + tripletEntiers.getSecond());
        System.out.println("Troisieme élément: " + tripletEntiers.getTroisieme());

        // test chaines de caracteres
        Triplet<String> tripletChaines = new Triplet<>("Bonjour", "à", "tous");
        System.out.println("\nTriplet de chaînes de caractères:");
        tripletChaines.affiche();
        System.out.println("Premier élément: " + tripletChaines.getPremier());
        System.out.println("Second élément: " + tripletChaines.getSecond());
        System.out.println("Troisieme élément: " + tripletChaines.getTroisieme());

        // test doubles
        Triplet<Double> tripletDoubles = new Triplet<>(1.5, 2.5, 3.5);
        System.out.println("\nTriplet de doubles:");
        tripletDoubles.affiche();
        System.out.println("Premier élément: " + tripletDoubles.getPremier());
        System.out.println("Second élément: " + tripletDoubles.getSecond());
        System.out.println("Troisieme élément: " + tripletDoubles.getTroisieme());
    }
}
