package dvslambdas.entities;

import java.util.function.Function;

public class NameUpdate implements Function<Product, String> {

	@Override
	public String apply(Product t) {
		
		return t.getName().toUpperCase();
	}

}
