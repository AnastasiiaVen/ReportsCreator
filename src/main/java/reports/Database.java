package reports;

import org.example.notes.core.domain.FormatOfReport;
import org.example.notes.core.domain.TypeOfReport;

import java.util.Date;

public interface Database {

    void generate(String name, Date date, TypeOfReport typeOfReport, FormatOfReport formatOfReport);
}
