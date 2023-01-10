package reports;

import java.util.Date;

public interface Database {

    void generate(String name, Date date, TypeOfReport typeOfReport, FormatOfReport formatOfReport);
}
