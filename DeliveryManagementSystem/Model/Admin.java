package LLDApplication.DeliveryManagementSystem.Model;
import java.util.List;
import java.util.ArrayList;
public class Admin {
    List<Order> orders;
    List<Agent> agents;

    public Admin() {
        this.orders = new ArrayList<>();
        this.agents = new ArrayList<>();
    }

    public Admin(List<Order> orders, List<Agent> agents) {
        this.orders = orders;
        this.agents = agents;
    }

    //methods
    public void addOrder(Order order){
        orders.add(order);
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }
    public void driverFunction(){
        for(Order order: orders){
           Agent agent = deliveryOrder(order);
           if(agent!=null){
            System.out.println("Agent "+agent.getAgentName()+" has delivered the "+order.getOrderName()+ " to the pincode "+order.getPinCode());
            agent.setAvailability(true);
           }

        }
    }
    public Agent deliveryOrder(Order order){
        String orderPincode = order.getPinCode();
        for(Agent agent : agents){
            String agentPincode = agent.getPinCode();
            if(orderPincode==agentPincode && agent.getAvailability()){
                System.out.println("Agent "+ agent.getAgentName()+" has picked up "+order.getOrderName());
                agent.setAvailability(false);
                order.setOrdeStatus(Status.DELIVERED);
                return agent;
            }
        }
        System.out.println("All agents are busy!");
        return null;
    }

    

}
