import java.util.Scanner;
public class GreatestAmongThem {

	public static void main(String[] args) {
	   System.out.print("Enter First Number: ");
       int a = new Scanner(System.in).nextInt();
       System.out.print("Enter Second Number: ");
       int b = new Scanner(System.in).nextInt();
       
       
       if (a>b)
    	   System.out.format("%d is Greater than %d. " ,a ,b);
       
       else if (a==b)
    	   System.out.format("'a' and 'b' are Same = %d. " ,a ,b);
       
       else     	  
    	   System.out.format("%d is Greater than %d. " , b ,a);



	}

}
