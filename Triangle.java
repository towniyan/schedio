public class Triangle extends Shape {
	public Triangle (int height) {
		super(1 + (height - 1) * 2, height);
		super.bindChild(this);

		int offset = height - 1, length = 1;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < length; j++) {
				super.setPixel (j + offset, i, (char) 1);
			}
			offset--;
			length += 2;
		}
 	}
}