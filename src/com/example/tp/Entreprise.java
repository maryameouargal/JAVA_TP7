package com.example.tp;

public class Entreprise {
	 private Employe[] employes;
	 private int nb;
	 
//		THE CONSTRUCTEUR USING SOURCE ONLY
	 
	 public Entreprise() {
		this.employes = new Employe[4];
		this.nb = 0;
	 }
	 
	 // ADD AN  EMPLOYE 
	    public void ajouterEmploye(Employe e) {
	        if (nb == employes.length) {
	            Employe[] bigger = new Employe[employes.length * 2];
	            System.arraycopy(employes, 0, bigger, 0, employes.length);
	            employes = bigger;
	        }
	        employes[nb] = e;
	        nb++;
	    }

	    // Affichage 
	    public void afficherPaie() {
	        System.out.println(" Bulletin de paie ");
	        for (int i = 0; i < nb; i++) {
	            System.out.println(employes[i]);
	        }
	        System.out.println("Masse salariale = " + masseSalariale() + " DH");
	    }

	    // Somme 
	    public double masseSalariale() {
	        double total = 0;
	        for (int i = 0; i < nb; i++) {
	            total += employes[i].calculerSalaire();
	        }
	        return total;
	    }
}
