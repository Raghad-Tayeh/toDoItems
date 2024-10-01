package toDoItems;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class ExportAsJSON implements FileExporter {

	public void export(ToDo toDoItems) {
		
		Gson gson = new Gson();
		
		String output = gson.toJson(toDoItems.toDoItems);
		
		try(FileWriter writer = new FileWriter("output.json")) {
			
			writer.write("{\"items\": " + output + "}");
		}
		catch(IOException exception) {
			
			exception.printStackTrace();
		}
	}
}