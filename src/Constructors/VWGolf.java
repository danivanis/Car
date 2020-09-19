package Constructors;

public class VWGolf extends Volkswagen {

    protected final Integer fuelTankSize = 60;
    private final String fuelType = "Diesel";
    private final double consumptionPer100Km = 5.2;

    public VWGolf (float availableFuel, String chassisNumber){
        super(availableFuel, chassisNumber);
    }
}
