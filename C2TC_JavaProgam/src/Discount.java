/*
Discount.java Purchase Amount in Rs.	 Discount on Laptop	  Discount on Desktop
       
       0-25000	                0.0                    5.0%
     25001-57000                5.0%	               7.5%
     57001-100000	            7.5%	               10.0%
     more than 100000	        10.0%	               15.0%

Write a program based on the above criteria to input name, address, amount of purchase and type of 
purchase(L for Laptop and D for Desktop) by the customer. compute and print the net amount to be paid
by a customer along with his/ her name and address.

 */


import java.util.Scanner;

public class Discount {

	

	public static void main(String[] args) {
	    System.out.print("Enter your name: "); 
	    String Name =new Scanner(System.in).next();
	 
		System.out.print("Enter your address: ");
	    String Address =new Scanner(System.in).next();

		System.out.print("Enter your amount: ");
	    int Amount =new Scanner(System.in).nextInt();
		
		System.out.print("Enter Laptop(L) or Dextop(D): ");    
	    String machine =new Scanner(System.in).next();
		
	    if (Amount>=0 && Amount<=25000) {
		     if(machine.equalsIgnoreCase("D")) {
		    	 System.out.format("  Name: %s\n Address: %s\n Amount: %d\n you get 5.0%% discount on your Desktop now your discounted price is only "+(Amount-(Amount*0.05)) , Name, Address, Amount );}
		     else if(machine.equalsIgnoreCase("L")) {
		    	 System.out.format(" Name: %s\n Address: %s\n Amount: %d\n you get 0.0%% discount on your Laptop now your discounted price is only "+(Amount-(Amount*0.0)) , Name, Address, Amount );}
	         else {
	    		System.out.print("Invalid inputs,please Enter valid input 1");}
		     }
		else if (Amount>=25001 && Amount<=57001) {
		     if(machine.equalsIgnoreCase("D")) {
		    	 System.out.format("  Name: %s\n Address: %s\n Amount: %d\n you get 7.5%% discount on your Desktop now your discounted price is only "+(Amount-(Amount*0.075)) , Name, Address, Amount );}
		     else if(machine.equalsIgnoreCase("L")) {
		    	 System.out.format(" Name: %s\n Address: %s\n Amount: %d\n you get 5.0%% discount on your Laptopnow your discounted price is only "+(Amount-(Amount*0.05)) , Name, Address, Amount );}
	         else {
	    		System.out.print("Invalid inputs,please Enter valid input 2");}
		
	    	}
		
		
	    else if (Amount>=57001 && Amount<=100000) {
		     if(machine.equalsIgnoreCase("D")) {
		    	 System.out.format("  Name: %s\n Address: %s\n Amount: %d\n you get 10.0%% discount on your Desktop now your discounted price is only "+(Amount-(Amount*0.10)) , Name, Address, Amount );}
		     else if(machine.equalsIgnoreCase("L")) {
		    	 System.out.format(" Name: %s\n Address: %s\n Amount: %d\n you get 7.5%% discount on your Laptop now your discounted price is only "+(Amount-(Amount*0.075)) , Name, Address, Amount );}
	         else {
	    		System.out.print("Invalid inputs,please Enter valid input 3");}
	    	}
		
	    else if (Amount>=100000 ) {
		     if(machine.equalsIgnoreCase("D")) {
		    	 System.out.format(" Name: %s\n Address: %s\n Amount: %d\n you get 15.0%% discount on your Desktopnow your discounted price is only "+(Amount-(Amount*0.15)) , Name, Address, Amount );}
		     else if(machine.equalsIgnoreCase("C")) {
		    	 System.out.format("  Name: %s\n Address: %s\n Amount: %d\n you get 10.0%% discount on your Laptopnow your discounted price is only "+(Amount-(Amount*0.10)) , Name, Address, Amount );}
	         else {
	    		System.out.print("Invalid inputs,please Enter valid input  4");}
	    	}
	    else {
				System.out.print("Invalid inputs,please Check Name,Address,Amount or (Enter Laptop(L) or Computer(C)) correctly");}

}
}

