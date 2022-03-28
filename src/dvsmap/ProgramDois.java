package dvsmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import dvsmap.entities.Product;

public class ProgramDois {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\Lucas Rocha\\Documents\\produto.txt";
		Map<Product, Double> stock = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		String linha = br.readLine();
        
		while(linha != null) {
        	 String[]linhas = linha.split(",");
        	 Product p = new Product(linhas[0], Double.parseDouble(linhas[1]),Integer.parseInt(linhas[2]));
             stock.put(p, p.getQuantity() * p.getPrice());
             linha = br.readLine();
        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Product p : stock.keySet()) {
			System.out.printf("Name: %s PRICE $ %.2f, QT %d  total in stock = ", p.getName(), p.getPrice(), p.getQuantity());
			System.out.printf("%.2f\n", stock.get(p));
		}
	}
}
