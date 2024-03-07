public class Vehicle {

    private String color;
    int maxSpeed;
   

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void print(){
        System.out.println("Vehicle " + this.color + " " + this.maxSpeed);
    }
    
}
