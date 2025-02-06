//package JAVA.javapractice.codewithharry.practiceSet_1.Chapter-6;
import java.util.*;
public class AddOfTwoMatrix {
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the number of row and column: ");
        int r=scan.nextInt();
        int m=scan.nextInt();
        System.out.println("Enter the element of 1st matrix: ");
        int [][]m1=new int[r][m];
        for(int i=0;i<r;i++){
            for(int j=0;j<m;j++){
                m1[i][j]=scan.nextInt();
            }
        }
        System.out.println("the 1st matrix is :");
        for(int i=0;i<r;i++){
            for(int j=0;j<m;j++){
               System.out.print( m1[i][j]+" ");
            }
            System.out.println();
        }



        System.out.println("Enter the element of 2nd matrix: ");
        int [][]m2=new int[r][m];
        for(int i=0;i<r;i++){
            for(int j=0;j<m;j++){
                m2[i][j]=scan.nextInt();
            }
        }
        System.out.println("the 2nd matrix is :");
        for(int i=0;i<r;i++){
            for(int j=0;j<m;j++){
               System.out.print( m2[i][j]+" ");
            }
            System.out.println();
        }
        

        /// addition of two matrix-------------
        
        System.out.println("Addition of two matrix:");
        int ms[][]=new int[r][m];
        for(int i=0;i<r;i++){
            for(int j=0;j<m;j++){
                ms[i][j]=m1[i][j]+m2[i][j];
            }
        }
     
        for(int i=0;i<r;i++){
            for(int j=0;j<m;j++){
               System.out.print( ms[i][j]+" ");
            }
            System.out.println();
        }
    }
}
