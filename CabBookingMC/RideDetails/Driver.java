package CabBookingMC.RideDetails;

public class Driver {
    private String name;
    private int age;
    private char sex;
    private String vehicleNumber;
    private int x;
    private int y;
    private String vehicleName;
    private boolean available;
    private int totalEarning;
    
    public Driver(String name,int age, char sex,  String vehicleNumber, int x, int y, String vehicleName){
        this.name =name;
        this.age = age;
        this.sex = sex;
        this.vehicleNumber =vehicleNumber;
        this.x=x;
        this.y=y;
        this.vehicleName =vehicleName;
        this.available = true;
        this.totalEarning =0;
    }
    
    public void updateLocation(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void changeDriverStatus(boolean available){
        this.available = available;
    }
    
    public int getlocationX(){
        return this.x;
    }
    public int getlocationY(){
        return this.y;
    }
    public void updateEarning(int fare){
        this.totalEarning+=fare;
    }
    public void getEarning(){
        System.out.println(this.name + " earns "+ this.totalEarning);
    }
    public void getInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Sex : "+this.sex);
        System.out.println("Location : ("+this.x+","+this.y+")");
        System.out.println("Vehicle Number : "+ this.vehicleNumber);
        System.out.println("Vehicle Name : "+ this.vehicleName);
        //System.out.println("Total Earning : "+ this.totalEarning);
        System.out.println();
    }
    
    public boolean isAvailable(){
        return this.available;
    }
}
