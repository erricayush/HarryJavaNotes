//package JAVA.javapractice.codewithharry.practiceSet_1.Chapter-6;
import java.util.*;
public class ArrayOfFloats {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the limit of array:");
        int n=scan.nextInt();
        Float []f=new Float[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+" element of array:");
            f[i]=scan.nextFloat();
        }
        Float S=0F;
        for(int i=0;i<n;i++){
            System.out.println(f[i]);
          
            S=(Float)S+f[i];
        }
        System.out.println("Sum of all elements is: "+S);

    }
}
