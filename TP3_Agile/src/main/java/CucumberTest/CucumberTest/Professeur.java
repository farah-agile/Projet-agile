package CucumberTest.CucumberTest;

import java.util.ArrayList;

import java.util.Iterator;

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
    private String prenom;
   

    private ArrayList<Cours> coursList;
    
    /**
     * Constructeur d'objets de classe Professeur
     */
    public Professeur(int age, String nom){
        this.age = age;
        this.nom = nom;
        this.coursList = new ArrayList<Cours>();
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
    
    public void addCours(Cours travauxDirigeDecorator) {
    	this.coursList.add(travauxDirigeDecorator);
  
    	
    }    
    public ArrayList<Cours> getCoursList() {
    	return this.coursList;
    }
    
    public void deleteAllCours() {
    	this.coursList.clear();
    }
            
    
    public double calculSalary(){
    	double totalPrix=0;
    	for (Cours c : this.coursList) {
    		totalPrix += c.getPrix();
    		
    	}
    	return totalPrix;
	}
}
    
  
