import java.util.*;

public class Schedio extends Helper {
	private int width, height;
	private char[][] pixels;
	private char background = '.';

	public Schedio (int width, int height) {
		this.width = width;
		this.height = height;

		this.pixels = new char[height - 1][width - 1];

		for (int i = 0; i < height - 1; i++) {
			for (int j = 0; j < width - 1; j++) {
				this.pixels[i][j] = 0;
			}
		}
	}

	public Schedio add (Shape shape) {
		char[][] pixels = shape.getPixels();
		for (int i = 0; i < shape.getHeight(); i++) {
			for (int j = 0; j < shape.getWidth(); j++) {
				if (pixels[i][j] == 1)
					this.pixels[i + shape.getY()][j + shape.getX()] = shape.getFill();
				else if (pixels[i][j] != 0)
					this.pixels[i + shape.getY()][j + shape.getX()] = pixels[i][j];
			}
		}

		return this;
 	}

 	public Schedio setBackground (char c) {
 		this.background = c;

 		return this;
 	}

	public void draw () {
		for (int i = 0; i < height - 1; i++) {
			for (int j = 0; j < width - 1; j++) {
				print(this.pixels[i][j] == 0 ? this.background : this.pixels[i][j]);
			}
			println();
		}
	}
}