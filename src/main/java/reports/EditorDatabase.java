package reports;

import org.example.notes.core.domain.FormatOfReport;
import org.example.notes.core.domain.TypeOfReport;

import java.util.Collection;
import java.util.Date;

public class EditorDatabase implements Database{

    private Collection<Report> reports;

    public void generate(String name, Date date, TypeOfReport typeOfReport, FormatOfReport formatOfReport){
        Report report = new Report(name, date, typeOfReport, formatOfReport);
        reports.add(report);
    }
}
