package FirstProgramm;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		int revnum=0;
		System.out.println("please enter number:");	
		Scanner s= new Scanner(System.in);
	num= s.nextInt();
	 while(num!=0)
	 {
		 revnum=revnum*10;
		 revnum=revnum +num%10;
		 num=num/10;
	 }
	 System.out.println("reverse number is   " + revnum);
	
	}

}
