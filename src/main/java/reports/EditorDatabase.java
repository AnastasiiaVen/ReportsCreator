package reports;


import java.util.Collection;
import java.util.Date;

public class EditorDatabase implements Database{

    private Collection<Report> reports;

    @Override
    public void generate(String name, Date date, TypeOfReport typeOfReport, FormatOfReport formatOfReport) {
        Report report = new Report(name, date);
        reports.add(report);
    }
}
