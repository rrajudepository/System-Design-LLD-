package LLDApplication.LockerManagementSystem;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Locker Management System\n");
        Warehouse warehouse = new Warehouse();
        warehouse.addLocker("locker123", Size.M);
        warehouse.addLocker("locker124", Size.L);
        warehouse.addLocker("locker125", Size.S);
        warehouse.addLocker("locker126", Size.M);
        warehouse.addLocker("locker127", Size.L);
        warehouse.addLocker("locker128", Size.XL);

        if(warehouse.findLocker(Size.M)){
            warehouse.strorePackage("locker123");
        }
        if(warehouse.findLocker(Size.L)){
            warehouse.strorePackage("locker124");
        }
        if(warehouse.findLocker(Size.XXL)){
            warehouse.strorePackage("locker124");
        }
        if(warehouse.findLocker(Size.S)){
            warehouse.strorePackage("locker125");
        }
        if(warehouse.findLocker(Size.S)){
            warehouse.strorePackage("locker125");
        }
        warehouse.RemovePackage("locker124");


        
    }
}
