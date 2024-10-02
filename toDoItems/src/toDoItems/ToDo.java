package toDoItems.src.toDoItems;

public class ToDo {
	protected String title;
	protected String description;
	protected int ID;

	public ToDo(String title, String description, int ID) {
		this.title = title;
		this.description = description;
		this.ID = ID;
	}

	public ToDo() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
}