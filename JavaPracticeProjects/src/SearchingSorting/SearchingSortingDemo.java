package SearchingSorting;

import java.util.Arrays;

public class SearchingSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = LinearSearch();
		System.out.println("index->"+n);
		int x=BinarySearch();
		System.out.println("index->"+x);
		int y=ExponentialSearch();
		System.out.println("index->"+y);
	}

	private static int ExponentialSearch() {
		int arr[]= {1,3,5,6,7,9};
		int i=1,n=arr.length,key=5;
		if(arr[0]==key)
			return 0;
		while(i<n && arr[i]<=key)
			i*=2;
		return Arrays.binarySearch(arr, i/2,Math.min(i,n-1),key);
	}

	private static int BinarySearch() {
		int arr[]= {1,3,5,6,7,9};
		int n=arr.length;
		int l=0,h=n-1,key=5;
		while(l<=h)
		{
			int mid=l+(h-l)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				h=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}

	private static int LinearSearch() {
		int arr[]= {1,3,5,6,7,9};
		int key=5,n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(key==arr[i])
			{
				System.out.println(i);
				return i;
			}
		}
		System.out.println(-1);
		return -1;
	}

}
