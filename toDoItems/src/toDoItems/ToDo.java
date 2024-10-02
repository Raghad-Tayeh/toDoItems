package toDoItems;

import java.util.Scanner;

public class ToDo {
	
	static String title;
	static String description;
	static int ID;
	static int counter = 1;
	static boolean flag = true;

	Scanner input = new Scanner(System.in);

	public String exportType() {

		String export;

		System.out.print("Please enter (1) if a CSV output is preferred, or (2) if a JSON output is preferred: ");
		export = input.next();

		return export;
	}
}