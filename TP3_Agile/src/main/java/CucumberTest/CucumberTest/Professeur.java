package CucumberTest.CucumberTest;

import java.util.ArrayList;

/**
 * Décrivez votre classe Professeur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Professeur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int age;
    private String nom;
    private ArrayList<TravauxDirigeDecorator> coursList;
    
    /**
     * Constructeur d'objets de classe Professeur
     */
    public Professeur(int age, String nom){
        this.age = age;
        this.nom = nom;
        this.coursList = new ArrayList<TravauxDirigeDecorator>();
    }

    /**
    *get age
     */
    public int getAge(){
        // Insérez votre code ici
        return this.age;
    }
    /**
     * get nom
     */
    public String getNom(){
        return this.nom;
    }
    
    /**
     * set age 
     */
    public void setAge(int age){
        this.age= age;
    
    }
    
    public void setNom(String nom){
        this.nom = nom;
        
    }
    
    public void addCours(TravauxDirigeDecorator travauxDirigeDecorator) {
    	this.coursList.add(travauxDirigeDecorator);
  
    	
    }    
    public ArrayList<TravauxDirigeDecorator> getCoursList() {
    	return this.coursList;
    }
    
    public void deleteAllCours() {
    	this.coursList.clear();
    }
            
}
    
  
