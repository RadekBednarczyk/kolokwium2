package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class MortgageCalculatorTest
{
//	@Test
//	public void numberOfInstallmentsTest() {
//		fail("Not yet implemented");
//	}
	
	private int a;
	private int b;
	private int c;
	private double d;
	
	
	
	public MortgageCalculatorTest(int a, int b, int c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	
		System.out.println(a +" "+ b + " " + c + " " + d);
	}


	@Test
	public void valueOfFirstInstallmentsTest() {
			
		MortgageCalculator mc= new MortgageCalculator(a, b, c);
		System.out.println(mc.getDecreasingInstallments());
		
		boolean result = false;
		
		if(mc.getDecreasingInstallments()!= null && mc.getDecreasingInstallments().get(0)== d){
			result = true;
			
		}
		
		assertTrue(result);
	}
	
	
	@Parameters
	public static Collection<Object[]> data() {

		List list = new ArrayList<Object[]>();

		
			Object[] tab = new Object[4];
			tab[0] = 1000;
			tab[1] = 5;
			tab[2] = 2;
			tab[3] = 916.67;
			list.add(tab);

//			tab[0] = 2000;
//			tab[1] = 4;
//			tab[2] = 1;
//			tab[3] = 2666.67;
//			list.add(tab);
			
		return list;
	}
	
	
//	
//	@Test
//	public void valueOfLastInstallmentsTest() {
//		MortgageCalculator mc= new MortgageCalculator(2000, 4, 1);
//		System.out.println(mc.getDecreasingInstallments());
//		
//		boolean result = false;
//		
//		if(mc.getDecreasingInstallments()!= null && mc.getDecreasingInstallments().get(0)== d){
//			result = true;
//			
//		}
//		
//		assertTrue(true);
//	}
}