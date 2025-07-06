JCC = javac

all: Main.class

Main.class: Main.java functions/Calc.class functions/Game.class
	$(JCC) Main.java

functions/Calc.class: functions/Calc.java
	$(JCC) functions/Calc.java

functions/Game.class: functions/Game.java
	$(JCC) functions/Game.java

run: all
	java Main

clean:
	rm -f Main.class functions/*.class