package lab4_5;

public class Task1_LinearSearch {

	public static void main(String[] args) {
		int[] Arr1D= {1,2,3,4,5};
		
int x = linearSearch1D(Arr1D, 3);
if(x!=-1) {
System.out.println("Element found on index "+x);
}
else {
	System.out.println("Element not found");
}

int[][] Arr2D= {{1,2,3},{4,5,6},{7,8,9}};
int[] index = linearSearch2D(Arr2D, 8);
if (index[0] == -1) {
    System.out.println("Element not found in the array");
} else {
    System.out.println("Element found at Index (" + index[0] + ", " + index[1] + ")");
}
	}

	  public static int linearSearch1D(int[] A, int key) {
	        // Search through the A element by element
	        for (int i = 0; i < A.length; i++) {
	            if (A[i] == key) {
return i;
	            }
	        }
	        return -1;//not found
	    }
	  
	  public static int[] linearSearch2D(int[][] A, int key) {
	        // Search through each row
	        for (int i = 0; i < A.length; i++) {
	            // Search through each element of the current row
	            for (int j = 0; j < A[i].length; j++) {
	                // if found return index
	            	if (A[i][j] == key) {
	                    return new int[] {i, j};
	                }
	            }
	        }
	        //if not then return -1 indexs(doesnt exist)
	        return new int[] {-1, -1};
	    }
	  
	  
}