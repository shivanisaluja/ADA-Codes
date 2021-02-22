package Sorting;

public class Insertion_Sort {
	public static void insSort(int arr[]) {
	
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=key;
		}
	}
	
	
	
	
	
	
	
	
		public static void main(String[] args) {
		int [] arr= {15 , 10 , 8 , 5 , 22 ,18};
		System.out.println("Before Sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		insSort(arr);
		System.out.println("After Sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
