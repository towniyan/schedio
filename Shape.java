public class Shape extends Helper {
	private int width, height, x = 0, y = 0;
	private char[][] pixels;
	private char fill = '*';
	private Shape child;

	public Shape (int width, int height) {
		this.width = width;
		this.height = height;
		this.pixels = new char[height][width];

		for (int i = 0; i < this.height - 1; i++) {
			for (int j = 0; j < this.width - 1; j++) {
				this.pixels[i][j] = 0;
			}
		}
 	}

	public int getX () {
		return this.x;
 	}

	public int getY () {
		return this.y;
 	}

	public int getWidth () {
		return this.width;
 	}

	public int getHeight () {
		return this.height;
 	}

 	public char[][] getPixels () {
 		return this.pixels;
 	}

 	public void setPixel (int x, int y, char c) {
 		this.pixels[y][x] = c;
 	}

 	public char getFill () {
 		return this.fill;
 	}

 	public void bindChild (Shape shape) {
 		this.child = shape;
 	}

 	public Shape setPosition (int x, int y) {
 		this.x = x;
 		this.y = y;

 		return this.child;
 	}

 	public Shape setFill (char c) {
 		this.fill = c;
 		return this.child;
 	}
}