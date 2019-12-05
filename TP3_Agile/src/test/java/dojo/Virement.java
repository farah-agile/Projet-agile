package dojo;

import com.eclipse.bluej.CompteBancaire;
import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;

public class Virement {
	
	private CompteBancaire compte ;
	
	@Given("Je veux transferer l’argent à un autre compte sachant que le montant est inférieur ou égale à mon solde")
	public void je_veux_transferer_l_argent_à_un_autre_compte_sachant_que_le_montant_est_inférieur_ou_égale_à_mon_solde() {
	    // Write code here that turns the phrase above into concrete actions
//		this.compte = new CompteBancaire("FR12345678",3000) ;
		this.compte = new CompteBancaire("FR87654321",2000) ;
//	    throw new PendingException();
	}

	@When("Je valide l’opération")
	public void je_valide_l_opération() {
	    // Write code here that turns the phrase above into concrete actions
		this.compte.sampleMethodeVirer(compte, 100.00);
//	    throw new PendingException();
	}

	@Then("Le solde de mon compte est décrémenté et le solde de compte de destinataire est incrémenté")
	public void le_solde_de_mon_compte_est_décrémenté_et_le_solde_de_compte_de_destinataire_est_incrémenté() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

}
