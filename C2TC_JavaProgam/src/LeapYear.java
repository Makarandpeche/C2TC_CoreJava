

	import java.util.Scanner;
	public class LeapYear {
	   public static void main(String[] args){
		   
		   
		   System.out.print("Enter Year: "); 
		   
	     int year =new Scanner(System.in).nextInt();
	     
	     if (year%400==0)
		     System.out.print("leap Year.");
	     else if ((year%4==0) && (year%100!=0))

		     System.out.print("leap Year.");
	     
	     else 
		     System.out.print("not leap Year.");

	   }
	}
	
	/*   System.out.println("Enter an Year :: ");
    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();

    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
       System.out.println("Specified year is a leap year");
    else
       System.out.println("Specified year is not a leap year");*/