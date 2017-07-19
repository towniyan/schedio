all: Helper.class Schedio.class Rectangle.class Triangle.class Plus.class Test.class

%.class: %.java
	javac $<
clean:
	rm -f *.class