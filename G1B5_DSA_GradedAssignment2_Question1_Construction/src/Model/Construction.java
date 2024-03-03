package Model;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Construction {
	public int[] getfloors() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total no of floors in the building:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the floor size given on day : "+(i+1));
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public void printOrderOfConstruction(int arr[]) {
		System.out.println("The order of construction is as follows:");
		LinkedHashSet<Integer> setOfFloors=new LinkedHashSet<Integer>();
		int lastFloor=arr.length;
		for(int i=0;i<arr.length;i++) {
			setOfFloors.add(arr[i]);
			System.out.println("Day: "+(i+1));
			if(arr[i]==lastFloor) 
				while(setOfFloors.contains(lastFloor)) {
					setOfFloors.remove(lastFloor);
					System.out.print(lastFloor-- +" ");
				}
			System.out.println();
		}
	}
}
