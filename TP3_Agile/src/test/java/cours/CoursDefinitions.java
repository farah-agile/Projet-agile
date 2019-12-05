package cours;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import CucumberTest.CucumberTest.TravauxDirigeDecorator;
import CucumberTest.CucumberTest.Cours;
import CucumberTest.CucumberTest.CoursMagistral;
import CucumberTest.CucumberTest.Professeur;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CoursDefinitions {
	Professeur prof1;
	CoursMagistral  coursM;
    TravauxDirigeDecorator cours1;
    Professeur prof2;
	@Given("Affecter un cours Math pour professeur Benoit")
	public void affecter_un_cours_Math_pour_professeur_Benoit() {
		 // Write code here that turns the phrase above into concrete actions
        prof1 = new Professeur(25, "Benoit");
        coursM = new CoursMagistral("math",300);
        cours1 = new TravauxDirigeDecorator(coursM);
        //cours1.setProf(prof1);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Un cours est ajouté dans le prof")
	public void un_cours_est_ajouté_dans_le_prof() {
	    // Write code here that turns the phrase above into concrete actions
		 prof1.addCours(cours1);
	   
	}
	
	@Then("Le prof possèdes un cours")
	public void le_prof_possèdes_un_cours() {
	    // Write code here that turns the phrase above into concrete actions
		ArrayList<Cours> coursList =  prof1.getCoursList();
        assertEquals(1, coursList.size());
	    
	}


	@Given("Une liste de cours pour un professeur")
    public void une_liste_de_cours_pour_un_professeur() {
    	CoursMagistral cours2 = new CoursMagistral("anglais",300);
    	CoursMagistral cours3 = new CoursMagistral("espa",456);
    	prof2 = new Professeur(35,"Allai");
    	prof2.addCours(cours2);
    	prof2.addCours(cours3);
    }
	@When("Supprimer tous les cours de prof")
	public void supprimer_tous_les_cours_de_prof() {
	    // Write code here that turns the phrase above into concrete actions
		prof2.deleteAllCours();
	}
    
    @Then("Le nombre de cours est zero")
    public void le_nombre_de_cours_est_trois() {
    	assertEquals(0, prof2.getCoursList().size());
    }
    


}
