/**
 * 
 */
/**
 * 
 */
module toDoItems {
    requires gson;
    requires com.opencsv;
    requires java.sql;
    exports toDoItems.src.toDoItems;
    opens toDoItems.src.toDoItems;
}