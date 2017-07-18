public class Rectangle extends Shape {
	public Rectangle (int width, int height) {
		super(width, height);

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				super.setPixel (i, j, '*');
			}
		}
 	}

 	public Rectangle setPosition (int x, int y) {
 		super.setPosition(x, y);

 		return this;
 	}

 	public Shape setFill (char c) {
 		super.setFill(c);
 		
 		return this;
 	}
}