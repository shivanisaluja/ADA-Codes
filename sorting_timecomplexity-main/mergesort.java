
//19csu247

public class mergesort {
    public static void main(String[] args) {
    
    
        int[] randomNumbers = new int[10000];
        int[] ascendingOrderNumbers = new int[10000];
        int[] descendingOrderNumbers = new int[10000];
        
        
        int[] sameNumbers = new int[10000];
        
        
        //initializing part---->
        
        
        for (int i = 0; i < 10000; i++){
                    int randomNumber = (int)(Math.random()*10000);
                    randomNumbers[i] = randomNumber;
        }
        
        for (int i = 0; i < 10000; i++){
                    ascendingOrderNumbers[i] = i;
        }
        
        for (int i = 10000; i > 0; i--){
                    descendingOrderNumbers[10000 - i] = i;
        }
        
        for (int i = 0; i < 10000; i++){
            sameNumbers[i] = 8;
        }
        
        for(int z=0;z<15;z++) {
       
            mergesort mergesort = new mergesort();
            long startRandom = System.nanoTime();
            //Merge Sort for Random Numbers
            mergesort.sort(randomNumbers,0,randomNumbers.length-1);
                    long endRandom = System.nanoTime();
                    long timeRandom = endRandom - startRandom;
                    
                    
                    
                    
            //Time Calculation for Ascending Numbers
            long startAscending = System.nanoTime();
            
            //Merge Sort for Ascending Numbers
            mergesort.sort(ascendingOrderNumbers,0,ascendingOrderNumbers.length-1);
                    long endAscending = System.nanoTime();
                    long timeAscending = endAscending - startAscending;
                    
                    
                    
                    
            //Time Calculation for Descending Numbers
            long startDescending = System.nanoTime();
            //Merge Sort for Descending Numbers
            mergesort.sort(descendingOrderNumbers,0,descendingOrderNumbers.length-1);
                    long endDescending = System.nanoTime();
                    long timeDescending = endDescending - startDescending;
                    
                    
                  //Time Calculation for sme Numbers
                    long start = System.nanoTime();
                    //Merge Sort for Ascending Numbers
                    mergesort.sort(sameNumbers,0,sameNumbers.length-1);
                            long end = System.nanoTime();
                            long time = end - start;
                    
                    
                    
                    
            printArray(randomNumbers);
            printArray(ascendingOrderNumbers);
            printArray(descendingOrderNumbers);
            System.out.println("\n\nTime for merge Sort for Random Numbers : " +timeRandom);
            System.out.println("Time for merge Sort for Ascending Numbers : " +timeAscending);
            System.out.println("Time for merge Sort for Descending Numbers : " +timeDescending);
            System.out.println("Time for merge Sort for sme Numbers : " +time);

    }
    
    }
    
    
    
    void sort(int arr[], int beg, int end) {
        if (beg<end) {
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr , mid+1, end);
            merge(arr, beg, mid, end);
            }
    }

    void merge(int arr[], int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;
        int LeftArray[] = new int [l];
        int RightArray[] = new int [r];
        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];
        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];
        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
            i++;
            }
            else {
                arr[k] = RightArray[j];
                j++;
                }
            k++;
                }
        while (i<l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
            }
        while (j<r) {
            arr[k] = RightArray[j];
            j++;
            k++;
            }
        }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
            System.out.println();
            }
     }

