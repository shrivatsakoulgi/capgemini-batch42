
public class ArraysDemo {

	public static void main(String[] args) {
		
		int []array1 = new int [10];
		int []array2={10,20,30,40};

		for(int i=0;i<array1.length;i++){
			array1[i]=i;
		}
		for(int a:array1){
			System.out.print(a+" ");
		}
		System.out.println();
		
		float [] fArray = {3.2f,3.4f,5.6f,7.89f,9.87f};
		
		for(float f:fArray){
			System.out.print(f+" ");
		}
				
	}
}

// Read size of array, declare the array with that size, 
//read n numbers n print their squares.