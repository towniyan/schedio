public class Triangle extends Shape {
	public Triangle (int height) {
		super(1 + (height - 1) * 2, height);

		int offset = height - 1, length = 1;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < length; j++) {
				super.setPixel (i, j + offset, '*');
			}
			offset--;
			length += 2;
		}
 	}

 	public Triangle setPosition (int x, int y) {
 		super.setPosition(x, y);

 		return this;
 	}
}