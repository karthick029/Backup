package homework;

public class Amstrong100to1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to find armstrong number from 100 to 999
		for (int k =100;k<=1000;k++ )
		{	//int number = 0 ;
			int n=0;
			int d=0;
			int s=0;
			
		n=k;
		
		
		while (n>0)
		{
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
			
		}
		if(k==s )

		{System.out.println("amstrongnumber"+k);
	}

}
}}