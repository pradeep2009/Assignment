package array.com;

import java.util.Arrays;

public class EqualArray {
	
	public static boolean equalArray(int a[],int b[])
	{
		if(a.length!=b.length)
			return false;
		
		Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
            {
                return false;
            }
        }
     return true;
	}

	public static void main(String[] args) {
		int arr1[]= {12, 22 ,32, 42, 52, 62};
		int arr2[]= {52, 22 ,62, 12, 42, 32};
		
		
		if(equalArray(arr1, arr2))
		{
			System.out.println("Both array are equal..");
		}
	   else
		{
			System.out.println("Both array are not equal");
		}
	}

}
