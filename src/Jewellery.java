
public class Jewellery extends Valuable {

	private int gemStone = 0;
	private boolean isGold;
		
	public Jewellery(String name, int gemStone, boolean isGold){
		super(name);
		this.gemStone = gemStone;
		this.isGold = isGold;
	}
	
	public double getValue(){
		return ((isGold) ? 2000 : 700) + (gemStone * 500);
	}
	
	public String toString(){
		return " Jewellery: " + super.toString() + "  Metal: " + (isGold ? " Gold " : " Silver ") + "  Gemstones: " +  gemStone;
	}
}
