public class Plus extends Shape {
	public Plus (int length) {
		super(length * 2 + 1, (length) * 2 + 1);

		int width = length * 2 + 1,
			height = length * 2 + 1;

		super.bindChild(this);

		// Draw the vertical line
		for (int y = 0; y < height; y++) {
			super.setPixel (length, y, (char) 1);
		}
		// Draw the horizontal line
		for (int x = 0; x < width; x++) {
			super.setPixel (x, length, (char) 1);
		}
 	}
}
// for length: 3
//    -
//    -
//    -
// -------
//    -
//    -
//    -