public class VehicleUse {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.setColor("red");
        b.maxSpeed = 5;

        Car c = new Car();
        c.noOfDoors = 4;
        c.setColor("blue");
        c.maxSpeed = 8;

        Mercedes m = new Mercedes();

        b.print();
        c.print();
        m.print();
        
    }
    
}
