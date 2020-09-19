package Constructors;

//Created an abstract class to not allow it to create instances of itself, but be accessible to subclasses

public abstract class Dacia extends Car {

    public Dacia(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

}
