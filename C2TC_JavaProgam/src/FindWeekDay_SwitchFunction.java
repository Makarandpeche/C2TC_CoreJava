import java.util.Scanner;
public class FindWeekDay_SwitchFunction {

		public static void main(String[] args) {
		System.out.print("Enter Value between 1 to 7 :");
		int Value = new Scanner(System.in).nextInt();
		
		switch(Value) {
		case 1 -> System.out.print("Monday");
		case 2 -> System.out.print("Tuesday");
		case 3 -> System.out.print("Wednesday");
		case 4 -> System.out.print("Thusday");
		case 5 -> System.out.print("Friday");
		case 6 -> System.out.print("Saturday");
		case 7 -> System.out.print("Sunday");
		 }
		
		
		if( (Value>= 1) && (Value<=7))
			System.out.print("");
		else
			System.out.print("Enter Valid Number.");	
        	
	}
}


 