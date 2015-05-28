package ro.ase.csie.cts.template;

public abstract class ShoppingCart {
	abstract void login();
	abstract void searchForProduct();
	abstract void addProductToCart();
	abstract void logout();
	
	//template method
	public final void shop(){
		//log into the platform
		login();
		
		//search product
		searchForProduct();
		
		//add product to cart
		addProductToCart();
		
		//logout
		logout();
		
	}

}
