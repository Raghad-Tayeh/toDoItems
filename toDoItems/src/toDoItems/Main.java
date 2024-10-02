package toDoItems;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<ToDo> items = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		enterInfo(); 
		String exportFileType = todo.exportType(); 
		FileExporter export;
		
		if(exportFileType.equals("1")) {
			
			export = new ExportAsCSV(); 
			export.export(todo);
		}
		
		else {
			
			export = new ExportAsJSON();
			export.export(todo);
		}
	}
	
	public static void enterInfo() {

		System.out.println("Please enter toDo item\s:-");

		while (ToDo.flag) {

			System.out.print("Enter item title (enter (0) when done): ");
			ToDo.title = input.nextLine();

			if (ToDo.title.equals("0")) {

				ToDo.flag = false;
				break;
			}

			System.out.print("Enter item description: ");
			ToDo.description = input.nextLine();
			
			toDoItems.add(new String[] {String.valueOf(ToDo.counter), ToDo.title, ToDo.description});
			
			ToDo.counter++;
		}
	}
}