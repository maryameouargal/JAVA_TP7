package com.example.tp;

public class Vendeur extends EmployeSalarie {

    private double commission;
    
//	THE CONSTRUCTEUR USING SOURCE ONLY
    
	public Vendeur(String nom, String prenom, double salaireMensuel, double commission) {
		super(nom, prenom, salaireMensuel);
		this.commission = commission;
	}
  
//	THE METHODE REDENIED 
    @Override
    public double calculerSalaire() {
        return salaireMensuel + commission;
    }  
}
