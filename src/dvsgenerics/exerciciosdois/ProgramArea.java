package dvsgenerics.exerciciosdois;

import java.util.ArrayList;
import java.util.List;

import dvsgenerics.exerciciosdois.entities.Circle;
import dvsgenerics.exerciciosdois.entities.Rectangle;
import dvsgenerics.exerciciosdois.entities.Shape;

public class ProgramArea {
	
	public static void main(String[] args) {
      List<Shape> myShape = new ArrayList<>();
      myShape.add(new Rectangle(3.0, 2.0));
      myShape.add(new Circle(5.0));
      System.out.print(" " + totalArea(myShape));
	}
	public static double totalArea(List<? extends Shape> lista) {
		double media = 0.0;
	
		for(Shape shape : lista) {
	        media += shape.area();
		}
		return media;
	}
}
