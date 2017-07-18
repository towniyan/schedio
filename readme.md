## Schedio
Schedio is a library for drawing raster ASCII art in a layered style with opacity. It's extendible and there's nothing to limit you from drawing the shapes you desire.

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
Canvas is the piece of paper on top of which you'll be drawing.
### Setting up the canvas
A canvas (space for drawing) will be automatically setup whenever you create a new **Schedio** object. You've to specify the width and height of the canvas. Here, a canvas is generated with width: 30 and height: 15.

```java
new Schedio (30, 15);
```

After the canvas is setup, we can add stuff to it and render it for seeing the fianl result.

You can think of the Schedio object as the canvas itself.

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

### Setting background of the canvas
By default, for visual purposes, the dot (.) is the background of the canvas. You can set the background to anything you like by calling `setBackground` method on the Schedio object and specifying the char as an argument.

```java
new Schedio(30, 15);
	.setBackground(' ')
	.draw();
```
In this case, I want the background to comprise of whitespaces. And it should yield a result like this:

```
                             
                             
                             
                             
                             
        **********           
        **********           
        **********           
                             
                             
                             
                             
                             
                             

```
You may find it cleaner than the dotted background. However, for educational purposes, we want to stick with the default background.

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
It'll be added later. Stay tuned!