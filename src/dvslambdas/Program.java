package dvslambdas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;


import dvslambdas.entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> produtos = new ArrayList<>();
		String path = "C:\\\\Users\\\\Lucas Rocha\\\\Documents\\\\produto.txt";
        
		//Comparator<Product> comp = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] linhas = linha.split(",");
				produtos.add(new Product(linhas[0], Double.parseDouble(linhas[1]), Integer.parseInt(linhas[2])));
				linha = br.readLine();
			}

			produtos.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
            
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Product p : produtos) {
			System.out.println(p);
		}
	}
}
