package dvsmap;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "98652314");
		
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		
		System.out.println(a == b);
		cookies.put("email", "maria@gmail.com.br");
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		cookies.remove("phone");
		System.out.println("All Cookies");
		for(String key : cookies.keySet()) {
			System.out.println(key + " = " + cookies.get(key));
		}
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println(cookies.size());
        
        String name = "abc";
        String nameT = "abc";
        
        System.out.println(name.equals(nameT));
	}
}
