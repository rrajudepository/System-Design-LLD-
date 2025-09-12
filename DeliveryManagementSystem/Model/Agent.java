package LLDApplication.DeliveryManagementSystem.Model;

public class Agent {
    int agentId;
    String agentName;
    String pinCode;
    boolean available;
    
    public Agent() {}

    public Agent(int agentId, String agentName, String pinCode) {
        this.agentId = agentId;
        this.agentName = agentName;
        this.pinCode = pinCode;
        this.available = true;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public boolean getAvailability() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }
    
}
