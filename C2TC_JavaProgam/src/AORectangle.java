import java.util.Scanner;
public class AORectangle {

	public static void main(String[] args) {
		
		 System.out.println("Enter the length:");
         int l= new Scanner(System.in).nextInt();
        
         System.out.println("Enter the breadth:");
         int b= new Scanner(System.in).nextInt();
        
          
          int  area=l*b;
          System.out.format("length is %d and breadth is %d so the total l*b area is %d " ,l ,b ,area);     
				
	}

}
