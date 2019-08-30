public class Deadline extends Task {
    protected String by;

    public Deadline(String desc, String by) {
        super(desc);
        this.by = by;
    }

    public String getDueDate() {
        return this.by;
    }
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by : " + by + ")";
    }
}
