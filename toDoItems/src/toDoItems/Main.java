package toDoItems.src.toDoItems;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		var reader = new ToDoItemReader();
//		reader.read();
//
//		var exportType = reader.askForExportType();
//		FileExporter export;
//
//		if(exportType.equals("1")) {
//			export = new ExportAsCSV();
//		} else if (exportType.equals("2")) {
//			export = new ExportAsJSON();
//		} else {
//			return;
//		}
//
//		export.export(reader.getItems());

		var export = new ExportAsJSON();

		var items = new ArrayList<ToDo>();
		items.add(new ToDo("rigo", "bigo", 1));
		items.add(new ToDo("higo", "sigo", 2));
		export.export(items);
	}
}