package com.example.tp;

public abstract class Employe {
	  protected String nom;
	  protected String prenom;
	  
//		THE CONSTRUCTEUR USING SOURCE ONLY
	  
	  public Employe(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	  }
//     methode to be redefnied in every sous-class
	  public abstract double calculerSalaire();
	  
//		ToString by  USING SOURCE ONLY
	  
	  @Override
	  public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", calculerSalaire()=" + calculerSalaire() + "DH]";
	  }
	  
}
