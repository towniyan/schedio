public class Line extends Shape {
	public Line (int length) {
		super(length, 1);
		super.bindChild(this);

		for (int x = 0; x < length; x++) {
			super.setPixel (x, 0, (char) 1);
		}
 	}
}