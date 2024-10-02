package toDoItems.src.toDoItems;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoItemReader {
    ArrayList<ToDo> items = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void read() {
        System.out.println("Please enter toDo item\s:-");
        var flag = true;
        var counter = 1;

        while (flag) {
            ToDo todo = new ToDo();
            todo.setID(counter);

            System.out.print("Enter item title (enter (0) when done): ");
            todo.setTitle(input.nextLine());

            if (todo.getTitle().equals("0")) {
                flag = false;
                break;
            }

            System.out.print("Enter item description: ");
            todo.setDescription(input.nextLine());

            items.add(todo);
            counter++;
        }
    }

    public String askForExportType() {
        System.out.print("Enter export type (1 for csv, 2 for json, 0 to exit): ");

        return input.nextLine();
    }

    public ArrayList<ToDo> getItems() {
        return items;
    }
}
