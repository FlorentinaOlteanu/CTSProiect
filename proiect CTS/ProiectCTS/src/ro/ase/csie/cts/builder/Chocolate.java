package ro.ase.csie.cts.builder;

public abstract class Chocolate implements Product {
	
	public Packing packing() {
	      return new Box();
	   }

	   public abstract float price();

}
