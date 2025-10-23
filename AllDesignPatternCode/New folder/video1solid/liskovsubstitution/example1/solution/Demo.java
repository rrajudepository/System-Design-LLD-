package com.conceptcoding.video1solid.liskovsubstitution.example1.solution;

// Usage of LSP-compliant design
public class Demo {
    public static void main(String[] args) {
        // create the objects
        MotorCycle motorCycle = new MotorCycle("HeroHonda", 10);
        Bicycle bicycle = new Bicycle("Hercules", true, 10);

        // use the objects
        // Works fine with MotorCycle - implements all Bike class behavior
        motorCycle.turnOnEngine();
        motorCycle.accelerate();
        motorCycle.applyBrakes();
        motorCycle.turnOffEngine();
        // Works fine with Bicycle - implements all Bike class behavior
        bicycle.accelerate();
        bicycle.applyBrakes();
    }
}
