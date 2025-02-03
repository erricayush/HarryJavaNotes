

import java.util.*;

public class FailOrPass {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the marks of first subject");
        int sub1=scan.nextInt();
        System.out.println("Enter the marks of second subjects");
        int sub2=scan.nextInt();
        System.out.println("Enter the marks of third subject");
        int sub3=scan.nextInt();
        int p1=calculatePercntage(sub1);
        int p2=calculatePercntage(sub2);
        int p3=calculatePercntage(sub3);
        
        if(p1>=33 && p2>=33 && p3>=33){
            System.out.println("Student is pass");
        }
        else{
            System.out.println("Student is fail");
        }




        
    }
    public static int calculatePercntage(int marks){
        return (marks*100)/100;
   }

}

