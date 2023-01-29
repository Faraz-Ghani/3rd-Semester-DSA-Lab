package lab4_5;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int[] Arr1D= {1,2,3,4,5};
System.out.println("Found on index : "+binarySearch1D(Arr1D,4));

		int[][] Arr2D= {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println("Found on index : "+Arrays.toString(binarySearch2D(Arr2D,4)));
		
	}
	
	public static int[] binarySearch2D(int[][] arr, int target)
    {
        int row = arr.length;
        int col = arr[0].length;
        int l = 0, h = row * col - 1;
 
        while (l <= h) {
            int mid = l + (h - l) / 2;
 
            int tC = mid % col;
            int tR = mid / col;
            int val = arr[tR][tC];
            if (val == target)
                return new int[] { tR, tC };
 
            if (val < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
 
        return new int[] { -1, -1 };
    }
		

	public static int binarySearch1D(int[] A, int key) {
		int first,end;	
		Arrays.sort(A);
		first=A[0];
		end=A[A.length-1];
		
		while (first <= end) {
	      int mid = (first + end) / 2;
	      if (A[mid] == key) {
	        return mid;
	      } else if (A[mid] < key) {
	        first = mid + 1;
	      } else {
	        end = mid - 1;
	      }
	    }
		//not found
	    return -1;
	  }
}
