package dvsgenerics.exerciciosdois;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ProgramaLista {
	
	public static void main(String[] args) {
     
	 Locale.setDefault(Locale.US);
     List<Integer> intLista = Arrays.asList(10, 15, 20 ,23);
     List<Double> doubleLista = Arrays.asList(15.0, 45.0, 56.0 ,43.0);
     List<Object> myObjs = new ArrayList<>();
     
     copy(intLista, myObjs);
     copy(doubleLista, myObjs);
     printList(myObjs);
     
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny){
		for(Number number : source) {
			destiny.add(number);
		}
	}
	public static void printList(List<?> lista) {
		for(Object obj : lista) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
