/*
                        Up to 3-LPA          ----    Nil
                 Rs. 300001 – Rs. 500000     ----    10%
                 Rs. 500001 – Rs. 1000000    ----    20%
                 Rs. 1000000 and above       ----    30%
                 
 */


import java.util.Scanner;
public class slab {

	public static void main(String[] args) {
		double tax = 0;
		System.out.print("Enter your Income");
		double income = new Scanner(System.in).nextDouble();
		
		
		
		if (income<=300000) {
		
			tax=tax+0;
		}
		
		else if (income>300000 && income<=500000) {
            		 
			tax = tax+ 0.1*(income-300000);
			}
		else if(income>500000 && income<=1000000) {
			tax = tax+ 0.1*(500000-300000);
			tax = tax+ 0.2*(income-500000);
		}
			
		else if(income>1000000) {
			tax = tax+ 0.1*(500000-300000);
			tax = tax+ 0.2*(1000000-500000);
			tax = tax+ 0.3*(income-1000000);
		}
			
			System.out.print("The total tax paid by user is :"+tax);
								
	}


}
