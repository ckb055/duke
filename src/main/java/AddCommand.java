public class AddCommand extends Command {
    private Task task;
    /**
     * Creates an AddCommand object
     * Adds the task to the tasklist
     * @param task
     */
    public AddCommand(Task task) {
        super();
        this.task = task;
    }
    /**
     * Executes the command.
     * Adds the task to the tasklist.
     * @param tasks to handle the tasks
     * @param ui to get user input
     * @param storage to store tasks
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.addTask(this.task);
        try {
            storage.writeToHardDisk(tasks);
        } catch (DukeException e) {
            e.printStackTrace();
        }
        return ui.printAddMessage(tasks, this.task);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
