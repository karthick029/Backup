package week1;

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter MONTH ");  
		int num = sc.nextInt();
		
		String[] months = {"January", "February", "March", "april","may","june","july","august","september","oct","nov", "December"};
		
		if (num >= 1 && num <= 12) {
		    System.out.println("The name of month number %d is %s\n"+ num + months[num-1]);
		} else {
		    System.out.println("You have entered an invalid number");
		}
	   sc.close();	
	}

}
