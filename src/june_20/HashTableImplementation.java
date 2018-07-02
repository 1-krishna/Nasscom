package june_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableImplementation {

	public static void main(String[] args) throws IOException {

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		ht.put("Krishna", 96);
		ht.put("Mradul", 68);
		ht.put("Prince", 20);
		ht.put("Malik", 22);

		System.out.println("The Players Names are");

		Enumeration e = ht.keys();

		while (e.hasMoreElements())
			System.out.println(e.nextElement());

		// Working similarly as above

		/*
		 * for(String s : ht.keySet()){ System.out.println(s); }
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player name");

		String name = br.readLine();
		name = name.trim();

		Integer score = ht.get(name);

		if (score != null) {
			int scor = score.intValue();
			System.out.println("Score for " + name.toString() + " is " + scor);
		} else {
			System.out.println("Player not found");
		}

	}

}
