package CucumberTest.CucumberTest;


/**
 * Décrivez votre classe Cours ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Cours
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
	private String nomCours;
    
    /**
     * Constructeur d'objets de classe Cours
     */
    public Cours(String nom)
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
