
public abstract class Valuable {

	public String name;
	
	public Valuable(String name){
		this.name = name;
	}
	
	abstract public double getValue();
	
	public double getRealValue(){
		return (getValue() * 1.25);
	}
	
//	abstract public String toString();
	
	public String toString(){
		return name + " " + getRealValue() + " ";
	}
}
