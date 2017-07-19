public class Rectangle extends Shape {
	public Rectangle (int width, int height) {
		super(width, height);
		super.bindChild(this);

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				super.setPixel (j, i, (char) 1);
			}
		}
 	}
}