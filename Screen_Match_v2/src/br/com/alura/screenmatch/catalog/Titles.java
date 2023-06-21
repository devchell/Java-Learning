package br.com.alura.screenmatch.catalog;


import br.com.alura.screenmatch.myexceptions.YearConversionErrorException;

public class Titles implements Comparable<Titles> {

    private String name;
    private int yearReleased;
    private boolean includedPlan;
    private double ratingSum;
    private int totalRating;
    private int durationMin;

    public Titles(String name, int yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;
    }

    public Titles(TitleOMBd myTitleOMBd) {
        this.name = myTitleOMBd.title();

        if (myTitleOMBd.year().length() > 4){
            throw new YearConversionErrorException("Can't conver the year because it is more than 4 characters long.");
        }
        this.yearReleased = Integer.valueOf(myTitleOMBd.year());
        this.durationMin = Integer.valueOf(myTitleOMBd.runtime().substring(0, 2));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public String getName() {
        return name;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public int getTotalRating(){
        return totalRating;
    }

    public void evaluate(double rate){
        ratingSum += rate;
        totalRating++;
    }

    public double averageRating(){
        return ratingSum/totalRating;
    }

    @Override
    public int compareTo(Titles otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return  "Title: " + name + '\n' +
                "Year Released: " + yearReleased + '\n' +
                "Duration: " + durationMin + " minutes";
    }
}
