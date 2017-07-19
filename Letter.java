public class Letter extends Shape {
	public Letter (char letter) {
		super(13, 5);
		super.bindChild(this);

		switch (letter) {
			case 'T':
				for (int i = 0; i < 11; i++) {
					super.setPixel(i, 0, (char) 1);
				}

				for (int i = 0; i < 5; i++) {
					super.setPixel(5, i, (char) 1);
				}

				break;
			case 'O':
				for (int i = 0; i < 10; i++) {
					super.setPixel(i, 0, (char) 1);
				}

				for (int i = 1; i < 4; i++) {
					super.setPixel(0, i, (char) 1);
					super.setPixel(9, i, (char) 1);
				}

				for (int i = 0; i < 10; i++) {
					super.setPixel(i, 4, (char) 1);
				}
				break;
			case 'W':
				super.setPixel (0, 0, (char) 1);
				super.setPixel (12, 0, (char) 1);

				super.setPixel (1, 1, (char) 1);
				super.setPixel (11, 1, (char) 1);

				super.setPixel (2, 2, (char) 1);
				super.setPixel (6, 2, (char) 1);
				super.setPixel (10, 2, (char) 1);

				super.setPixel (3, 3, (char) 1);
				super.setPixel (5, 3, (char) 1);
				super.setPixel (6, 3, (char) 1);
				super.setPixel (7, 3, (char) 1);
				super.setPixel (9, 3, (char) 1);

				super.setPixel (4, 4, (char) 1);
				super.setPixel (8, 4, (char) 1);
				break;
			case 'N':
				for (int i = 0; i < 5; i++) {
					super.setPixel(0, i, (char) 1);
				}
				for (int i = 1; i < 6; i++) {
					super.setPixel(i, i - 1, (char) 1);
				}
				for (int i = 0; i < 5; i++) {
					super.setPixel(6, i, (char) 1);
				}
				break;
			case 'I':
				for (int i = 0; i < 5; i++) {
					super.setPixel(0, i, (char) 1);
				}
				break;
			case 'L':
				for (int i = 0; i < 5; i++) {
					super.setPixel(0, i, (char) 1);
				}
				for (int i = 1; i < 8; i++) {
					super.setPixel(i, 4, (char) 1);
				}
				break;
			case 'V':
				super.setPixel(0, 0, (char) 1);
				super.setPixel(8, 0, (char) 1);

				super.setPixel(1, 1, (char) 1);
				super.setPixel(7, 1, (char) 1);

				super.setPixel(2, 2, (char) 1);
				super.setPixel(6, 2, (char) 1);

				super.setPixel(3, 3, (char) 1);
				super.setPixel(5, 3, (char) 1);

				super.setPixel(4, 4, (char) 1);
				break;
			case 'U':
				super.setPixel (0, 0, (char) 1);
				super.setPixel (8, 0, (char) 1);

				super.setPixel (0, 1, (char) 1);
				super.setPixel (8, 1, (char) 1);

				super.setPixel (0, 2, (char) 1);
				super.setPixel (8, 2, (char) 1);

				super.setPixel (0, 3, (char) 1);
				super.setPixel (8, 3, (char) 1);

				super.setPixel (1, 4, (char) 1);
				super.setPixel (2, 4, (char) 1);
				super.setPixel (3, 4, (char) 1);
				super.setPixel (4, 4, (char) 1);
				super.setPixel (5, 4, (char) 1);
				super.setPixel (6, 4, (char) 1);
				super.setPixel (7, 4, (char) 1);
				break;
			case 'E':
				for (int i = 0; i < 5; i++) {
					super.setPixel(0, i, (char) 1);
				}
				for (int i = 1; i < 6; i++) {
					super.setPixel(i, 0, (char) 1);
				}
				super.setPixel(0, 1, (char) 1);
				for (int i = 1; i < 4; i++) {
					super.setPixel(i, 2, (char) 1);
				}
				super.setPixel(0, 3, (char) 1);
				for (int i = 1; i < 6; i++) {
					super.setPixel(i, 4, (char) 1);
				}
				break;
		}
 	}
}