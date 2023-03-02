package InnerClasses;

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.NonStaticInnerClass nsic=new OuterClass().new NonStaticInnerClass();
		nsic.fun1();
		OuterClass.StaticInnerClass sic=new OuterClass.StaticInnerClass();
		sic.fun1();
		OuterClass.StaticInnerClass.fun2();
		OuterClass.NonStaticInnerClass.fun2();
	}

}


class OuterClass{
	
	static class StaticInnerClass{
		void fun1() {
			System.out.println("Inside fun1 of static inner class");
		}
		
		static void fun2()
		{
			System.out.println("Inside static fun2 of static inner class");
		}
	}
	
	class NonStaticInnerClass{
		void fun1() {
			System.out.println("Inside fun1 of non static inner class");
		}
		
		static void fun2() {
			System.out.println("Inside static fun2 of non static inner class");
		}
	}
}