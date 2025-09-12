package LLDApplication.DeliveryManagementSystem;

import LLDApplication.DeliveryManagementSystem.Model.Admin;
import LLDApplication.DeliveryManagementSystem.Model.Agent;
import LLDApplication.DeliveryManagementSystem.Model.Order;

public class Main {
    public static void main(String[] args) {
        Order orderA = new Order(1, "Order A", "560087");
        Order orderB = new Order(2, "Order B", "560088");
        Order orderC = new Order(3, "Order C", "560089");
        Order orderD = new Order(4, "Order D", "560087");
        Agent agentA = new Agent(1,"A", "560087");
        Agent agentB = new Agent(2,"B", "560088");
        Agent agentC = new Agent(3,"C", "560089");

        Admin admin = new Admin();
        admin.addOrder(orderA);
        admin.addOrder(orderB);
        admin.addOrder(orderC);
        admin.addOrder(orderD);

        admin.addAgent(agentA);
        admin.addAgent(agentB);
        admin.addAgent(agentC);
        //System.out.println("Rajkishor");
        admin.driverFunction();



    }
}
