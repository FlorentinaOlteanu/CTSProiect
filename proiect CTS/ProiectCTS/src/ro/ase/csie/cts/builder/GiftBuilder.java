package ro.ase.csie.cts.builder;



public class GiftBuilder {
	
	public Gift createGiftF (){
	      Gift g = new Gift();
	      g.addProduct(new WhiteChocolate());
	      g.addProduct(new FemalePerfume());
	      return g;		
	   }   

	public Gift createGiftM (){
	      Gift gift = new Gift();
	      gift.addProduct(new DarkChocolate());
	      gift.addProduct(new MalePerfume());
	      return gift;
	   }  
}
