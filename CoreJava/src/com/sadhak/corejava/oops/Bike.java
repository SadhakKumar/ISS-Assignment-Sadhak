package com.sadhak.corejava.oops;

public class Bike extends Vehicle {

    // Instance variable for bike type
    private String bikeType;

    // Constructor to initialize the bike
    public Bike(String vehicleManufacturer, String vehicleModel, int vehicleTopSpeed, String bikeType) {
        super(vehicleManufacturer, vehicleModel, vehicleTopSpeed);
        this.bikeType = bikeType;
    }

    // Getter method to access bike type
    public String getBikeType() {
        return bikeType;
    }

    // Implementation of the abstract startVehicle method
    @Override
    public void startVehicle() {
        System.out
                .println("Starting the " + getVehicleManufacturer() + " " + getVehicleModel() + " of type " + bikeType);
    }

    // Method to get bike details
    public String getBikeDetails() {
        return "Bike Manufacturer: " + getVehicleManufacturer() + ", Model: " + getVehicleModel() + ", Top Speed: "
                + getVehicleTopSpeed() + " km/h, Type: " + bikeType;
    }

    // Method to calculate insurance premium based on vehicle type and value
    @Override
    public double calculatePremium(String vehicleType, double vehicleTopSpeed) {
        double basePremium = 500; // Base premium amount
        double typeFactor = 1.0; // Factor based on vehicle type

        // Adjust factor based on vehicle type
        if (vehicleType.equalsIgnoreCase("Sports")) {
            typeFactor = 1.5;
        } else if (vehicleType.equalsIgnoreCase("Cruiser")) {
            typeFactor = 1.2;
        } else if (vehicleType.equalsIgnoreCase("Standard")) {
            typeFactor = 1.0;
        }

        return basePremium * typeFactor * (vehicleTopSpeed); // Premium calculation
    }

    // Method to file a claim
    @Override
    public boolean fileClaim(String policyNumber, String claimDetails) {
        System.out.println("Claim filed for policy number: " + policyNumber + " with details: " + claimDetails);
        return true;
    }

}
