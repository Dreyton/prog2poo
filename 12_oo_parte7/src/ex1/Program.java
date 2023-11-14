package ex1;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		var shapes = new ArrayList<Shape>();
		shapes.add(new Circle(Color.BLACK, 3.0));
		shapes.add(new Circle(Color.BLUE, 4.0));
		shapes.add(new Rectangle(Color.RED, 5.0, 6.0));
		
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
		
	}

}
