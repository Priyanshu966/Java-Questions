

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Sakura",21);
        Student s2 = new Student("Naruto",33);
        Student s3 = new Student("Sasuke",49);
   
        System.out.println(s1.name + " " + s1.getRollNumber());
        System.out.println(s2.name + " " + s2.getRollNumber());
        System.out.println(s3.name + " " + s3.getRollNumber());
        System.out.println("Total No of students are:- " + Student.TOTALSTUDENTS);

    
        
    }

    
    
}
