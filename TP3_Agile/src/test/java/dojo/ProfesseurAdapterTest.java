package dojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.eclipse.bluej.CompteBancaire;
import com.eclipse.bluej.ProfesseurAdapter;

import CucumberTest.CucumberTest.Cours;
import CucumberTest.CucumberTest.CoursMagistral;
import CucumberTest.CucumberTest.Professeur;
import CucumberTest.CucumberTest.TravauxDirigeDecorator;

public class ProfesseurAdapterTest {

	@Test
	public void testVirerArgent() {
		Professeur professeur;
		CompteBancaire c1 = new CompteBancaire("FR1235467",6000);
		CompteBancaire c2 = new CompteBancaire("FR7654321",3000);
		professeur = new Professeur(23,"farah");
		CoursMagistral cours = new CoursMagistral("Math",2300);
		professeur.addCours(cours);
		professeur.addCours(new TravauxDirigeDecorator(cours));
		
		ProfesseurAdapter profAdap = new ProfesseurAdapter("farah", "ABOUELOMOUM", 25, c1, professeur);
		double m = professeur.calculSalary();
		
		assertEquals(3000+m, profAdap.virerArgent(c2, m) , 0.1);
		System.out.println("le nouveau solde du compte c2 est "+c2.getSolde());
		System.out.println("le nouveau solde du compte c1 est "+c1.getSolde());
	}

}
