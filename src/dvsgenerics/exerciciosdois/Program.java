package dvsgenerics.exerciciosdois;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 *  Tipo Curinga <?>
 * */

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      List<Integer> myLista = Arrays.asList(10, 50, 30 , 20);  
      printList(myLista);
      
      List<String> myStr = Arrays.asList("LUCAS", "ROCHA", "DOS", "SANTOS");
      printList(myStr);
	}
	public static void printList(List<?> lista) {
	
		for(Object objeto : lista) {
		 System.out.println(objeto);	
		}
	}
}
