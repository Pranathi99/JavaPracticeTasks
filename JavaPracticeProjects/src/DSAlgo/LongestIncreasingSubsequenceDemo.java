package DSAlgo;

import java.util.ArrayList;
import java.util.Random;

public class LongestIncreasingSubsequenceDemo {

	public static void main(String[] args) {
		/*LENGTH OF LONGEST INCREASING SUBSEQUENCE*/
		// TODO Auto-generated method stub
		Random rd=new Random();
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			al.add(rd.nextInt(1,100));
		System.out.println(al);
		System.out.println(getLIS(al));
	}

	private static int getLIS(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		int len=0,i,j,n=al.size(),maxLen=1;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=1;
		for(i=n-2;i>=0;i--)
		{
			maxLen=0;
			for(j=i+1;j<n;j++)
			{
                if(al.get(i)<al.get(j))
				maxLen=Math.max(maxLen,arr[j]);
			}
			arr[i]+=maxLen;
		}
        maxLen=0;
        for(int x:arr)
            maxLen=Math.max(maxLen,x);
		return maxLen;
	}

}
