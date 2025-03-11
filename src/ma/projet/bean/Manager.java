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
public class Manager extends Personne {
    private String service;

    public Manager(int id, String nom, String prenom, double salaire, String service) {
        super(id, nom, prenom, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.30;
    }

    @Override
    public String affiche() {
        return super.affiche() + ", Service: " + service;
    }
}
