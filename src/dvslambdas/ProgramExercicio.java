package dvslambdas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dvslambdas.entities.Product;

public class ProgramExercicio {
	public static void main(String[] args) {
      List<Product> produto = new ArrayList<>();
      String path = "C:\\\\Users\\\\Lucas Rocha\\\\Documents\\\\produto.txt";
      
      try(BufferedReader br = new BufferedReader(new FileReader(path))){
    	  String linha = br.readLine();
    	  while(linha != null) {
    		   String[] linhas = linha.split(",");
    		   Product p = new Product(linhas[0], Double.parseDouble(linhas[1]), Integer.parseInt(linhas[2]));
    		   produto.add(p);
    		   linha = br.readLine();
    	  } 
      }catch(IOException e){
    	  e.printStackTrace();
      }
     //produto.forEach((p) -> p.setName(p.getName().toUpperCase()));
     //produto.forEach(System.out::println);
     
     //produto.forEach((p) -> p.setName(p.getName().toLowerCase()));
     //produto.forEach(System.out::println);
     
      //List<String> names = produto.stream().map(new NameUpdate()).collect(Collectors.toList());
      //names.forEach(System.out::println);
      List<String> names = produto.stream().map((p) -> p.getName().toUpperCase()).collect(Collectors.toList());
      names.forEach(System.out::println);
	}
}
