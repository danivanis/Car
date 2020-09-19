package App;


import Constructors.Car;
import Constructors.Logan;
import Constructors.VWGolf;
import Constructors.Vehicle;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Logan (27,"oiqe0934hkkadsn");
        car1.start();
        car1.shiftGear(1);
        car1.drive(0.01);
        car1.shiftGear(2);
        car1.drive(0.02);
        car1.shiftGear(3);
        car1.drive(0.5);
        car1.shiftGear(4);
        car1.drive(0.5);
        car1.shiftGear(4);
        car1.drive(0.5);
        car1.shiftGear(5);
        car1.drive(10);
        car1.shiftGear(4);
        car1.drive(0.5);
        car1.shiftGear(3);
        car1.drive(0.1);
        car1.cruiseSpeed();
        car1.stop();
        float loganAvailableFuel = car1.getAvailableFuel();
        float loganFuelConsumedPer100Km = car1.getAverageFuelConsumption();


        Vehicle vehicle = new VWGolf(30,"1987ddkshik289");
        vehicle.start();
        vehicle.drive(1);
        vehicle.stop();
        Car car2 = (Car) vehicle;
        float golfAvailableFuel = car2.getAvailableFuel();
        float golfFuelConsumedPer100Km = car2.getAverageFuelConsumption();
    }

}
