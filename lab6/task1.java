package lab6;

public class task1 {
	static int temp;
	public static void main(String[] args) {
int[] Height = {180,165,150,170,145};

//creating many arrays for many s
int[] Heightbs=Height;
int[] Heightss=Height;
int[] Heightqs=Height;
int[] Heightis=Height;
System.out.println("Before sorting");
print(Height);

long before1=System.nanoTime();
SelectionSort1D(Heightss);
long after1=System.nanoTime();
System.out.println("Execution time of Selection sort in ms is: "+(after1-before1));

before1=System.nanoTime();
BubbleSort1D(Heightbs);
after1=System.nanoTime();
System.out.println("Execution time of Bubble sort in ms is: "+(after1-before1));

before1=System.nanoTime();
System.out.println("Quick sorting");
QuickSort1D(Heightqs,0,Heightqs.length-1);
print(Heightqs);
after1=System.nanoTime();
System.out.println("Execution time of Quick sort in ms is: "+(after1-before1));
	
before1=System.nanoTime();
InsertionSort1D(Heightis);
after1=System.nanoTime();
System.out.println("Execution time of Insertion sort in ms is: "+(after1-before1));

	}
	
	public static void InsertionSort1D(int[] heightis) {
		  for(int i=0;i<heightis.length;++i){

		        int j = i;
		        
		        while(j > 0 && heightis[j-1]>heightis[j]){

		          int key = heightis[j];
		          heightis[j] = heightis[j-1];
		          heightis[j-1] = key;
		          j = j-1; 

		        }
		      }
		  System.out.println("Insetion sorting");
		  print(heightis);
		  }

	 public static void QuickSort1D(int[] heightqs, int low, int high) {
		    if (low < high) {
		      int pivotIndex = partition(heightqs, low, high);
		      QuickSort1D(heightqs, low, pivotIndex - 1);
		      QuickSort1D(heightqs, pivotIndex + 1, high);
		    }
			 
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

		
	public static void SelectionSort1D(int[] Height) {
		for (int i=0;i<Height.length-2;i++) {
				int minIndex=i;
				for (int j=i+1;j<Height.length;j++)
				if(Height[j]<Height[minIndex])
					minIndex=j;
					temp=Height[i];
					Height[i]=Height[minIndex];
					Height[minIndex]=temp;
	}
		System.out.println("Selection Sort");
		print(Height);
	}
	public static void BubbleSort1D(int[] Height) {
		;
		System.out.println("Bubble sorting");
		for (int i=0; i<Height.length-1;i++) {
			for (int j=0 ;j<Height.length-1-i;j++){

				if(Height[j]>Height[j+1])
				{	temp=Height[j+1];
				Height[j+1]=Height[j];
						Height[j]=temp;
				}	
			}			
		}
		print(Height);}//bubble sort over
	public static void print(int[] Height) {
		System.out.print("{");
		for(int i =0 ;i<Height.length;i++) {
			System.out.print(Height[i]+" ");
		}
		System.out.println("}");
	}

}
