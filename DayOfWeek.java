import java.util.*;
class DayOfWeek{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("-----------days of week------------"); 
            System.out.println("1.Sunday");
            System.out.println("2.Monday");
            System.out.println("3.Tuesday");
            System.out.println("4.Wednesday");
            System.out.println("5.Thursday");
            System.out.println("6.Friday");
            System.out.println("7.Sutrday");
            System.out.println("------------------------------------");
            System.out.println("Enter the Number:");
            choice=scan.nextInt();
            switch (choice) {
                case 1:System.out.println("The day is Sunday");
                    break;
                case 2:System.out.println("The day is Monday");
                    break;    
                case 3:System.out.println("The day is  Tuesday");
                    break;
                case 4:System.out.println("The day is Wednesday");
                    break;
                case 5:System.out.println("The day is Thursday");
                    break;
                case 6:System.out.println("The  day is Friday");
                    break;
                case 7:System.out.println("The  day is Saturday");
                    break;
                case 8: break;
                   
                default: System.out.println("Invalid input");
                    
            }
                
            
        }while (choice!=8) ;
            
        
        
    }
}