import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    TaskList() {
        this.tasks = new ArrayList<Task>;
    }

    /**
     * To get the number of tasks
     * @return the size of the arraylist in an integer form
     */
    public int getSize(){
        return this.tasks.size();
    }

    /**
     * To delete a certain task
     * @param task to be deleted
     */
    public void delete(Task task) {
        this.tasks.remove(task);
    }

    /**
     * To get a task in the tasklist
     * @param index of the task the user wishes to retrieve
     * @return the specified task
     */
    public Task getTask(int index) {
        return this.tasks.get(index);
    }

    /**
     * Prints a list of the tasklist
     */
    public void list() {
        // prints a list of all tasks stored in this tasklist
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
    }
}
