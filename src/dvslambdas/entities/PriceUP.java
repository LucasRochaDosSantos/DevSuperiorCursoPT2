package dvslambdas.entities;

import java.util.function.Consumer;

public class PriceUP implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice() + (t.getPrice() * 0.1));
		
	}
  
}
