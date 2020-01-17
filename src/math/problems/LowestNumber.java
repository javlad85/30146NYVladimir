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


		int arrayLowestNumbers[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};



		int minVal = Integer.MIN_VALUE;

		//find lowest number from the array

		for (int numbers:arrayLowestNumbers)
			System.out.print(numbers+" ");

		for(int i = 0; i < arrayLowestNumbers.length; i++){
			if(arrayLowestNumbers[i] > minVal)
				minVal = arrayLowestNumbers[i];
		}
		System.out.print("\nLowest value = "+minVal);
	}



		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<Integer> lowestValue = new ArrayList<Integer>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(arrayLowestNumbers, "tbl_lowestNumber", "lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("data_lowestNumber", "lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
	}


