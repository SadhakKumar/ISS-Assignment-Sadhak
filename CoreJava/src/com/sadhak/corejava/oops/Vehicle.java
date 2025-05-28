package com.sadhak.corejava.oops;

public abstract class Vehicle implements VehicleInsurance {
    // Instance variables for vehicle details
    private String vehicleManufacturer;
    private String vehicleModel;
    private int vehicleTopSpeed;

    // Constructor to initialize the vehicle
    public Vehicle(String vehicleManufacturer, String vehicleModel, int vehicleTopSpeed) {
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleModel = vehicleModel;
        this.vehicleTopSpeed = vehicleTopSpeed;
    }

    // getter methods to access vehicle details
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getVehicleTopSpeed() {
        return vehicleTopSpeed;
    }

    // Abstract start vehicle method to be implemented by subclasses
    public abstract void startVehicle();

}
