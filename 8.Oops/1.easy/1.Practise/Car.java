public class Car extends Vehicle{

    int noOfDoors;

    public void print(){
        System.out.println("Car " + noOfDoors + " " + super.getColor() + " " + super.maxSpeed);
    }
    
}
