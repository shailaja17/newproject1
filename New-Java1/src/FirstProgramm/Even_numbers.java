package FirstProgramm;

import java.awt.SystemColor;
import java.util.Scanner;

public class Even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner s = new Scanner(System.in);
	System.out.println("please enter number");
		
	int i= s.nextInt();
	
		//System.out.println("please enter number");
		if(i%2==0)
		{
System.out.println(  i +" " +"is even number");


	}
		else 
		{
			System.out.println(i+" "+ " + is not even number");
		}

}
}
