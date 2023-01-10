package org.example.notes.core.domain;

import java.util.Date;

public class Report {

    protected int counter;
    private int id;
    private String name;
    private Date date;

    public TypeOfReport getTypeOfReport() {
        return typeOfReport;
    }

    public FormatOfReport getFormatOfReport() {
        return formatOfReport;
    }

    private TypeOfReport typeOfReport;
    private FormatOfReport formatOfReport;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Report(String name, Date date, TypeOfReport typeOfReport, FormatOfReport formatOfReport) {

        this.name = name;
        this.date = date;
        this.typeOfReport = typeOfReport;
        this.formatOfReport = formatOfReport;
    }

    {
        id = ++counter;
    }
}

