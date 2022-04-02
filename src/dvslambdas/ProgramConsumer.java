package dvslambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import dvslambdas.entities.Product;

public class ProgramConsumer {
	public static void main(String[] args) {
		List<Product> lista = new ArrayList<>();

		lista.add(new Product("MOUSE", 90.00, 2));
		lista.add(new Product("TV 50P", 1500.00, 2));
		lista.add(new Product("IPHONE X", 1550.00, 2));
		lista.add(new Product("TECLADO", 50.00, 2));
		lista.add(new Product("MONITOR", 700.00, 2));
      
		//lista.forEach(new PriceUP());
        Consumer<Product> cons = p -> {
        	p.setPrice(p.getPrice() * 1.1);
        };
		
		
		//lista.forEach(cons);
        
		lista.forEach((p) -> p.setPrice(p.getPrice() * 1.1));
		
        lista.forEach(System.out::println);
	}
}
