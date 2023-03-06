package SearchingSorting;

public class SearchingSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,6,7,9};
		int key=5,n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(key==arr[i])
			{
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}
