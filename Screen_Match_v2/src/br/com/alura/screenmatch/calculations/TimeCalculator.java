package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.catalog.Title;

public class TimeCalculator extends Title {

    private int totalMinutes;

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getTotalHours() {
        return Math.round((float) totalMinutes /60);
    }

    public void include(Title title){
        this.totalMinutes += title.getDurationMin();
    }
}
