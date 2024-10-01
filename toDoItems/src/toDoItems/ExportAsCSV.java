package toDoItems;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportAsCSV implements FileExporter {

	public void export(ToDo toDoItems) {
		
		try(CSVWriter writer = new CSVWriter(new FileWriter("output.csv"))) {
			
			writer.writeNext(new String[] {"ID", "Title", "Description"});
			writer.writeAll(toDoItems.toDoItems);
		}
		
		catch(IOException exception) {
			
			exception.printStackTrace();
		}
	}
}
