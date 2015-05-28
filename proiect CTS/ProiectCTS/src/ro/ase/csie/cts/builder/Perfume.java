package ro.ase.csie.cts.builder;

public abstract class Perfume implements Product{
	
	public Packing packing() {
	      return new Bottle();
	   }

	   public abstract float price();

}
