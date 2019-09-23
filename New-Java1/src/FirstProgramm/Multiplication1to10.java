package FirstProgramm;

public class Multiplication1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println();
			System.out.println(i +"Table");
			System.out.println("**********");
			
			for(int j=1;j<=12;j++)
			{
				z= i*j;
				System.out.println(i+ "*"+j+"="+z);
			}
		}
	}

}
