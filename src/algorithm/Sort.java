package algorithm;

import java.util.ArrayList;

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
            int temp = list[i];
            int j = i-1;
            while(j>=0 && list[j]>temp) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
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

        for(int i =0; i<list.length-1; i++) {
            for(int j = 0; j<list.length-1; j++) {
                while(list[j]>list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }

        }
        
        return list;
    }
    
//      ----------------------------------------------------------------
    static int [] temp;

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here

        temp = new int[list.length];
        ms(list, 0, list.length-1);

        return list;
    }

    static void ms(int[] ar, int s, int e){

        if(s!=e){

            int m = s+(e-s)/2;
            ms(ar, s, m);
            ms(ar, m+1, e);

            sort(temp, ar, s, m, e);
        }
    }

    static void sort(int [] t, int [] a, int s, int m , int  l ) {
        for( int i =0 ; i<=l; i++) {
            t[i] = a[i];
        }



        int p1 = s;
        int p2 = m + 1;
        int ic = s;

        while (p1 <= m && p2 <= l) {
            if (t[p1] >= t[p2]) {
                a[ic] = t[p2];
                p2++;
            } else {
                a[ic] = t[p1];
                p1++;

            }

            ic++;
        }

        while (p1 <= m) {
            a[ic] = t[p1];
            ic++;
            p1++;

        }




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
        
        int n = list.length;

        for (int i = n/2-1; i>=0; i--){

            heapify(list, n, i);
        }

        for(int i = n-1; i>=0; i--) {
            int temp = list[0];
            list[0]= list[i];
            list[i] = temp;

            heapify(list, i, 0);
        }

        return list;
    }

    static void heapify(int [] arr, int n, int i) {
        int root = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l < n && arr[l]>arr[root]) {
            root = l;
        }

        if(r < n && arr[r] > arr[root]) {
            root = r;
        }
        if(root != i) {
            int temp = arr[i];
            arr[i] = arr[root];
            arr[root] = temp;

            heapify(arr, n, root);
        }
    }

//    ---------------------------------------------------
    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        int size = list.length;

        //Creating the Bucket
        buckets [] b = new buckets[10];
        for(int i = 0; i<b.length;i++){
            b[i] = new buckets();
        }

        for (int n: list){
            int bi = (n*10)/(Numbers.numrange+1);
            b[bi].bkt.add(n);
        }


        int index = 0;
        for (buckets n : b) {
            BIS(n.bkt);

            for(int num: n.bkt) {
                list[index] = num;
                index++;
            }
        }


        return list;
    }


    public static void BIS(ArrayList<Integer> array) {

        for (int i = 1; i < array.size(); i++) {
            int temp = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j) > temp) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j + 1, temp);
        }

    }


//    -----------------------------------------
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here

        int n = list.length;

        for (int g = n / 2; g > 0; g /= 2) {
            for (int i = g; i < n; i++) {
                int temp = list[i];

                int j;
                for(j=i; j>=g && list[j-g]>temp;j-=g ) {
                    list[j] = list[j-g];
                }
                list[j] = temp;
            }
        }

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}


// bucket Helper class

class buckets{
    ArrayList<Integer> bkt = new ArrayList<Integer>();
}