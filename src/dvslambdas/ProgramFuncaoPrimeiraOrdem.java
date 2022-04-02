package dvslambdas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import dvslambdas.entities.FuncaoPrimeiraOrdem;
import dvslambdas.entities.Product;

public class ProgramFuncaoPrimeiraOrdem {
	public static void main(String[] args) {
     String path = "C:\\Users\\Lucas Rocha\\Documents\\produto.txt";
     List<Product> lista = new ArrayList<>();
     try(BufferedReader br = new BufferedReader(new FileReader(path))){
    	 String texto = br.readLine();
    	 
    	 while(texto != null){
    		 String[] conj = texto.split(",");
    		 lista.add(new Product(conj[0], Double.parseDouble(conj[1]), Integer.parseInt(conj[2])));
    		 texto = br.readLine();
    	 }
    	
    	 double media = FuncaoPrimeiraOrdem.filteredSum(lista, p -> p.getName().charAt(0) == 'M');
         System.out.println(media);     
     }catch(IOException e) {
    	 e.printStackTrace();
     }
	}
}
