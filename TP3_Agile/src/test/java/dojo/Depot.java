package dojo;
import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import com.eclipse.bluej.CompteBancaire;

public class Depot {
	private CompteBancaire compte ;
	
	@Given("je veux deposer un montant dans mon compte")
	public void je_veux_deposer_un_montant_dans_mon_compte() {
	    // Write code here that turns the phrase above into concrete actions
		this.compte = new CompteBancaire("FR87785569",3000) ;
//	    throw new PendingException();
	}

	@When("je valide l'operation")
	public void je_valide_l_operation() {
	    // Write code here that turns the phrase above into concrete actions
		this.compte.sampleMethodDeposer(1000,"FR87785569");
//	    throw new PendingException();
	}

	@Then("le solde est incrémenté suite au depot d'argent")
	public void le_solde_est_incrémenté_suite_au_depot_d_argent() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(4000.0, this.compte.getSolde(), 0.1);
//	    throw new PendingException();
	}
	
	

}
