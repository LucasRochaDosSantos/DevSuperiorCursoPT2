package dvshascodeequals;

import java.util.HashSet;
import java.util.Set;

import dvshascodeequals.entities.Produto;



public class ProgramaHashset {
	
	public static void main(String[] args) {
		Set<Produto> set = new HashSet<>();
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));
		Produto prod = new Produto("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}

}
