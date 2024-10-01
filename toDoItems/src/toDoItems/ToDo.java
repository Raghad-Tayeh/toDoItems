package toDoItems;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

	String title;
	String description;
	int ID;
	int counter = 1;
	boolean flag = true;

	Scanner input = new Scanner(System.in);
	ArrayList<String[]> toDoItems = new ArrayList<>();

	public void enterInfo() {

		System.out.println("Please enter toDo item\s:-");

		while (flag) {

			System.out.print("Enter item title (enter (0) when done): ");
			title = input.nextLine();

			if (title.equals("0")) {

				flag = false;
				break;
			}

			System.out.print("Enter item description: ");
			description = input.nextLine();
			
			toDoItems.add(new String[] {String.valueOf(counter), title, description});
			
			counter++;
		}
	}

	public String exportType() {

		String export;

		System.out.print("Please enter (1) if a CSV output is preferred, or (2) if a JSON output is preferred: ");
		export = input.next();

		return export;
	}
}