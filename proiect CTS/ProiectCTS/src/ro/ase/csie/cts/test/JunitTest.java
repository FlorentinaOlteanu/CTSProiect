package ro.ase.csie.cts.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;



public class JunitTest extends TestCase {
	ShoppingCart sc;
	
	public void setUp(){
		System.out.println("setUp Unit test");
		sc = new ShoppingCart(3, 500, 978);
	}

	//unitTest pt verificat metoda addItem()
	//testare valori normale (intregi > 0)
	public void testNormalValuesAmount(){
		float result =sc.addItem(20);
		assertEquals("520", result);
		
	}
	
	//unitTest pentru testare metoda totalCredit
	////testare valori normale (intregi > 0)
	public void testNormalValuesCredit(){
		float credit=sc.totalCredit(56,2);
		assertEquals("866", credit);
	}
	
}
