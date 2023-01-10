package reports;

import java.util.Date;

public class Report {

    protected int counter;
    private int id;
    private String name;
    private Date date;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Report(String name, Date date) {

        this.name = name;
        this.date = date;
    }

    {
        id = ++counter;
    }
}
