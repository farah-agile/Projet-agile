package CucumberTest.CucumberTest;


/**
 * Décrivez votre classe TravauxDirigeDecorator ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TravauxDirigeDecorator
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
	private String nomCours;
	private int prix;
    
    /**
     * Constructeur d'objets de classe TravauxDirigeDecorator
     */
    public TravauxDirigeDecorator(String nom)
    {
        // initialisation des variables d'instance
  
        this.nomCours = nom;
    }
    
    public TravauxDirigeDecorator(String nom, int prix)
    {
        // initialisation des variables d'instance
    	this.nomCours = nom;
        this.prix = prix;
    }
    
    public int getPrix(){
    	return this.prix;
    }
    
    public void setPrix(int Prix){
    	this.prix=prix;
    }
    
    
    public String getNomCours() {
    	return this.nomCours;
    }
    
    public void setNom(String nom) {
    	this.nomCours = nom;
    }

	
    
}
