## Schedio
Schedio is a library for drawing raster Unicode art (much like ASCII art), supporting layering and transparency. It's extendable and there's nothing to limit you from drawing the shapes you desire.

## Example
Here we have a triangle and two rectangles to the left and right. Specify what you want to draw and Schedio will generate it for you.


```
         *          ***      
 ***    ***         ***      
 ***   *****        ***      
 ***  *******                
     *********               
    ***********              
   *************             
  ***************            
 *****************           
*******************                                      
```

## Basics
### Canvas
Canvas is the piece of paper on top of which you'll be drawing. Whenever you're drawing something with Schedio, canvas is the first thing you should setup.
### Setting up the canvas
A canvas (space for drawing) will be automatically setup whenever you create a new **Schedio** object. You've to specify the width and height of the canvas. Here, a canvas is generated with width: 30 and height: 15.

```java
new Schedio (30, 15);
```

After the canvas is setup, we can add stuff to it and render it for seeing the fianl result.

> You can think of the Schedio object as the canvas itself.

### Rendering
Calling `draw` on a Schedio object will make Schedio render the canvas. Here a blank canvas of width: 30 and height: 15 is being rendered.

```java
new Schedio(30, 15).draw();
```

You'll see something like this:

```
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
```

Here we got a blank 30x15 canvas (empty spaces represented by dots).
Drawing the canvas on the screen is known as *rendering.*

### Adding stuff to the canvas
We can add things to the canvas by calling `add` method in the Schedio object.

```java
new Schedio(30, 15)
	.add(new Rectangle(10, 3))
	.draw();
```
Inside the `add` method, you pass in objects you desire you be added to the canvas. In this case, we're adding a *Rectangle* of width: 10 and height: 3.

Instead of Rectangle, you can have something like a *Triangle.*
These 2 shapes are built-in shapes in Schedio. You can extend Schedio by defining your own shapes and by implementing a common set of rules. More on that later.

So the previous lines of code generates this:

```
**********...................
**********...................
**********...................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
.............................
```

The asterisks represent the 10x3 Rectangle. Shapes are placed at top left corner of the canvas by default. However, you can change that. More on that under the next heading.

### Positioning shapes in canvas
You can set positions of shapes by simply calling the method `setPosition` on them and specifying the *x* and *y* values.

```java
new Schedio(30, 15)
	.add(
		new Rectangle(10, 3).setPosition(8, 5)
	)
	.draw();
```
This is how it looks like:

```
.............................
.............................
.............................
.............................
.............................
........**********...........
........**********...........
........**********...........
.............................
.............................
.............................
.............................
.............................
.............................
```
Here, the rectangle is placed at x: 8 and y: 5. In other words, the rectangle has been placed 8 units right and 5 units down from the top left corner of the canvas. As you can guess, the (0, 0) position is the top left corner of the canvas for simplicity.

### Setting background of the canvas
By default, for visual purposes, the dot (.) is the background of the canvas. You can set the background to anything you like by calling `setBackground` method on the Schedio object and specifying the char as an argument.

```java
new Schedio(30, 15)
	.setBackground(' ')
	.add(
		new Rectangle(10, 3).setPosition(8, 5)
	)
	.draw();
```

> Schedio's API uses method chaining technique to reduce verbosity and make the code cleaner and easier to read. You can see that `setBackground` returns the schedio object and you can attach another method like `draw` through this way as many times as you wish. As a result, you don't need to set a schedio object to a variable when you need to reuse it.

In this case, I want the background to comprise of whitespaces. And it should yield a result like this:

```
                             
                             
                             
                             
                             
        **********           
        **********           
        **********           
                             
                             
                             
                             
                             
                             

```
You may find it cleaner than the dotted background. However, for educational purposes, we want to stick with the default background.

### Other shapes
So far, we've looked at the Rectangle only. You can add any shape you desire. If it's not built-in, you can make one yourself. We'll discuss that in the next heading.

Let's make a *Triangle.*
Call `add` on the schedio object again and pass in an object of a triangle. The triangle object just needs a height for instantiation. Here, we should have a triangle of height: 5.

```java
new Schedio(30, 15)
	.add(
		new Rectangle(10, 3).setPosition(8, 5)
	)
	.add (
		new Triangle (5)
	)
	.draw();
```
And it should look like this:

```
....*........................
...***.......................
..*****......................
.*******.....................
*********....................
........**********...........
........**********...........
........**********...........
.............................
.............................
.............................
.............................
.............................
.............................
```

As you can see, the triangle is placed at the top left corner of the canvas. If you want, you could have specified the position. It's almost about to touch the rectangle. What if we move it 3 steps right and 2 steps down? Shouldn't it collide with the rectangle? Let's see what happens:

```java
new Schedio(30, 15)
	.add(
		new Rectangle(10, 3).setPosition(8, 5)
	)
	.add (
		new Triangle (5).setPosition(3, 2)
	)
	.draw();
```

```
.............................
.............................
.......*.....................
......***....................
.....*****...................
....**************...........
...***************...........
........**********...........
.............................
.............................
.............................
.............................
.............................
.............................
```

As you can clearly see, the two shapes did get into each others way. As Schedio is layered, the one which will be added later will be on the top. You can see that clearly if you change the fill of the Rectangle or Triangle. To make it more visual, let's try changing the background of the canvas to whitespace.

```java
new Schedio (30, 15)
	.setBackground(' ')
	.add(
		new Rectangle (10, 3).setPosition(8, 5)
	)
	.add (
		new Triangle (5)
			.setPosition(3, 2)
			.setFill('.')
	)
	.draw();
```

We called `setFill` on the *Triangle* object and passed in the dot as a filler. Here's how it looks like now:

```
                             
                             
       .                     
      ...                    
     .....                   
    .......*******           
   .........******           
        **********           
                             
                             
                             
                             
                             
                             
```
Impressive!

### Making your own shapes
Just make a regular java class and it should extend **Shape.**
In this case, we're going to make a **Line.**

```java
public class Line extends Shape {

}
```

In the constructor, take all the data you need. For example, a line needs a length.

```java
public class Line extends Shape {
	public Line (int length) {
	
	}
}
```

In the constructor, the first thing you should do is initialize the parent class (Shape) with a width and height of the plane your shape needs to fit itself in. If, for example, you're making a triangle of height 5 units and base 10 units, it needs to occupy a 10x5 plane.
Here, since we're making a horizontal line, we need a plane of height 1 and width equal to `length`.

```java
public class Line extends Shape {
	public Line (int length) {
		super(length, 1);
 	}
}
```
This will provide a stage or a layer for you to draw your shape on.

Next, we need to bind the line object to the parent for the purposes of method chaining.

```java
public class Line extends Shape {
	public Line (int length) {
		super(length, 1);
		super.bindChild(this);
 	}
}
```
`bindChild` is a method of the class, Shape, which makes it aware of its child, establishing a two way connection (one way connection already exists due to inheritance).

Whenever you called the parent constructor, a layer/stage/plane is created which is filled with empty pixels by default. Now it's your turn to fill it up with appropriate pixels.

```java
public class Line extends Shape {
	public Line (int length) {
		super(length, 1);
		super.bindChild(this);

		// Set all the pixels along the x-axis as long as the length is and place them on y = 0 as it's a horizontal line.
		for (int x = 0; x < length; x++) {
			super.setPixel (x, 0, (char) 1);
		}
 	}
}
```

`setPixel` is a method of the class, Shape, which let's you draw the shape on the plane. Since we don't want to specify the character our line should be made out of, we want to set the pixels equal to 1. It's a way of making the pixels abstract and let it be determined by the *fill* of the shape.

## How Schedio works

### Canvas
The canvas is the space inside which you draw shapes with Schedio. Just like how you need a paper to draw things on, canvas is what you need in order to draw using Schedio.

### Pixel
Canvas is made up of characters called pixels. A 10x10 canvas has 100 pixels in it. It's essentially a unicode character with a position represented by x and y values.

### Setting up a canvas
Whenever a Schedio object is created, a blank canvas is created with specified dimensions.

An empty canvas comprises of pixels set to a value of 0. It's a way of telling the renderer "Hey, it's empty space, just fill it with anything you want for visualization!"

> Pixels with characters which have integer equivalency of 0 make transparency possible. 

### Shapes
Anything that you put in the canvas is a shape. It's called a shape as it's something that has form and is visual.

Examples: Rectangle, Triangle, Circle, Parallelogram, Heart, Plus, Line, etc.

Each shape lies in an area known as a plane. It's also known as a layer. Plane is an area in which the shape resides. It's much like a canvas as it's also comprises of characters and empty space is defined by zero characters.

Shapes are repesented by characters known as "fill character."

Pixels which represent the shape itself are defined by characters with an integer equivalent of 1. It's for the sake of abstraction and the renderer automatically visualizes it by using the fill character of the shape.

### Adding shapes to canvas
Whenever you add a shape to the canvas, you essentially merge the canvas with the plane/layer the shape is in. Every pixel in the canvas where you place the layer gets replaced with that of the layer. This excludes the transparent pixels in the layer.

## Background and fill
Every transparent pixel in the canvas (represented by a zero character) is visualized by the *background character*.

Every pixel which makes up the shape (foreground) may be represented by character of value 1 and is visualized by the *fill character.*

## Draw/Render
Rendering is the process of visualizing the canvas. It goes through the pixels and generates a Unicode raster image out of it.