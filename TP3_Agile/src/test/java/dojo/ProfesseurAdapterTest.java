package dojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.eclipse.bluej.CompteBancaire;
import com.eclipse.bluej.ProfesseurAdapter;

import CucumberTest.CucumberTest.Professeur;

public class ProfesseurAdapterTest {
	private Professeur professeur;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVirerArgent() {
		
		CompteBancaire c1 = new CompteBancaire("FR1235467",3000);
		CompteBancaire c2 = new CompteBancaire("FR7654321",3000);
	
	
		ProfesseurAdapter profAdap = new ProfesseurAdapter("farah", "ABOUELOMOUM", 25, c1, professeur);
		double m = professeur.calculSalary();
		
		assertEquals(3000+m, profAdap.virerArgent(c2, m) , 0.1);
	}

}
