package com.example.tp;

public class EmployeHoraire extends Employe {

    private double tauxHoraire;
    private double heuresTravaillees;
    
//	THE CONSTRUCTEUR USING SOURCE ONLY
    
    
	public EmployeHoraire(String nom, String prenom, double tauxHoraire, double heuresTravaillees) {
		super(nom, prenom);
		this.tauxHoraire = tauxHoraire;
		this.heuresTravaillees = heuresTravaillees;
	}
	
// METHODE REDEFNIED 
    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}

