package dvsgenerics.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import dvsgenerics.exercicios.entities.Product;
import dvsgenerics.exercicios.services.CalculationService;

public class Program {
	public static void main(String[] args) {
	      Locale.setDefault(Locale.US);
	      String path = "C:\\Users\\Lucas Rocha\\Documents\\produto.txt";
	      List<Product> lista = new ArrayList<>();
	      
	      try(BufferedReader br = new BufferedReader(new FileReader(path)))
	      {
	    	 String linha = br.readLine();
	    	 while(linha != null){
	    		 String[] vetorDoc = linha.split(",");
	    		 lista.add(new Product(vetorDoc[0], Double.parseDouble(vetorDoc[1])));
	    		 linha = br.readLine();
	    		
	    	 }
	    	 Product max = CalculationService.max(lista);
	    	 System.out.println("Max: ");
	    	 System.out.println(max);
	      }catch(IOException erro) {
	    	  erro.printStackTrace();
	      }
		}
}
