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



        return list;
    }

//--------------------------------------------------------------

    public int[] quickSort(int[] array) {
        int[] list = array;
        // implement here

        qs(list, 0, list.length - 1);

        return list;
    }

    static void qs(int[] ar, int l, int r) {

        if (l >= r) {
            return;
        } else {
//			int pivot = ar[(l+r)/2];
            int pivot = ar[r];
            int mid = partition(ar, l, r, pivot);
            qs(ar, l, mid - 1);
            qs(ar, mid, r);
        }
    }

    static int partition(int[] a, int left, int right, int pivot) {
        int lft = left;
        int rft = right-1;

        while (lft <= rft) {
            while (a[lft] < pivot) {
                lft++;
            }

            while (rft>= 0 && a[rft] > pivot) {
                rft--;
            }
            if (lft <= rft) {
                int temp = a[lft];
                a[lft] = a[rft];
                a[rft] = temp;

                lft++;
                rft--;
            }
        }


        int temp = a[lft];
        a[lft] = a[right];
        a[right] = temp;
        return lft;
    }



//------------------------------------------

    
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
