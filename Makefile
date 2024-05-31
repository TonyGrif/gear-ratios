.PHONY: all clean

all:
	@java -cp src src/main/java/GearRatios.java

clean:
	@rm src/main/java/GearRatios.class
