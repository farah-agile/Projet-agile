package com.eclipse.bluej;


/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client 
{
    private CompteBancaire compte;
    private  String nom ;
    private String prenom ;
    private int age ;

    public Client(String n, String p,int a,CompteBancaire compte)
    {
       this.nom=n;
       this.prenom=p;
       this.age=a ; 
       this.compte = compte;
        
    }

  
    public double deposerArgent(double s, String n)
    {
        return this.compte.deposer(s,n);
       
    }
    public double retirerArgent(double s, String n)
    {
        return this.compte.retirer(s, n);
       
    }
    public double virerArgent(CompteBancaire cb, double m)
    {
        this.compte.virer(cb, m);
        System.out.println("le virement a été bien effectué");
        return cb.getSolde();
       
    }
    
    public CompteBancaire getCompte() {
    	return this.compte;
    }
}
