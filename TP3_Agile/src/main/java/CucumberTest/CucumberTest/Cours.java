package CucumberTest.CucumberTest;

public abstract class Cours {
	String description = "Cours";
	int prix;

	public String getDescription() {
        return description;
    }

    public abstract double cost();

    public abstract int getPrix();
}
