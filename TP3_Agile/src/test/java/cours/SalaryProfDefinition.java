package cours;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;

import CucumberTest.CucumberTest.TravauxDirigeDecorator;
import CucumberTest.CucumberTest.TravauxPratiqueDecorator;
import CucumberTest.CucumberTest.Cours;
import CucumberTest.CucumberTest.CoursMagistral;
import CucumberTest.CucumberTest.Professeur;
import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalaryProfDefinition {
	Professeur prof1;
	CoursMagistral  coursM;
    TravauxDirigeDecorator coursTD;
    TravauxPratiqueDecorator coursTP;
    
    
   
	@Given("Un professeur possède une liste des cours")
	public void Un_professeur_possède_une_liste_des_cours() {
		 // Write code here that turns the phrase above into concrete actions
        prof1 = new Professeur(25, "Benoit");
        coursM = new CoursMagistral("math",200);
        coursTD = new TravauxDirigeDecorator(coursTD);
       
        prof1.addCours(coursM);
        prof1.addCours(coursTD);
        
      
	    
	}

	
    
    Then
	
	@When("Affectation de nouveau_cours au professeur ")
	public void Affectation__de_nouveau_cours_au_professeur() {
	    // Write code here that turns the phrase above into concrete actions
		 coursTP = new TravauxPratiqueDecorator(coursTP);
		 prof1.addCours(coursTP);
	}
	
	
	@Then(" La salaire de professeur est calcule")
	public void Le_salaire_de_professeur_est_calcule() {
	    // Write code here that turns the phrase above into concrete actions
		double total =prof1.calculSalary();
	    assertEquals(755.0, total,0.05);
	}




}
