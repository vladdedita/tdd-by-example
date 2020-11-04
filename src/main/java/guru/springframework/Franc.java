package guru.springframework;

public class Franc extends Money {
	
	
	public Franc(int amount){
			this.amount = amount;
	}
	
//	void times( int multiplier) {
//		amount *= multiplier;
//	}
	
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	
	
}
