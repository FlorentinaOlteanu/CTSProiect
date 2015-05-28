package ro.ase.csie.cts.test;

public class ShoppingCart {
	int item;
	float amount;
	float credit;
	float price;
	
	public ShoppingCart(int item, float amount, float credit) {
		super();
		this.item = item;
		this.amount = amount;
		this.credit = credit;
	}
	
	public float addItem(float price)
	{
		return amount=amount+price;		
	}
	
	public float totalCredit(float price, int item){
		return credit=credit-(price*item);
	}
	
	public float getAmount(){
		return amount;
	}
	
	
	
	
	
	

}
