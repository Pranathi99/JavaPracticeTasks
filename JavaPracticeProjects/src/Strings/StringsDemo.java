package Strings;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		System.out.println(str.compareToIgnoreCase("Hello World")); //compares lexicographically
		System.out.println(str.equalsIgnoreCase("Hello World")); // compares two strings
		System.out.println(str.repeat(2));
		System.out.println(str.replace('o', 'a'));
		System.out.println("-------------------------------------------------");
		StringBuffer sb=new StringBuffer("Hello World");
		System.out.println(sb.capacity());
		sb.append(" How are you?");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.delete(12,18);
		System.out.println(sb);
		System.out.println(sb.getClass());
		sb.insert(0, "Hey");
		System.out.println(sb);
		System.out.println("--------------------------------------------------------");
		StringBuilder sbd=new StringBuilder("Hello World");
		sbd.append("!!!!");
		System.out.println(sbd);
		System.out.println(sbd.lastIndexOf("Wo"));
		System.out.println(sbd.substring(2, 5));
		
	}

}
