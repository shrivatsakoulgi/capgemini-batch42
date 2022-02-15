
public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		
		System.out.println(sb1+" "+sb1.hashCode());
		System.out.println(sb2+" "+sb2.hashCode());
		
		sb1.append('s');
		System.out.println(sb1+" "+sb1.hashCode());
		
	}

}
