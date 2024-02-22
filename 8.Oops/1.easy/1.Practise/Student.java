public class Student {
    String name;
    private final int rollNumber;
    final static  double PI = 3.14;
    static int TOTALSTUDENTS; 
    
    
    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        this.TOTALSTUDENTS++;

    }
  

    public int getRollNumber(){
        return this.rollNumber;
    }

    public static int getTotalStudents(){
        return TOTALSTUDENTS;
    }

    
    public static void main(String[] args) {
       
        
    }
    
}
