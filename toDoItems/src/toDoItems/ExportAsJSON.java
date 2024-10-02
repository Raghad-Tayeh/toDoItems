package toDoItems.src.toDoItems;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.reflect.TypeToken;

public class ExportAsJSON implements FileExporter {

	public void export(ArrayList<ToDo> toDoItems) {
		
		Gson gson = new Gson();
		
		var output = gson.toJson(toDoItems);

		
		try(FileWriter writer = new FileWriter("output.json")) {
			
			writer.write("{\"items\": " + output + "}");
		}
		catch(IOException exception) {
			
			exception.printStackTrace();
		}
	}
}