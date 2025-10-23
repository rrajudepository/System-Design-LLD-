package com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution;

import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context.GoodsVehicle;
import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context.HybridVehicle;
import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context.SportsVehicle;
import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.context.Vehicle;
import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategies.EVDrive;
import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategies.NormalDrive;
import com.conceptcoding.behavioralpatterns.strategy.vehicledrivemodes.solution.strategies.SportsDrive;

public class Demo {
    public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Vehicle Drive Modes ######");

        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();

        vehicle = new HybridVehicle(new EVDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();
    }
}
