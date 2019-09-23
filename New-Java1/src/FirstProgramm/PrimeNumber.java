package FirstProgramm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter number:");	
		Scanner s =new Scanner(System.in);
		int number=s.nextInt();
		
		boolean m=false;
		
		for(int i=2; i<=number; i++)
		{
				
		if(number%i==0)	
		{
			
			m=true;
			break;
		
			
			}
		}
		if(!m)
		{
			System.out.println(number +" "+ " is a prime number");
		}
		else
		{
			System.out.println(number +" "+ " is  not a prime number");
		}
				
				

	}

}
