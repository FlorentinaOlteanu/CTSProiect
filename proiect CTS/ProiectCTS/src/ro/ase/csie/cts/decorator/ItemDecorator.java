package ro.ase.csie.cts.decorator;

public abstract class ItemDecorator implements Item{
	protected Item decoratedItem;
	
	public ItemDecorator (Item decoratedItem){
		this.decoratedItem = decoratedItem;
	}

	public void create(){
		decoratedItem.create();
	}
}
