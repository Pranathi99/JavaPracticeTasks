package Methods;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo md=new MethodsDemo();
		md.fun1();
		Sample.fun1();  // static method
	}
	
	void fun1() {
		System.out.println("Inside fun1 of MethodsDemo class");
	}

}

class Sample{
	static void fun1() {
		System.out.println("Inside static fun1 of Sample class");
	}
}