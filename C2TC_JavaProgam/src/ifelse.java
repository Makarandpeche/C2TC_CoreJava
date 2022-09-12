import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
	 int Age;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter your Age: ");
	 Age = sc.nextInt();
	 
	 if (Age>125)
		 System.out.println("Invalid Number,Please Enter valid Value");
	 else if (Age>=18)
		 System.out.println("Welcome.Your Vote is valuable for us");
	 else 
		 System.out.println("NOT Elegible to Vote"); 
	   
	 
	}

}
