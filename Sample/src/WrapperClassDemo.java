
public class WrapperClassDemo {

	public static void main(String[] args) {
		Byte bObj = 12;
		Short sObj = 100;
		Integer iObj = 10;
		Long lObj = 1234124L;
		
		Float fObj = 3.2f;
		Double dObj = 2.3445;
		Boolean boolObj = false;
		Character chObj = 'a';
		
		int i=100;
		Integer obj=i;	// Boxing
		
		
		System.out.println("Integer Object:"+iObj);
		iObj = iObj+1;
		int j=iObj;		// Unboxing
		System.out.println("Integer Object:"+iObj);
	}

}
