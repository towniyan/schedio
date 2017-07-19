public class Test {
	public static void main (String[] args) {
		new Schedio (80, 15)
			.setBackground(' ')
			.add(
				new Letter('I')
					.setPosition(0, 0)
			)
			.add(
				new Letter('L')
					.setPosition(10, 0)
			)
			.add(
				new Letter('O')
					.setPosition(23, 0)
			)
			.add(
				new Letter('V')
					.setPosition(36, 0)
			)
			.add(
				new Letter('E')
					.setPosition(49, 0)
			)
			.add(
				new Letter('U')
					.setPosition(65, 0)
			)

			.add(
				new Letter('T')
					.setPosition(0, 7)
			)
			.add(
				new Letter('O')
					.setPosition(13, 7)
			)
			.add(
				new Letter('W')
					.setPosition(26, 7)
			)
			.add(
				new Letter('N')
					.setPosition(41, 7)
			)
			.add(
				new Letter('I')
					.setPosition(54, 7)
			)
			.draw();
 	}
}