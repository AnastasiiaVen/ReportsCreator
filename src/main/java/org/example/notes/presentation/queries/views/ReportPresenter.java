package org.example.notes.presentation.queries.views;

import org.example.notes.core.application.interfaces.Presenter;
import org.example.notes.core.domain.Report;

public class ReportPresenter implements Presenter {

    @Override
    public void print(Report report){
        System.out.println("Вывод отчета на экран");
    }
}
