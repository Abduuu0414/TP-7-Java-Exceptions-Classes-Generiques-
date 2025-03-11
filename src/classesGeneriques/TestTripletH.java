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
public class TestTripletH {
    public static void main(String[] args) {
        TripletH<Integer, String, Double> triplet1 = new TripletH<>(42, "Hello", 3.14);
        System.out.println("Triplet 1:");
        triplet1.affiche();
        System.out.println("Premier élément: " + triplet1.getPremier());
        System.out.println("Second élément: " + triplet1.getSecond());
        System.out.println("Troisieme élément: " + triplet1.getTroisieme());

        TripletH<String, Boolean, Character> triplet2 = new TripletH<>("Java", true, 'A');
        System.out.println("\nTriplet 2:");
        triplet2.affiche();
        System.out.println("Premier élément: " + triplet2.getPremier());
        System.out.println("Second élément: " + triplet2.getSecond());
        System.out.println("Troisieme élément: " + triplet2.getTroisieme());
    }
}
