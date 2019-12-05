package CucumberTest.CucumberTest;


/**
 * Décrivez votre classe TravauxDirigeDecorator ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TravauxDirigeDecorator extends Decorator
{
	private Cours cours;

    /**
     * Constructeur d'objets de classe TravauxDirigeDecorator à partir de la class Cours magistrale
     */
    public TravauxDirigeDecorator(Cours cours)
    {
      
        this.cours = cours;
    }
    
   @Override
   public double getPrix() {
	   return this.cours.getPrix() + 10;
   }

	
    
}
