JFLAGS = -g
JC = javac
CLASSES = HNumbers.java SDeviation.java Identity.java

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class *.png
