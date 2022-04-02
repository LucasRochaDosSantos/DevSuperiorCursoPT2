package dvslambdas.entities;

import java.util.List;
import java.util.function.Predicate;

public class FuncaoPrimeiraOrdem {

	public static double filteredSum(List<Product> lista, Predicate<Product> t) {
		double sum = 0;
		for(Product p : lista) {
			if(t.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
