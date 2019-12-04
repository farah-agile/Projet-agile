package dojo;
import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import com.eclipse.bluej.CompteBancaire;

public class Retrait {
	
	private CompteBancaire compte;
	
	@Given("je veux retirer l'argent sachant que le montant est inférieur au solde")
	public void je_veux_retirer_l_argent_sachant_que_le_montant_est_inférieur_au_solde() {
		
		this.compte = new CompteBancaire("FR1234535",2000) ;
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("je valide l'operation du premier retrait")
	public void je_valide_l_operation_du_premier_retrait() {
	    // Write code here that turns the phrase above into concrete actions
		this.compte.sampleMethodRetirer(1000,"FR1234535");
//	    throw new PendingException();
	}

	@Then("le solde est décrémenté suite au retrait du montant")
	public void le_solde_est_décrémenté_suite_au_retrait_du_montant() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(1000.0,this.compte.getSolde(), 0.1);
//	    throw new PendingException();
	}

	

	@Given("je veux retirer l'argent sachant que le montant est supérieur au solde du compte")
	public void je_veux_retirer_l_argent_sachant_que_le_montant_est_supérieur_au_solde_du_compte() {
	    // Write code here that turns the phrase above into concrete actions
		this.compte = new CompteBancaire("FR1234535",2000) ;
		
//	    throw new PendingException();
	}
	
	
	@When("je valide l'operation du deuxieme retrait")
	public void je_valide_l_operation_du_deuxieme_retrait() {
	    // Write code here that turns the phrase above into concrete actions
		this.compte.sampleMethodRetirer(3000,"FR1234535");
//	    throw new PendingException();
	}

	@Then("le solde n'a pas changé")
	public void le_solde_n_a_pas_changé() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(2000.0,this.compte.getSolde(), 0.1);
//	    throw new PendingException();
	}
	
}
