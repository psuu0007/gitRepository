package shopping.product;

public class Computer extends Product{

	public Computer(){
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
