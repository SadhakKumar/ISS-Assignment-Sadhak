package com.sadhak.corejava.oops;

public interface VehicleInsurance {
    // Method to calculate insurance premium based on vehicle type and value
    double calculatePremium(String vehicleType, double vehicleTopSpeed);

    // Method to file a claim
    boolean fileClaim(String policyNumber, String claimDetails);
}
