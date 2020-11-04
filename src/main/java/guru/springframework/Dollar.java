package guru.springframework;

import java.util.Objects;

public class Dollar extends Money{
	
	
	public Dollar(int amount){
			this.amount = amount;
	}
	
//	void times( int multiplier) {
//		amount *= multiplier;
//	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
}
