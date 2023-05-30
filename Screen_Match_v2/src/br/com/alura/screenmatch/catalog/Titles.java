package br.com.alura.screenmatch.catalog;

public class Title {

    private String name;
    private int yearReleased;
    private boolean includedPlan;
    private double ratingSum;
    private int totalRating;
    private int durationMin;

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

}
