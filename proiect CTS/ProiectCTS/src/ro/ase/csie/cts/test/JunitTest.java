package ro.ase.csie.cts.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;



public class JunitTest extends TestCase {
	ShoppingCart sc;
	
	public void setUp(){
		System.out.println("setUp Unit test");
		sc = new ShoppingCart(3.0, 0.0, 200.0, 35.0);
	}

	//unitTest pt verificat metoda addItem()
	//testare valori normale (intregi > 0)
	public void testNormalValuesAmount(){
		sc.addItem(20.0);
		assertEquals(20.0, sc.getAmount());
		
		
	}
	
	//unitTest pt verificat metoda addItem()
	//testare valori nule (= 0)
	
	public void testZeroValueAddItem(){
		sc.addItem(0.0);
		assertEquals(0.0, sc.getAmount());
	}
	
	
	//unitTest pentru testare metoda totalCredit
	////testare valori normale (intregi > 0)
	public void testNormalValuesCredit(){
		sc.totalCredit(56.0,2.0);
		assertEquals(88.0, sc.getCredit());
	}
	
	//unitTest pentru testare metoda totalCredit
	//testare valori negative (< 0)
	public void testNegativeValuesCredit(){
		sc.totalCredit(23.0, -3.0);
		assertEquals(269.0, sc.getCredit());
	}
	
}
