/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import ma.projet.Personne;
import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;

/**
 *
 * @author admin
 */



public class Test {
    public static void listerPersonnes(List<? extends Personne> personnes) {
        for (Personne personne : personnes) {
            System.out.println(personne.affiche() + ", Salaire calculé: " + personne.calculerSalaire());
        }
    }

    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<>(Arrays.asList(
            new Developpeur(1, "Dupont", "Jean", 3000, "Java"),
            new Manager(2, "Martin", "Alice", 5000, "Ressources Humaines")
        ));

        listerPersonnes(personnes);
    }
}
