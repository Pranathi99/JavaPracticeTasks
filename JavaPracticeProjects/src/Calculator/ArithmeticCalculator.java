package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		int op;
		System.out.println("Enter:\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n");
		System.out.println("Enter the operation to be performed : ");
		while((op=sc.nextInt())!=-1)
		{
			switch(op)
			{
			case 1:
				Addition ad=new Addition(num1,num2);
				System.out.println(ad.addition());
				break;
			case 2:
				Subtraction sb=new Subtraction(num1,num2);
				System.out.println(sb.subtraction());
				break;
			case 3:
				Multiplication mt=new Multiplication(num1, num2);
				System.out.println(mt.multiplication());
				break;
			case 4:
				Division dv=new Division(num1,num2);
				System.out.println(dv.division());
				break;
			default:
				System.out.println("Please enter a valid number!");
			}
			System.out.println("------------------------------------------------------");
			System.out.println("Enter two numbers:");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println("Enter\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n");
			System.out.println("Enter -1 to Stop the calculator!");
			System.out.println("Enter the operation to be performed : ");
		}
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Entered number is not a valid number! "+ ex.getMessage());
		}
	}

}

class Addition{
	private double num1,num2;
	Addition(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	double addition()
	{
		return this.num1+this.num2;
	}
}

class Subtraction{
	private double num1,num2;
	Subtraction(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	double subtraction()
	{
		return this.num1-this.num2;
	}
}

class Multiplication{
	private double num1,num2;
	Multiplication(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	double multiplication()
	{
		return this.num1*this.num2;
	}
}

class Division{
	private double num1,num2;
	Division(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	double division()
	{
		return this.num1/this.num2;
	}
}