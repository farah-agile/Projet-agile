package CucumberTest.CucumberTest;

import java.util.ArrayList;

import com.eclipse.bluej.Client;
import com.eclipse.bluej.Personne;

public class ProfClient {
	Client client;
	Professeur pro;
	
	public ProfClient(Client cli, Professeur pro) {
		this.client = cli;
		this.pro = pro;
	}
	
	public void AfficherSolde() {
		client.getCompte().AfficherSolde();
	}
	
	public ArrayList<TravauxDirigeDecorator> getCoursList(){
		return pro.getCoursList();
	}
	
	// etc .....
	

}
