package org.example;

import org.example.notes.core.domain.FormatOfReport;
import org.example.notes.core.domain.Report;
import org.example.notes.core.domain.TypeOfReport;

import java.util.Date;

public class ReportGenerator {

    private TypeOfReport typeOfReport;
    private FormatOfReport formatOfReport;

    public Report generate(TypeOfReport typeOfReport, FormatOfReport formatOfReport){

        Report report = new Report("First report", new Date(), typeOfReport, formatOfReport);
        //происходит формирование отчета
        return
    }
}
