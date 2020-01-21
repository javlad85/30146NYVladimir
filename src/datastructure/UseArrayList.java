package datastructure;

import javax.xml.transform.sax.SAXSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws SQLException {
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

		System.out.println("Use White loop With Iterator print all the elements of an ArrayList");
		Iterator iterator =movieArrayList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		String url = "jdbc:mysql://localhost:3306/pnt?serverTimezone=UTC";
		String user = "root";
		String password = "Password1";
		Statement statement=null;
		Connection connection=null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			String query = "insert into movieArrayList (id,name) values (8,'Billy');";
			statement.execute(query);

		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(" Check connection");
		}
		finally {

			statement.close();
			connection.close();
		}
	}
}
