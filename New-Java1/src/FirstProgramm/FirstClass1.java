package FirstProgramm;

public class FirstClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=100;
int j=20;
int z=i+j;
int x= i*j;
int y=i/j;


// Additional  operators
System.out.println("------Additional operators----");

System.out.println("This is first value of i=  " + i);
System.out.println("Thiss is first value of j=  "+ j);
System.out.println(" This is addition of i + j=   " + z);
System.out.println("This is multiplication of i*j=  " + x);
System.out.println("This is multiplication of i/j=  " + y);

//Rational operators
System.out.println();

System.out.println("------Rational operators----- ");
System.out.println(i==j);
System.out.println(i<=j);
System.out.println(i>=j);
System.out.println(i!=j);
System.out.println(i>j);
System.out.println(i<j);

//Logical operator
System.out.println("----Logical operator-----");


System.out.println(i==100 & j==20);
System.out.println(i<=99 & j==20);
System.out.println(i==200 | j==20);

//Increment/decrement operator
System.out.println("----Increment or decrement operator----");
System.out.println("incrementing i value " + ++i );
System.out.println("decrementing i value" + --i);





	}

}
