/*
 A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895
 */

import java.util.Scanner;
public class ReverseDigit {
public static void main(String[] args) {
	 System.out.println("Enter Four digit number: ");
	 int z =new Scanner(System.in).nextInt();
	 int first =(z/1)%10;
	 int sec =(z/10)%10;
	 int third =(z/100)%10;
	 int fourth =(z/1000)%10;
	 int total =(first*1000)+(sec*100)+(third*10)+(fourth*1);
		     
		      
      if ((z<1000) || (z>10000)) {
		 System.out.print("invalid number,please enter valid number");
		}
	  else  {
         System.out.println(total);
	  	}
  }
}  