package com.sadhak.corejava.oops;

public class Car extends Vehicle {

    // Instance variable for car type
    protected String carType;

    // Constructor to initialize the car
    public Car(String vehicleManufacturer, String vehicleModel, int vehicleTopSpeed, String carType) {
        super(vehicleManufacturer, vehicleModel, vehicleTopSpeed);
        this.carType = carType;
    }

    // Overloaded constructor to initialize the car with default car type
    public Car(String vehicleManufacturer, String vehicleModel, int vehicleTopSpeed) {
        super(vehicleManufacturer, vehicleModel, vehicleTopSpeed);
        // Default car type if not specified
        this.carType = "SUV";
    }

    // Getter method to access car type
    public String getCarType() {
        return carType;
    }

    // Implementation of the abstract startVehicle method
    @Override
    public void startVehicle() {
        System.out
                .println("Starting the " + getVehicleManufacturer() + " " + getVehicleModel() + " of type " + carType);
    }

    // Method to get cars details
    public String getCarDetails() {
        return "Car Manufacturer: " + getVehicleManufacturer() + ", Model: " + getVehicleModel() + ", Top Speed: "
                + getVehicleTopSpeed() + " km/h, Type: " + carType;
    }

    // Method to calculate insurance premium based on vehicle type and value
    @Override
    public double calculatePremium(String vehicleType, double vehicleTopSpeed) {
        double basePremium = 500; // Base premium amount
        double typeFactor = 1.0; // Factor based on vehicle type

        // Adjust factor based on vehicle type
        if (vehicleType.equalsIgnoreCase("SUV")) {
            typeFactor = 1.5;
        } else if (vehicleType.equalsIgnoreCase("Sedan")) {
            typeFactor = 1.2;
        } else if (vehicleType.equalsIgnoreCase("Hatchback")) {
            typeFactor = 1.0;
        }

        return basePremium * typeFactor * (vehicleTopSpeed); // Premium calculation
    }

    // Method to file a claim
    @Override
    public boolean fileClaim(String policyNumber, String claimDetails) {
        // Simulate claim filing process
        System.out.println("Claim filed for policy number: " + policyNumber + " with details: " + claimDetails);
        return true; // Assume claim is successfully filed
    }

}
