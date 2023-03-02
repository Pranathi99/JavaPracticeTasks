package AccessModifiers;

import TypeConversions.TypeConversionsDemo;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateClass pc=new PrivateClass();
		pc.fun1();
		//System.out.println(sm.a);    ---error, variable a not visible , only accessible within class
		DefaultClass dc=new DefaultClass();
		dc.fun1();
		System.out.println(dc.a);      // default can be accessed within class and in same package
		//AccessModifiersDemo ac=new AccessModifiersDemo();
		//System.out.println(ac.x);  ---------gives compile time error, when accessed in other package
		PublicClass puc=new PublicClass();
		puc.fun1();
		System.out.println(puc.a);
		ProtectedClass prc=new ProtectedClass();
		prc.fun1();
		System.out.println(prc.a);
	}
	//public int x=50;  // AccessModifiersDemo ac=new AccessModifiersDemo();
					  //System.out.println(ac.x);   --- public is accessible outside package also
	
	//protected int x=60;  //TypeConversionsDemo tc=new TypeConversionsDemo();
							//System.out.println(tc.x);   ----protected is accessible in other package only by extending this class
 
}

class PrivateClass{
	private int a=10;
	void fun1()
	{
		System.out.println("Private->"+a);  // private variable accessed from within same class
	}
}

class DefaultClass{
	int a=20;
	void fun1() {
		System.out.println("Default->"+a);
	}
}

class PublicClass{
	public int a=30;
	void fun1() {
		System.out.println("Public->"+a);
	}
}

class ProtectedClass{
	protected int a=40;
	void fun1() {
		System.out.println("Protected->"+a);
	}
}
