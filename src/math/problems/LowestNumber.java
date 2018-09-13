package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         * Write java solution to find the lowest number from this array.
         * Use one of the databases from mysql or mongodb to store and to retrieve.
         */
        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        //find lowest number from the array

        System.out.println(LowestNum(array));

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> lowestValue = new ArrayList<String>();
        lowestValue = LowestNum(array);
        try {
            connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
            lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
        for (String st : lowestValue) {
            System.out.println(st);
        }
    }


   private static List<String> LowestNum(int[] num) {

        int ln = 0;
        List<String> output = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            ln = num[i];
            for(int j = 1; j< num.length;j++){
                if(num[j]<ln){
                    ln = num[j];
                }
            }
        }

       output.add(String.valueOf(ln));

        return output;

    }

}
