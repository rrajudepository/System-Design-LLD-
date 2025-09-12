package LLDApplication.DeliveryManagementSystem.Model;

public class Order {
    int orderId;
    String orderName;
    String pinCode;
    Status orderStatus;
    
    public Order() {}

    public Order(int orderId, String orderName, String pinCode) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.pinCode = pinCode;
        this.orderStatus =  Status.BOOKED;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Status getOrdeStatus() {
        return orderStatus;
    }

    public void setOrdeStatus(Status ordeStatus) {
        this.orderStatus = ordeStatus;
    }
    
}
