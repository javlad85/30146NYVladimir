package datastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		//Create map; Declaring and initialize

		Map <String, String> StatesCities = new HashMap<String, String>();

		//Adding State and cities into the Map
        StatesCities.put("New_york", "Brooklyn");
		StatesCities.put("Georgie", "Albany");
		StatesCities.put("Alaska", "Nome");
		StatesCities.put("California", "Malibu");
		StatesCities.put("Delaware", "Newark");
		StatesCities.put("Hawaii","Honolulu");


		StatesCities.forEach((k, v) -> System.out.println("key" + k + ", value:" + v));


		//Method that loimit the value of the Map
		if (StatesCities.size()>5){
			StatesCities.remove(4);
			System.out.println("One record was removed");
		}


		// Retrieving info from map
		StatesCities.forEach((k,v) -> System.out.println("key" + k + ", value:" + v ));

        //Interaction with user
		/*System.out.println("Enter a State u may know");
		Scanner sc = new Scanner(System.in);
		String state = sc.nextLine();
		System.out.println("your state is :" + state);


		System.out.println("Enter a city related to this state");
		Scanner ct = new Scanner(System.in);
		String city = sc.nextLine();
		System.out.println("your state is :" + city);
        */

		//get and store  the value from the user


		}

	}


