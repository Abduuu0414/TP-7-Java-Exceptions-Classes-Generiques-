/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.bean;

import ma.projet.Personne;
/**
 *
 * @author admin
 */

public class Developpeur extends Personne {
    private String specialite;

    public Developpeur(int id, String nom, String prenom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.10;
    }

    @Override
    public String affiche() {
        return super.affiche() + ", Specialité: " + specialite;
    }
}
