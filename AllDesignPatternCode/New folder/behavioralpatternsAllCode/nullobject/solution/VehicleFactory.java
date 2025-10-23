package com.conceptcoding.behavioralpatterns.nullobject.solution;

import com.conceptcoding.behavioralpatterns.nullobject.Bike;
import com.conceptcoding.behavioralpatterns.nullobject.Car;
import com.conceptcoding.behavioralpatterns.nullobject.Vehicle;

public class VehicleFactory {
    
    public static Vehicle getVehicle(String type) {
        if (type.equals("car")) {
            return new Car("Toyota", "Red", 5, 60, true);
        } else if (type.equals("bike")) {
            return new Bike("Yamaha", "Black", 60);
        } else {
            return new NullVehicle(); // THE SOLUTION
        }
    }
}
