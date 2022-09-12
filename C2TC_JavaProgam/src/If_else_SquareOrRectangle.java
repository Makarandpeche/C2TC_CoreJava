import java.util.Scanner;
public class If_else_SquareOrRectangle {

	public static void main(String[] args) {
		System.out.print("Enter Length: ");
		int l = new Scanner(System.in).nextInt();
		System.out.print("Enter Breadth: ");
		int b = new Scanner(System.in).nextInt();
		
		if(l==b)
			System.out.println("It's a Square.");
		else
			System.out.println("It's a Rectangel.");
		

	}

}
