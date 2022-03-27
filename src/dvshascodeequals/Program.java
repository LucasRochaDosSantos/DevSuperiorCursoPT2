package dvshascodeequals;

import java.util.Locale;

import dvshascodeequals.entities.Client;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Client c1 = new Client("lucas", "lucas@rocha.com");
      Client c2 = new Client("alex", "alex@gmail.com");
  
      System.out.println(c1.hashCode());
      System.out.println(c2.hashCode());
      System.out.println(c1.equals(c2));
      System.out.println(c1 == c2);
	}
}
