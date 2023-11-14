package ex1;

public abstract class Shape {
	private Color color;

	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public abstract double area();

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", area()=" + area() + "]";
	}

}
