package Collection;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("sarita");
		System.out.println(sb);
		
		String s="Hello";
		StringBuffer sb1=new StringBuffer(s);
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuilder b=new StringBuilder("city");
		b.append("katraj");
		System.out.println(b);
		
		

	}

}
