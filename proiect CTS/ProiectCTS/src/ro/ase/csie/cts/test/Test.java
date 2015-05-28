package ro.ase.csie.cts.test;

import ro.ase.csie.cts.builder.Gift;
import ro.ase.csie.cts.builder.GiftBuilder;
import ro.ase.csie.cts.decorator.Chocolate;
import ro.ase.csie.cts.decorator.FlavourDecorator;
import ro.ase.csie.cts.decorator.Item;
import ro.ase.csie.cts.decorator.Perfume;
import ro.ase.csie.cts.template.BuyGiftF;
import ro.ase.csie.cts.template.BuyGiftM;
import ro.ase.csie.cts.template.ShoppingCart;

public class Test {
	
	 public static void main(String[] args) {
		  
		 //builder
	      GiftBuilder mealBuilder = new GiftBuilder();

	      Gift femaleGift = mealBuilder.createGiftF();
	      System.out.println("\nGift for a lady");
	      femaleGift.giftDescription();
	      System.out.println("Total Cost: " + femaleGift.giftPrice());

	      Gift maleGift = mealBuilder.createGiftM();
	      System.out.println("\n\nGift for a man");
	      maleGift.giftDescription();
	      System.out.println("Total Cost: " + maleGift.giftPrice());
	      
	      //template
	      ShoppingCart sc = new BuyGiftF();
	      sc.shop();
	      System.out.println();
	      sc = new BuyGiftM();
	      sc.shop();
	      
	      //decorator
	      Item chocolate = new Chocolate();
	      Item vanillaChocolate = new FlavourDecorator(new Chocolate());
	      Item vanillaPerfume = new FlavourDecorator(new Perfume());
	      
	      System.out.println("\nNormal chocolate");
	      chocolate.create();
	      
	      System.out.println("\n Vanilla flavoured chocolate");
	      vanillaChocolate.create();
	      
	      System.out.println("\n Perfume with vanilla sent");
	      vanillaPerfume.create();
	   }

}
