package DSAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DSAlgosDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int i,n=arr.length,k=5;
		rightRotate(arr,0,n,k);
		for(int x:arr)
			System.out.print(x+" ");
	}

	private static void rightRotate(int[] arr, int i, int n, int k) {
		// TODO Auto-generated method stub
		reverseArray(arr,0,n);
		reverseArray(arr,0,n-k);
		reverseArray(arr,n-k,n);
	}

	private static void reverseArray(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int i=l,j=h-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
