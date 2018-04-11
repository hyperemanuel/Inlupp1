
public class Apparatus extends Valuable {

	private int purPrice, wear;
	
	public Apparatus(String name, int purPrice, int wear){
		super(name);
		this.purPrice = purPrice;
		this.wear = wear;
	}
	
	public double getValue(){
		return (wear == 10) ? purPrice : purPrice * (wear * 0.1);
	}
	
	public String toString(){
		return " Apparatus: " + super.toString() + "  Purchase price: " + purPrice + "  Wear: " + wear;
	}
}
