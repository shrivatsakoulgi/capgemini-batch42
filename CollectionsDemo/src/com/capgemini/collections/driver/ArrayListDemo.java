package com.capgemini.collections.driver;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		//Create
		iList.add(60);
		iList.add(20);
		iList.add(10);
		iList.add(40);
		System.out.println(iList);
		iList.add(2, 100);
		System.out.println(iList);		
		//Read
		System.out.println("2nd element:"+iList.get(1));
		//System.out.println("2nd element:"+iList.get(10));
		for(Integer i:iList){
			System.out.print(i+" ");
		}

		System.out.println();
		for(int i=0;i<iList.size();i++){
			System.out.print(iList.get(i)+" ");
		}	
		//Update
		
		iList.set(2, 150);
		System.out.println("\nAfter Update:"+iList);
		
		//Delete
		iList.remove(3);
		System.out.println("After Delete:"+iList);
		
		//Sort
		iList.sort(null);
		System.out.println("After Sort:"+iList);
		
		//Delete All
		//iList.clear();
		//System.out.println(iList);

	}

}
