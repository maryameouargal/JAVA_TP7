package com.example.tp;

public class EmployeSalarie extends Employe {

    protected double salaireMensuel;

    
//	THE CONSTRUCTEUR USING SOURCE ONLY
    
	public EmployeSalarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}
	
// THE METHODE REDEFNIED 
    @Override
    public double calculerSalaire() {
        return salaireMensuel;
    }

}
