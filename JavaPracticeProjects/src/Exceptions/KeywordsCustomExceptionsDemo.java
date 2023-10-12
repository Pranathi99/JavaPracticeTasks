package Exceptions;

public class KeywordsCustomExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int[]arr=new int[10];
		try {
			double result=divide(a,b);
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		
		try {
			addToArray(10,10,arr);
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		finally {
			System.out.println("In finally block!");
		}
		
		int age=-10;
		try {
			getAgeValidity(age);
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex);
		}
	}
	
	public static double divide(int a,int b)
	{
		if(b==0)
			throw new ArithmeticException("Cannot divide by zero!");
		else
			return a/b;
	}
	
	public static double addToArray(int val,int index,int[]arr) throws IndexOutOfBoundsException
	{
		return arr[index]=val;
	}
	
	public static void getAgeValidity(int age) throws InvalidAgeException 
	{
		if(age<0)
			throw new InvalidAgeException();
	}

}

class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
		super("Invalid age. Try again!");
	}
}

