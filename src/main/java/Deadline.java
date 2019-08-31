import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deadline extends Task {
    protected String by;
    private Date date;

    public Deadline(String desc, String by) throws ParseException {
        super(desc);
        this.by = by;
        String dateFormat = "dd/MM/yyyy HH:mm";
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        this.date = formatter.parse(by);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by : " + this.date + ")";
    }
}
