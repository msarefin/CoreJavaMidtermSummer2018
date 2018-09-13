package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */
static int numrange =100;
	public static void main(String[] args) throws Exception {
		
		int [] num = new int[numrange];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();

		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);
		//Insertion Sort
//		algo.insertionSort(num);
//		long insertionSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm....


		algo.insertionSort(num);
		long InsertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Insertion Sort take: " + InsertionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Insertion_sort", "SortingNumbers");
        numbers = connectToSqlDB.readDataBase("Insertion_sort", "SortingNumbers");
        printValue(numbers);
        n = num.length;
        randomize (num, n);

        algo.bubbleSort(num);
        long BubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+num.length+" numbers in Bubble Sort take: "+BubbleSortExecutionTime+" mili sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Bubble_sort", "SortingNumbers");
        numbers = connectToSqlDB.readDataBase("Bubble_sort", "SortingNumbers");
        printValue(numbers);
        n = num.length;
        randomize (num, n);

		algo.mergeSort(num);
        long MergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Merge Sort take: " + MergeSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Merge_sort", "SortingNumbers");
        numbers = connectToSqlDB.readDataBase("Merge_sort", "SortingNumbers");
        printValue(numbers);
        n = num.length;
        randomize (num, n);

        algo.quickSort(num);
        long QuickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Quick Sort take: " + QuickSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Quick_sort", "SortingNumbers");
        numbers = connectToSqlDB.readDataBase("Quick_sort", "SortingNumbers");
        printValue(numbers);
        n = num.length;
        randomize (num, n);


        algo.heapSort(num);
        long HeapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Heap Sort take: " + HeapSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Heap_sort", "SortingNumbers");
        numbers = connectToSqlDB.readDataBase("Heap_sort", "SortingNumbers");
        printValue(numbers);
        n = num.length;
        randomize (num, n);

        algo.bucketSort(num);
        long BucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Bucket Sort take: " + BucketSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Bucket_sort", "SortingNumbers");
        numbers = connectToSqlDB.readDataBase("Bucket_sort", "SortingNumbers");
        printValue(numbers);
        n = num.length;
        randomize (num, n);

        algo.shellSort(num);
        long ShellSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of "+ num.length + " numbers in Shell Sort take: " + ShellSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Shell_sort", "SortingNumbers");
        numbers = connectToSqlDB.readDataBase("Shell_sort", "SortingNumbers");
        printValue(numbers);
        n = num.length;
        randomize (num, n);


        //Come to conclusion about which Sorting Algo is better in given data set.

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(numrange);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
