package cours;

import static org.junit.Assert.assertEquals;

import CucumberTest.CucumberTest.CoursMagistral;
import CucumberTest.CucumberTest.Professeur;
import CucumberTest.CucumberTest.TravauxDirigeDecorator;
import CucumberTest.CucumberTest.TravauxPratiqueDecorator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class SalaryProfDefinitions {
	
	Professeur prof1;
	CoursMagistral  coursM;
    TravauxDirigeDecorator coursTD;
    TravauxPratiqueDecorator coursTP;
	
	
  @Given("Un professeur possède une liste des cours")
  public void Un_professeur_possède_une_liste_des_cours() {
		 // Write code here that turns the phrase above into concrete actions
     prof1 = new Professeur(25, "Benoit");
     coursM = new CoursMagistral("math",200);
     coursTD = new TravauxDirigeDecorator(coursM);
    
     prof1.addCours(coursM);
     prof1.addCours(coursTD);
	}

  @When("Affectation de nouveau_cours au professeur")
  public void Affectation__de_nouveau_cours_au_professeur() {
	    // Write code here that turns the phrase above into concrete actions
		 coursTP = new TravauxPratiqueDecorator(coursM);
		 prof1.addCours(coursTP);
	}

  @Then("La salaire de professeur est calcule")
  public void Le_salaire_de_professeur_est_calcule() {
	    // Write code here that turns the phrase above into concrete actions
		double total =prof1.calculSalary();
	    assertEquals(1155.0, total,0.05);
	}


}
