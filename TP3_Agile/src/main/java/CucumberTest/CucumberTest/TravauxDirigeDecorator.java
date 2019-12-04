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
    
    /**
     * Constructeur d'objets de classe TravauxDirigeDecorator
     */
    public TravauxDirigeDecorator(String nom)
    {
        // initialisation des variables d'instance
  
        this.nomCours = nom;
    }
    
    
    public String getNomCours() {
    	return this.nomCours;
    }
    
    public void setNom(String nom) {
    	this.nomCours = nom;
    }

    
}
