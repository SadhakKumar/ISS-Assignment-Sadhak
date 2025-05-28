package com.sadhak.corejava.oops;

public class Main {
    public static void main(String[] args) {

        // Create a car object
        Car myCar = new Car("Toyota", "Camry", 200, "Sedan");

        // Creating a car object with a different constructor
        // This constructor is used to demonstrate constructor overloading
        Car myCar2 = new Car("Honda", "Civic", 180);

        // Accessing cars protected member within the same package
        System.out.println("Protected instance variable car type: " + myCar.carType);

        // Creating a bike object of reference type Vehicle
        Vehicle myBike = new Bike("Yamaha", "R15", 150, "Sport");

        // Gerting cars details
        System.out.println("Car1 details: " + myCar.getCarDetails());
        System.out.println("Car2 details: " + myCar2.getCarDetails());

        // Starting the car and bike
        myCar.startVehicle();
        myBike.startVehicle();

        // Calculate insurance premium for the car
        double carPremium = myCar.calculatePremium(myCar.getCarType(), myCar.getVehicleTopSpeed());
        System.out.println("Car Insurance Premium: " + carPremium);

        // Calculate insurance premium for the bike
        double bikePremium = myBike.calculatePremium(myBike.getVehicleModel(), myBike.getVehicleTopSpeed());
        System.out.println("Bike Insurance Premium: " + bikePremium);

    }
}
