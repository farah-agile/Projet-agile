package com.eclipse.bluej;

import CucumberTest.CucumberTest.Professeur;

public class ProfesseurAdapter extends Client {
	private Professeur professeur ;

	public ProfesseurAdapter(String n, String p, int a, CompteBancaire compte, Professeur professeur) {
		super(n, p, a, compte);
		this.professeur = professeur;
		// TODO Auto-generated constructor stub
	}
	
	 public void virerArgent(CompteBancaire cb, double m) {
	
//		 this.getCompte().virer(cb, m);
		 m = (double)professeur.calculSalary();
		 this.getCompte().virer(cb, m);
	 }
	 
}
