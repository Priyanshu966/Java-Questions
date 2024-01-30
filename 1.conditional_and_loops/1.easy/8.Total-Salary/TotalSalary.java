// Problem Description: You have to calculate the rounded off total salary of a person by using
// the formula: totalSalary = basic + hra + da + allow – pf, where hra = 20% of basic, da = 50% of
// basic, allow = 1700, if grade = ‘A’, allow = 1500, if grade = ‘B’, allow = 1300, if grade = ‘C' or
// any other character, pf = 11% of basic. “basic” and the “grade” will be taken as input from the
// user.

// How to Approach?
// 1. Take basic and grade as input from the user.
// 2. Calculate hra, da, pf by using basic.
// 3. Check for the grade and then take the allowance corresponding to it.
// 4. Calculate total salary by using basic, hra, da, pf and allowance calculated above.
// 5. Round off the total salary using library function and then print it

import java.util.Scanner;

public class TotalSalary {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
 
        //Input from users
        System.out.println("Please input ur basic salary");
        int basic = s.nextInt();
        System.out.println("Please input ur grade in single alphabet");
        String gradeStr = s.next();
        char grade = gradeStr.charAt(0);
         
        int allow;
        int hra = 20 * basic / 100;
        int da = 50 * basic / 100;
        int pf = 11 * basic / 100;

        if(grade == 'A' || grade == 'a'){
            allow = 1700;

        }else if(grade == 'B' || grade == 'b'){
            allow = 1500;
        }else{
            allow = 1300;
        }

        int totalSalary = basic + hra + da + allow - pf;
        System.out.println("Total salary is : " + totalSalary);




    }
    
}
