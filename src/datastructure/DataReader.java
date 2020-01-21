package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */


		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";



		String data = "";
		try {

			fileReader = new FileReader(textFile);
			bufferedReader = new BufferedReader(fileReader);

			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println(" Invalid file name please enter a valid File name");
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IO error");
		} finally {
			bufferedReader.close();
			fileReader.close();

		}
		String[] myData = data.split("\\w+");
		Stack<String> mystack = new Stack<>();
		for (String s : myData) {
			mystack.push(s);
		}
		for (String s : myData) {
			System.out.println(s);
		}


	}

}