all: Helper.class Schedio.class Test.class

%.class: %.java
	javac $<
clean:
	rm -f *.class