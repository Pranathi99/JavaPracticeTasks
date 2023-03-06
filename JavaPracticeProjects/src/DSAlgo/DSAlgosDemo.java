package DSAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DSAlgosDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ROTATE ARRAY RIGHT BY 5 TIMES*/
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int i,n=arr.length,k=5;
		rightRotate(arr,0,n,k);
		for(int x:arr)
			System.out.print(x+" ");
		/*FOURTH SMALLEST ELEMENT IN UNSORTED ARRAY*/
		int arr1[]= {2,4,1,46,32,86,-29};
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		for(int x:arr1)
			pq.add(x);
		for(i=0;i<3;i++)
			pq.poll();
		System.out.println(pq.peek());
		/*MULTIPLY TWO MATRICES*/
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr3[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int j;
		int res[][]= {{0,0,0},{0,0,0},{0,0,0}};
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
					res[i][j]+=arr2[i][k]*arr3[k][j];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(res[i][j]+" ");
			System.out.println();
		}
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
