package datastructure;
import java.util.*;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> learn = new ArrayList<String>();
		learn.add("HTML");
		learn.add("CSS");
		learn.add("JAVA");
		learn.add("SQL");
		learn.add("SELENIUM");

		List<String> tools = new ArrayList<String>();
		tools.add("JIRA");
		tools.add("JENKINS");
		tools.add("MAVAN");
		tools.add("JMETER");
		tools.add("POSTMAN");

		Map<String, List<String>> jobs = new HashMap<String, List<String>>();
		jobs.put("AUTOMATION JOB",learn);
		jobs.put("AUTOMATION TOOLS",tools);

		System.out.println("Printing DATA");
		for(Map.Entry<String,List<String>> printMenu: jobs.entrySet()){
			System.out.println(printMenu.getKey()+" ---> "+printMenu.getValue());
		}
		
		System.out.println("Printing DATA using Iterator");
		Iterator<Map.Entry<String,List<String>>> it = jobs.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,List<String>> pair = it.next();
			System.out.println(pair.getKey()+" --> "+pair.getValue());
		}
	}

}
