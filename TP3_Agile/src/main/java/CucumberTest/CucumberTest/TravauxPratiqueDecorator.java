package CucumberTest.CucumberTest;

public class TravauxPratiqueDecorator extends Decorator {
	private Cours cours;
	/**
	 * Constructeru à partir de la class CM
	 * @param cours
	 */
	public TravauxPratiqueDecorator(Cours cours)
    {
      
        this.cours = cours;
    }
	
   @Override
   public double getPrix() {
	   return this.cours.getPrix() + 300;
   }
}
