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
    
    
   
	@Given("Un professeur possède les cours")
	public void Un_professeur_possède_les_cours() {
		 // Write code here that turns the phrase above into concrete actions
        prof1 = new Professeur(25, "Benoit");
        coursM = new CoursMagistral("math",200);
        coursTD = new TravauxDirigeDecorator(coursTD);
       
        prof1.addCours(coursM);
        prof1.addCours(coursTD);
        
      
	    
	}

	@When("Affectation de cours du professeur est changée ")
	public void Affectation__de_cours_du_professeur_est_changee() {
	    // Write code here that turns the phrase above into concrete actions
		 coursTP = new TravauxPratiqueDecorator(coursTP);
		 prof1.addCours(coursTP);
	}
	
	
	@Then("Le professeur obtient un bon resultat de salaire")
	public void Le_professeur_obtient_un_bon_resultat_de_salaire() {
	    // Write code here that turns the phrase above into concrete actions
		double total =prof1.calculSalary();
	    assertEquals(755.0, total,0.05);
	}




}
