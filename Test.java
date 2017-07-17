public class Test {
	public static void main (String[] args) {
		new Schedio (30, 15)
			.add(new Rectangle(3, 3).setPosition(1, 1))
			.add(new Triangle(10))
			.add(new Rectangle(3, 3).setPosition(20, 0))
			.draw();
 	}
}