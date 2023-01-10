package reports;

import org.example.notes.core.domain.FormatOfReport;
import org.example.notes.core.domain.Report;
import org.example.notes.core.domain.TypeOfReport;

public interface Generator<T, F> {

    Report generateReport(T typeOfReport, F formatOfReport);
}
