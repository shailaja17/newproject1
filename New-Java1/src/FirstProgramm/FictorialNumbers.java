package FirstProgramm;

import java.util.Scanner;

public class FictorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1;
		Scanner s =new Scanner(System.in);
		
		System.out.println("please enter number");
		int number=s.nextInt();
	
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
			System.out.println("the factorila of "+ number+"is"+ " " +fact);
			
	
	
	}
	

}
