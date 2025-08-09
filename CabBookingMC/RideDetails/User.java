package CabBookingMC.RideDetails;

public class User {
    private String name;
    private int age;
    private int x;
    private int y;
    private char sex;
    
    public User(String name, int age, int x, int y, char sex){
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
        this.sex = sex;

    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public char getSex(){
        return this.sex;
    }
    public void updateLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void getInfo(){
        System.out.println("User Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Sex : "+this.sex);
        System.out.println("Location : ("+this.x+","+this.y+")");
    }
}
