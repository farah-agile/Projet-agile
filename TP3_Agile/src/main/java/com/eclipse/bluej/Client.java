package com.eclipse.bluej;


/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client 
{
    // instance variables - replace the example below with your own
    private CompteBancaire compte;
    private  String nom ;
    private String prenom ;
    private int age ;

    /**
     * Constructor for objects of class Client
     */
    public Client(String n, String p,int a,CompteBancaire compte)
    {
    	// initialise instance variables
       this.nom=n;
       this.prenom=p;
       this.age=a ; 
       this.compte = compte;
      
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double deposerArgent(double s, String n)
    {
        return this.compte.deposer(s,n);
        // put your code here
       
    }
    public double retirerArgent(double s, String n)
    {
        return this.compte.retirer(s, n);
        // put your code here
       
    }
    public void virerArgent(CompteBancaire cb, double m)
    {
        this.compte.virer(cb, m);
        System.out.println("le virement a été bien effectué");
        // put your code here
       
    }
    
    public CompteBancaire getCompte() {
    	return this.compte;
    }
}
