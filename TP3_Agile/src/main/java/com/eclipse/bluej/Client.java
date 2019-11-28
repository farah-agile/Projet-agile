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
    public Client(CompteBancaire compte)
    {
    	  // initialise instance variables
//       this.nom=n;
//       this.prenom=p;
//       this.age=a ; 
       this.compte = compte;
      
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double sampleMethodClient(double s, String n)
    {
        return this.compte.sampleMethodDeposer(s,n);
        // put your code here
       
    }
}
