package Constructors;

public class Logan extends Dacia {

    protected final Integer fuelTankSize = 55;
    private final String fuelType = "Petrol";
    private final double consumptionPer100Km = 4.8;

   public Logan(float availableFuel, String chassisNumber) {
        super(availableFuel, chassisNumber);
    }

}
