package Constructors;

public class Vehicle {
    private float availableFuel;
    private Integer tireSize;
    private Integer gear;
    private boolean engineRunning;
    private double speed;
    private float averageFuelConsumption;
    private String chassisNumber;

    public Vehicle (float availableFuel, String chassisNumber){
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    public boolean start(){
        return engineRunning = true;
    }

    public boolean stop(){
        return engineRunning = false;
    }

    public void shiftGear(Integer gear){
        this.gear = gear;
    }

    public void drive(double speed){
        this.speed = speed;
    }

    public void cruiseSpeed(){
        if (start() && gear >= 1){
            System.out.println("The cruise speed is: " + speed);
        } else{
            if (stop()) {
                System.out.println("Start the car first!");
            }
        }
    }

}
