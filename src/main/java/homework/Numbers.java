package homework;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numb =new Scanner(System.in); 
		System.out.println("Enter num1 ,num2"); 
		int num1 = numb.nextInt();
		int num2 = numb.nextInt();
        for (int i= num1;i<=num2 ;i++ )
               {
		if(i%3==0&&i%5==0 )
		{     System.out.print(" FIZZ");
		}
		else if(i%5 ==0  )
		{     System.out.print(" BUZZ");
		}
		 
		else if( i%3==0 ) {
	          System.out.print("FIZZBUZZ");
		}
		else 
		{     System.out.print("");
		}	//System.out.print("");
        }		  
		
	}
}
