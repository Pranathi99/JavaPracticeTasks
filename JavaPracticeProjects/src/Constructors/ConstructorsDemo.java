package Constructors;

public class ConstructorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(1,"Alex","CSE");  //parameterized constructor 
		System.out.println(st);
		Default df=new Default();  //default constructor
		df.fun1();
		Sample sm=new Sample();
	}

}

class Default{
	void fun1() {
		System.out.println("Inside fun1");
	}
}

class Sample{
	Sample()
	{
		System.out.println("Empty constructor");
	}
}

class Student{
	private int id;
	private String name;
	private String dept;

	Student(int id,String name,String dept){   //Parameterized Constructor
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" | "+name+" | "+dept;
	}
}