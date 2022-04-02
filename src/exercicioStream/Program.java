package exercicioStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercicioStream.entities.Product;

public class Program {
	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner entrada = new Scanner(System.in);
     List<Product> lista = new ArrayList<>();
     System.out.print("Enter full file path: ");
     String path = entrada.nextLine();
     try(BufferedReader br = new BufferedReader(new FileReader(path))){
    	 
    	 String linha = br.readLine();
    	 while(linha != null){
    		 String[] linhas = linha.split(",");
    		 lista.add(new Product(linhas[0], Double.parseDouble(linhas[1]), Integer.parseInt(linhas[2])));
    		 linha = br.readLine();
    	 }
    	 Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
    	 Double st = lista.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y / lista.size());
    	 System.out.println("Average price " + String.format("%.2f", st));
    	 List<String> names = lista.stream().filter(p -> p.getPrice() < st).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
    	names.stream().forEach(System.out::println);
     }catch(IOException e){
    	 e.printStackTrace();
     }
     entrada.close();
	}
}
