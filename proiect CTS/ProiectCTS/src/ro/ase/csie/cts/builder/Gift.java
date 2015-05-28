package ro.ase.csie.cts.builder;

import java.util.ArrayList;
import java.util.List;

public class Gift {
	 private List<Product> products = new ArrayList<Product>();
	 
	 public void addProduct(Product product){
	      products.add(product);
	   }
	 
	 public float giftPrice(){
	      float cost = 0.0f;
	      
	      for (Product product : products) {
	         cost += product.price();
	      }		
	      return cost;
	   }

	 public void giftDescription(){
		   
	      for (Product product : products) {
	         System.out.print("Product : " + product.name());
	         System.out.print(", Packing : " + product.packing().packing());
	         System.out.println(", Price : " + product.price());
	      }		
	   }	
}
