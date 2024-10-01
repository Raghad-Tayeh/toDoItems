package toDoItems;

public class Main {

	public static void main(String[] args) {
		
		ToDo todo = new ToDo();
		
		todo.enterInfo(); 
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
}