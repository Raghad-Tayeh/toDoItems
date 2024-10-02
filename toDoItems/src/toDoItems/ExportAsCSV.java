package toDoItems.src.toDoItems;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportAsCSV implements FileExporter {

	public void export(ArrayList<ToDo> toDoItems) {
		
		try(CSVWriter writer = new CSVWriter(new FileWriter("output.csv"))) {
			
			writer.writeNext(new String[] {"ID", "Title", "Description"});

			for (ToDo item : toDoItems) {
				writer.writeNext(new String[]{
					String.valueOf(item.getID()),
					item.getTitle(),
					item.getDescription()
				});
			}
		}
		
		catch(IOException exception) {
			
			exception.printStackTrace();
		}
	}
}
