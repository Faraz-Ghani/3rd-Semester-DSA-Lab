package lab6;

public class task2 {
	static int temp;
	public static void main(String[] args) {
		int[][] arr2D = {{2,10,15},{5,1,3},{6,9,4}};
		int[] arr = Convert(arr2D);
		int[][] ai,ab,as,aq;
		ai=Backto2D(InsertionSort1D(arr),3,3);
		aq=Backto2D(QuickSort1D(arr,0,arr.length-1),3,3);
		as=Backto2D(SelectionSort1D(arr),3,3);
		ab=Backto2D(BubbleSort1D(arr),3,3);
		
		System.out.println("Insertion sorting");
		print(ai);
		System.out.println("Quick sorting");
		print(aq);
		System.out.println("Selection sorting");
		print(as);
		System.out.println("Bubble sorting");
		print(ab);
		
	
	}
	public static int[] InsertionSort1D(int[] heightis) {
		
		  for(int i=0;i<heightis.length;++i){

		        int j = i;
		        
		        while(j > 0 && heightis[j-1]>heightis[j]){

		          int key = heightis[j];
		          heightis[j] = heightis[j-1];
		          heightis[j-1] = key;
		          j = j-1; 

		        }
		      }
		  
		  return heightis;
		  }

	 public static int[] QuickSort1D(int[] heightqs, int low, int high) {
		    if (low < high) {
		      int pivotIndex = partition(heightqs, low, high);
		      QuickSort1D(heightqs, low, pivotIndex - 1);
		      QuickSort1D(heightqs, pivotIndex + 1, high);
		    }
		    
			 return heightqs;
		  }
	 public static int partition(int[] heightqs, int low, int high) {
		 
		    int pivot = heightqs[high];
		    int i = low - 1;
		    for (int j = low; j < high; j++) {
		      if (heightqs[j] < pivot) {
		        i++;
		        int temp = heightqs[i];
			    heightqs[j] = heightqs[i];
			    heightqs[i] = temp;
			 
		      }
		    }
		    int temp = heightqs[i+1];
		    heightqs[i+1] = heightqs[high];
		    heightqs[high] = temp;
		    return i + 1;
		  }

		
	public static int[] SelectionSort1D(int[] Height) {
			
		for (int i=0;i<Height.length-2;i++) {
				int minIndex=i;
				for (int j=i+1;j<Height.length;j++)
				if(Height[j]<Height[minIndex])
					minIndex=j;
					temp=Height[i];
					Height[i]=Height[minIndex];
					Height[minIndex]=temp;
	}
		return Height;
	}
	public static int[] BubbleSort1D(int[] Height) {
		
		for (int i=0; i<Height.length-1;i++) {
			for (int j=0 ;j<Height.length-1-i;j++){

				if(Height[j]>Height[j+1])
				{	temp=Height[j+1];
				Height[j+1]=Height[j];
						Height[j]=temp;
				}	
			}			
		}
		return Height;
		}//bubble sort over
	
	public static void print(int[][] arr2D) {

for (int i = 0; i < arr2D.length; i++) {System.out.print("{");
    for (int j = 0; j < arr2D[i].length; j++) {
        System.out.print(arr2D[i][j] + " ");
    }

    System.out.println("}");}

	}
	
	
public static int[] Convert(int[][] arr ) {
int rows = arr.length;
int cols = arr[0].length;
int[] flatArr = new int[rows * cols];
int k = 0;
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        flatArr[k++] = arr[i][j];
    }
}
return flatArr;
}

public static int[][] Backto2D(int[] arr,int col,int rows){
	int[][] arr2D = new int[rows][col];
	int count = 0;
	for(int i =0 ;i <rows ;i++) {
		for(int j =0 ;j <col;j++) {
			arr2D[i][j]=arr[count];
			count++;
		}
	}
	return arr2D;
}
}
