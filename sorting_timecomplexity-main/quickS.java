import java.util.*;


class QuickSort { 
   
	static int count;
    int partition(int intArray[], int low, int high) { 
    	 
        int pi = intArray[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) { 
            
            if (intArray[j] <= pi) { 
                i++; 
              
                int temp = intArray[i]; 
                intArray[i] = intArray[j]; 
                intArray[j] = temp; 
            } 
            
            
        } 
   
       
        int temp = intArray[i+1]; 
        intArray[i+1] = intArray[high]; 
        intArray[high] = temp; 
   
        return i+1; 
    } 
   
   
  
    void quick_sort(int intArray[], int low, int high) { 
        if (low < high) { 
           
            int pi = partition(intArray, low, high); 
            quick_sort(intArray, low, pi-1); 
            quick_sort(intArray, pi+1, high); 
        } 
        
        count++;
    } 
}
 
class quickS{
    public static void main(String args[]) {
        
        
        int[] randomNumbers = new int[1000];
        int[] ascendingOrderNumbers = new int[1000];
        int[] descendingOrderNumbers = new int[1000];
        
        
        int[] sameNumbers = new int[1000];
        
        
        //initializing part---->
        
        
        for (int i = 0; i < 1000; i++){
                    int randomNumber = (int)(Math.random()*10000);
                    randomNumbers[i] = randomNumber;
        }
        
        for (int i = 0; i < 1000; i++){
                    ascendingOrderNumbers[i] = i;
        }
        
        for (int i = 1000; i > 0; i--){
                    descendingOrderNumbers[1000 - i] = i;
        }
        
        for (int i = 0; i < 1000; i++){
            sameNumbers[i] = 8;
        }
        
        //for(int z=0;z<15;z++) {
       
        	QuickSort obj = new QuickSort(); 
            
            long startRandom = System.nanoTime();
            //Merge Sort for Random Numbers
            obj.quick_sort(randomNumbers, 0, randomNumbers.length-1); 
                    long endRandom = System.nanoTime();
                    long timeRandom = endRandom - startRandom;
   System.out.println("\n\nTime for merge Sort for Random Numbers : " +timeRandom+" count:"+QuickSort.count);
   
   QuickSort.count=0;
                    
                    
                    
                    
            //Time Calculation for Ascending Numbers
            long startAscending = System.nanoTime();
            
            //Merge Sort for Ascending Numbers
            obj.quick_sort(ascendingOrderNumbers, 0, ascendingOrderNumbers.length-1); 
                    long endAscending = System.nanoTime();
                    long timeAscending = endAscending - startAscending;
                    
  System.out.println("Time for merge Sort for Ascending Numbers : " +timeAscending+" count:"+QuickSort.count);                
  QuickSort.count=0;
         
                    
            //Time Calculation for Descending Numbers
            long startDescending = System.nanoTime();
            //Merge Sort for Descending Numbers
            obj.quick_sort(descendingOrderNumbers,0,descendingOrderNumbers.length-1);
                    long endDescending = System.nanoTime();
                    long timeDescending = endDescending - startDescending;
                    System.out.println("Time for merge Sort for Descending Numbers : " +timeDescending+" count:"+QuickSort.count);               
                    QuickSort.count=0;
 
                    
                    
                    
                  //Time Calculation for sme Numbers
                    long start = System.nanoTime();
                    //Merge Sort for Ascending Numbers
                    obj.quick_sort(sameNumbers,0,sameNumbers.length-1);
                            long end = System.nanoTime();
                            long time = end - start;
                    
       System.out.println("Time for merge Sort for sme Numbers : " +time+" count:"+QuickSort.count);             
                    
                    
                            System.out.println("\nSorted Array: " + Arrays.toString(randomNumbers)); 
                            System.out.println("\nSorted Array: " + Arrays.toString(ascendingOrderNumbers)); 
                            System.out.println("\nSorted Array: " + Arrays.toString(descendingOrderNumbers)); 
         
    
        
        
        //}    
        
        
        
        
}
    
}