package Sorting;

public class Selection_Sort {
	public static void Selectionsort(int[]arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index]) {
				min_index=j;
					
				}
				
			}
			
			int temp=arr[i];
			arr[i]= arr[min_index];
			arr[min_index]=temp;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {20 ,15 ,12 , 10 ,22 , 18};
		System.out.println("Before sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "  ");
			
		}
		System.out.println();
		Selectionsort(arr);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "  ");
			
		}
		
	}

}
