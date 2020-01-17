package datastructure;

import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		// Declaring and initialize ArrayList
		ArrayList<String> movieArrayList = new ArrayList<String>();

		//Adding values in ArrayList

		movieArrayList.add("Beauty and the Beast");
		movieArrayList.add("Lovelace");
		movieArrayList.add("Dance on the Floor");
		movieArrayList.add("IronMAn");
		movieArrayList.add("Mr Bean");

		//Displaying the available movies

		//for(int i = 0; i <=5; i++){
		//	System.out.println("List of movies:");
		//	System.out.println( movieArrayList.get(i));
		//}




		//remove data from arrayList

        if(movieArrayList.size()>4) {
			movieArrayList.remove(4);
			System.out.println("one Element was removed");
		}


		//Displaying available movies using for each loop

		System.out.println("List of the available movies");
		movieArrayList.forEach((m) -> System.out.println("Available :" + m));




		/*
		* public class sortloc {

			public static void main(String[] args) {
				System.out.println("Manoprabu.R");
				ArrayList<String> name = new ArrayList<String>();
				ArrayList<String> location = new ArrayList<String>();
				HashMap<String,String> myMap = new HashMap<>();


				Scanner sc = new Scanner(System.in);
				while (true) {
					System.out.println("Please enter your Name: ");
					name.add(sc.next());
					System.out.println("Please enter your Location: ");
					location.add(sc.next());
					myMap.put(name.get(0),location.get(0));
					name.clear();
					location.clear();
					System.out.println(myMap);
				}
			}
		}
		*/


	}

}
