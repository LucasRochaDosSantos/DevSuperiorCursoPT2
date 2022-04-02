package dvslambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {
	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

		Stream<Integer> listaST = lista1.stream().map(x -> x += 2);
		System.out.println(Arrays.toString(listaST.toArray()));

		Stream<String> listaST2 = Stream.of("LUCAS ROCHA", "DOS SANTOS", "ANNA CLARA BERNARDINO ROCHA");
		System.out.println(Arrays.toString(listaST2.toArray()));

		Stream<Integer> listaST3 = Stream.iterate(0, x -> x + 5);
		System.out.println(Arrays.toString(listaST3.limit(10).toArray()));
		
		//fibona
		Stream<Integer> listaST4 = Stream.iterate(new Integer[] {0, 1}, p -> new Integer[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(listaST4.limit(10).toArray()));
	}
}
