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
		selectionSort();
		bubbleSort();
		insertionSort();
		int arr[]= {53,86,2,35,11,13};
		quickSort(arr,0,arr.length-1);
		for(int z:arr)
			System.out.print(z+" ");
		System.out.println();
		int arr1[]= {53,86,2,35,11,13};
		mergeSort(arr1,0,arr1.length-1);
		for(int z:arr1)
			System.out.print(z+" ");
		System.out.println();
	}

	private static void mergeSort(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		if(l<h)
		{
			int mid=l+(h-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}

	private static void merge(int[] arr, int l, int mid, int h) {
		// TODO Auto-generated method stub
		int n1=mid-l+1;
		int n2=h-mid;
		int i=0,j=0,k=l;
		int lt[]=new int[n1];
		int rt[]=new int[n2];
		for(i=0;i<n1;i++)
			lt[i]=arr[l+i];
		for(j=0;j<n2;j++)
			rt[j]=arr[mid+1+j];
		i=0;j=0;
		while(i<n1 && j<n2)
		{
			if(lt[i]<=rt[j])
			{
				arr[k++]=lt[i++];
			}
			else
			{
				arr[k++]=rt[j++];
			}
		}
		while(i<n1)
		{
			arr[k++]=lt[i++];
		}
		while(j<n2)
		{
			arr[k++]=rt[j++];
		}
	}

	private static void quickSort(int[]arr,int l,int h) {
		if(l<h)
		{
			int pi=partition(arr,l,h);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,h);
		}
	}

	private static int partition(int[] arr, int l, int h) {
		int pivot=arr[h];
		int i=l-1,j;
		for(j=l;j<h;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		return i+1;
	}

	private static void insertionSort() {
		int arr[]= {34,5,53,23,56,12};
		int i,j,n=arr.length;
		for(i=1;i<n;i++)
		{
			int key=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
	}

	private static void bubbleSort() {
		int arr[]= {34,5,53,23,56,12};
		int i,j,n=arr.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
	}

	private static void selectionSort() {
		// TODO Auto-generated method stub
		int arr[]= {34,6,86,1,23};
		int i,j,n=arr.length,minInd=0;
		for(i=0;i<n;i++)
		{
			minInd=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minInd])
					minInd=j;
			}
			int temp=arr[minInd];
			arr[minInd]=arr[i];
			arr[i]=temp;
		}
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
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
