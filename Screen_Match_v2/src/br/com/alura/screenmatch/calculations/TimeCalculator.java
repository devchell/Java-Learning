package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.catalog.Titles;

public class TimeCalculator extends Titles {

    private int totalMinutes;

    public TimeCalculator(String name, int yearReleased) {
        super(name, yearReleased);
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getTotalHours() {
        return Math.round((float) totalMinutes/60);
    }

    public void include(Titles title) {
        this.totalMinutes += title.getDurationMin();
    }
}
