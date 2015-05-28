package ro.ase.csie.cts.decorator;

public class FlavourDecorator extends ItemDecorator {
	
	public FlavourDecorator(Item decoratedItem) {
	      super(decoratedItem);		
	   }

	   @Override
	   public void create() {
	      decoratedItem.create();	       
	      setFlavour(decoratedItem);
	   }

	   private void setFlavour(Item decoratedItem){
	      System.out.println("Flavour: vanilla");
	   }

}
