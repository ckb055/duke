import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Event extends Task {
    protected String at;
    private Date date;

    public Event(String desc, String at) throws ParseException {
        super(desc);
        this.at = at;
        String dateFormat = "dd/MM/yyyy HH:mm";
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        this.date = formatter.parse(at);
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at : " + this.date + ")";
    }

}
