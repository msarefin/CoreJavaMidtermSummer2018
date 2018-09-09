package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

//    --------------------------------------------------------
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        for(int i = 1; i<list.length; i ++){
            for(int j = i-1; j<i;j--){
                if(list[j]>list[i]){
                    int temp = list[j];
                    list[j] = list[i];
                    list[i]= temp;

                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

//    ------------------------------------------------------------

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here

        int temp = 0;

        for(int i = 0; i<list.length; i++){
            for(int j = 0; j<list.length-1; j++){
                if(list[j]>list[j+1]){
                    temp= list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        
        return list;
    }
    
//      ----------------------------------------------------------------
    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        if(list.length>1){
            int mid = list.length/2;
            int [] left =new int[mid];
            int [] right = new int[list.length-mid];

            for(int i = 0; i<mid; i++){
                left[i]= list[i]
            };

            for(int i = mid+1; i<list.length; i++){
                right [i-mid] = list[i];
            }

            mergeSort(left);
            mergeSort(right);

            for(int i = 0; i<)

        }

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
