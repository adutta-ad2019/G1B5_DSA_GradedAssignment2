package App;

import Model.Construction;

public class Main {
	public static void main(String[] args) {
		Construction ob=new Construction();
		int arr[]=ob.getfloors();
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]);
		ob.printOrderOfConstruction(arr);
	}
}