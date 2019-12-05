package CucumberTest.CucumberTest;

public class CoursMagistral extends Cours{

	public CoursMagistral(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	
	}
	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}
	

}
