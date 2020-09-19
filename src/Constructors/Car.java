package Constructors;


public abstract class Car extends Vehicle {

    private float availableFuel;
    private Integer tireSize;
    private Integer gear;
    private boolean engineRunning;
    private double speed;
    private float averageFuelConsumption;
    private String chassisNumber;

    public Car(float availableFuel, String chassisNumber){
        super(availableFuel, chassisNumber);
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

}
