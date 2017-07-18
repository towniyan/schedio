public class Test {
	public static void main (String[] args) {
		new Schedio (30, 15)
			.setBackground(' ')
			.add(
				new Rectangle (10, 3).setPosition(8, 5)
			)
			.add (
				new Triangle (5)
					.setPosition(3, 2)
					.setFill('.')
			)
			.draw();
 	}
}