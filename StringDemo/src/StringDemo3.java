
public class StringDemo3 {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2="abcd";
		String s3="efgh";
		String s4 = "aaaa";
		
		System.out.println("s1==s2 "+s1.equals(s2));
		System.out.println("s1==s3 "+s1.equals(s3));
		System.out.println("s1==s4 "+s1.equals(s4));
		
		System.out.println("s1 compareTo s2 "+s1.compareTo(s2));
		System.out.println("s1 compareTo s3 "+s1.compareTo(s3));
		System.out.println("s1 compareTo s4 "+s1.compareTo(s4));
		

	}

}
