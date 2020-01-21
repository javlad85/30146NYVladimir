package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws SQLException {
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


		//Method that limit the value of the Map
		if (StatesCities.size()>5){
			StatesCities.remove(4);
			System.out.println("One record was removed");
		}


		// Retrieving info from map
		StatesCities.forEach((k,v) -> System.out.println("key" + k + ", value:" + v ));

		Iterator<Map.Entry<String, String>> itr = StatesCities.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());


		}

		Connection connection = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
		String user = "root";
		String password = "Password1";

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			String query = "select * from states;";
			statement.execute(query);
			System.out.println(statement.execute(query));


		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("Check your connection");
		} finally {
			statement.close();
			connection.close();
		}
	}
}