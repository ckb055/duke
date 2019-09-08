public class ListCommand extends Command {

    public ListCommand() {
        super();
    }

    /**
     * Executes the command.
     * Lists all files in the task.
     * @param tasks to handle the tasks
     * @param ui to get user input
     * @param storage to store tasks
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        return ("Here are the tasks in your list:" + "\n" + tasks.showList());
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
