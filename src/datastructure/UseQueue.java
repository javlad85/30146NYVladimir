package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		//Create queue (Declaring and initialize)
		LinkedList<Integer> StudentID = new LinkedList();


		//Adding values to the Queue
		StudentID.add(1001);
		StudentID.add(1002);
		StudentID.add(1003);
		StudentID.add(1005);
		StudentID.add(1006);
		StudentID.add(1007);
		StudentID.add(1008);
		StudentID.add(1009);
		StudentID.add(1010);
		StudentID.add(1011);


		//Get the first element in the Queue
		System.out.println(StudentID.getFirst());
		System.out.println("This student finished the session ");

		// Method to control the number of student in the queue
		if(StudentID.size()<10){
			System.out.println("We need more student");
		}else{
			System.out.println(StudentID.poll());
			StudentID.remove(1);
			System.out.println("StudentID:" +StudentID.get(1) +"was removed");
		}


		Iterator it = StudentID.iterator();
		System.out.println("List of Actual session Student");
			while (it.hasNext()){
				System.out.println(it.next());
			}




		/*//Retrieving the values of the queue			f
		for (:StudentID
			 ) {*/





	}

}
