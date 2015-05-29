package ro.ase.csie.cts.test;

public class ShoppingCart {
	double item;
	double amount;
	double credit;
	double price;
	
	public ShoppingCart(double item, double amount, double credit, double price) {
		
		this.item = item;
		this.amount = amount;
		this.credit = credit;
		this.price = price;
	}
	
	public void addItem(double price)
	{
		amount=amount+price;		
	}
	
	public void totalCredit(double price, double item){
		if(item>0.0)
		credit=credit-(price*item);
		else
			credit= credit+(price*(-item));
	}
	
	public double getAmount(){
		return amount;
	}
	
	public double getCredit(){
		return credit;
	}
	
	
	
	
	

}
