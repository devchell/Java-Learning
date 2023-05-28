package br.com.alura.screenmatch.catalog;

public class Series extends Title {

    private int seasons;
    private int totalEpisodes;
    private int minPerEp;
    private boolean active;

    public int getSeasons() {
        return seasons;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public int getMinPerEp() {
        return minPerEp;
    }

    public boolean isActive() {
        return active;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public void setMinPerEp(int minPerEp) {
        this.minPerEp = minPerEp;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int getDurationMin() {
        return totalEpisodes * minPerEp;
    }

    public void serieDataSheet() {
        System.out.println("\nSerie: " + getName());
        System.out.println("Released Year: " + getYearReleased());
        System.out.println("Is active: " + isActive());
        System.out.println("Seasons: " + getSeasons());
        System.out.println("Minutes per Episode: " + getMinPerEp());
        System.out.println("Avarege Episodes per Season: " + (getTotalEpisodes()/getSeasons()));
        System.out.println("Total Duration: " + getDurationMin() + " minutes");
        System.out.println("Rating: " + String.format("%.2f", averageRating()));
        System.out.println("Total Ratings: " + getTotalRating());
    }
}
