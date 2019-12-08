package com.eclipse.bluej;

import CucumberTest.CucumberTest.Professeur;

public class ProfesseurAdapter extends Client {
	private Professeur professeur ;

	public ProfesseurAdapter(String n, String p, int a, CompteBancaire compte, Professeur professeur) {
		super(n, p, a, compte);
		this.professeur = professeur;
	}
	
	 public double virerArgent(CompteBancaire cb, double m) {
	   
		 m = (double)professeur.calculSalary();
		 System.out.println("le montant apres est "+m);
		 this.getCompte().virer(cb, m);
		 return cb.getSolde();
		 
	 }
	 
	 
}
