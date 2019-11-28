package com.eclipse.bluej;


/**
 * Write a description of class Compte_Bancaire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompteBancaire
{
    // instance variables - replace the example below with your own
   
    private String num_compte ;
    private  double solde;

    /**
     * Constructor for objects of class Compte_Bancaire
     */
    public CompteBancaire(String c , double s)
    {
        // inprivate num_compte ;
     this.solde=s;
     this.num_compte=c;
     //num_compte=null ;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
    // Methode de depot dans le compte
    public double sampleMethodDeposer(double y , String num_c)
    {
        // put yothur code here
        this.num_compte = num_c;
        this.solde += y;
//        AfficherSolde();
        return this.solde ;
         
    }

	public void AfficherSolde() {
		System.out.println("le solde associ� � au num�ro de compte"+this.num_compte+"est:"+this.solde);
	}
    // Methode de retrait du compte
    public double sampleMethodRetirer(double r, String nc) {
    	this.num_compte = nc;
    	if (r<= this.solde)
    	    this.solde-=r;
    	else 
    		System.out.println("Votre solde n'est pas sufisant");
    
    return this.solde ;
    	
    }
    public  String getNumCompte (){
       
        return  this.num_compte;
        
    }
    public  double getSolde (){
       
        return  this.solde;
        
    }
    public void setNumCompte ( String num){
         this.num_compte= num ;
    }
    public void setSolde ( double s){
         this.solde= s ;
    }
    
}
