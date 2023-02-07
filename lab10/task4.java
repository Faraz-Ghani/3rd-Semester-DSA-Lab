package lab10;

public class task4 {

	public static void main(String[] args) {
		int[] arr = {3,2,1,4,5,6,7};
		binarySearch(arr,0,arr.length-1,7);
		
	}
	public static int binarySearch(int arr[], int head, int tail, int val){  
        if (tail>=head){  
            int mid = head + (tail - head)/2;  
            if (arr[mid] == val){ 
            	System.out.println("Element found at "+mid);
            return mid;  
            }  
            if (arr[mid] > val){  
            return binarySearch(arr, head, mid-1, val);
            }
            else{  
            return binarySearch(arr, mid+1, tail, val);
            }  
        }  
        System.out.println("Element not Found!");
        return -1;  
    }  
}
