import java.util.Scanner;
public class DetectWebSite_URL {

	public static void main(String[] args) {
		System.out.print("Enter a website: ");
		String  www = new Scanner(System.in).next();
		if (www.endsWith(".com"))
			System.out.print("This is Commercial website.");
		else if (www.endsWith(".org"))
			System.out.print("This is Originational website.");
		else if (www.endsWith(".in"))
			System.out.print("This is indian website.");
		else
			System.out.print("Other than '.com','.org','.in' ");

			

	}

}
