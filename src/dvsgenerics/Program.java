package dvsgenerics;

import java.util.Locale;
import java.util.Scanner;

import dvsgenerics.services.PrintService;

public class Program {
	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner entrada = new Scanner(System.in);
     PrintService<Integer> ps = new PrintService<>();
     System.out.print("How many values? ");
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = entrada.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
     entrada.close();
	}
}
