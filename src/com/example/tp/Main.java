package com.example.tp;

public class Main {
public static void main(String[] args) {
	
	 Entreprise ent = new Entreprise();

     ent.ajouterEmploye(new EmployeHoraire("Alaoui", "Yassine", 80.0, 160));
     ent.ajouterEmploye(new EmployeSalarie("yagami", "light", 6000.0));
     ent.ajouterEmploye(new Vendeur("monkey", "luffy", 6090.0, 1200.0));
     ent.ajouterEmploye(new EmployeHoraire("Tazi", "Nadia", 100.0, 130));

     ent.afficherPaie();
}
}
