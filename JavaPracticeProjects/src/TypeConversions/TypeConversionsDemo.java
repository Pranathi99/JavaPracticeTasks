package TypeConversions;

public class TypeConversionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("int->"+a);
		double b=15.03;
		System.out.println("double->"+b);
		char c='A';
		System.out.println("char->"+c);
		boolean d=true;
		System.out.println("boolean->"+d);
		byte e=127;
		System.out.println("byte->"+e);
		float x=13.56f;
		System.out.println("float->"+x);
		
		a=(int) b;
		System.out.println("double to int->"+a);
		a=(int)c;
		System.out.println("char to int->"+a);
		a=(int)e;
		System.out.println("byte to int->"+e);
		a=(int)x;
		System.out.println("float to int->"+a);
		
		System.out.println("--------------------------------------");
		
		b=a;
		System.out.println("int to double->"+b);
		b=c;
		System.out.println("char to double->"+b);
		b=e;
		System.out.println("byte to double->"+b);
		b=x;
		System.out.println("float to double->"+b);
		
		System.out.println("--------------------------------------");
		
		c=(char) a;
		System.out.println("int to char->"+c);
		c=(char)b;
		System.out.println("double to char->"+c);
		c=(char) e;
		System.out.println("byte to char->"+c);
		c=(char) x;
		System.out.println("float to char->"+c);
		
		System.out.println("--------------------------------------");
		
		e=(byte) a;
		System.out.println("int to byte->"+e);
		e=(byte)b;
		System.out.println("double to byte->"+e);
		e=(byte)c;
		System.out.println("char to byte->"+e);
		e=(byte)x;
		System.out.println("float to byte->"+e);
		
		System.out.println("--------------------------------------");
		
		x=a;
		System.out.println("int to float->"+x);
		x=(float) b;
		System.out.println("double to float->"+x);
		x=c;
		System.out.println("char to float->"+x);
		x=e;
		System.out.println("byte to float->"+x);
	}

}
