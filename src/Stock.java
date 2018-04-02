
public class Stock extends Valuable {

	private int amount, price;
	
	public Stock(String name, int amount, int price){
		super(name);
		this.amount = amount;
		this.price = price;
	}
	
	public double getValue(){
		return amount * price;
	}
	
	public void setPrice(int newPrice){
		this.price = newPrice;
	}
	
	public String toString(){
		return super.toString() + " " + amount + " " + price;
	}
}
