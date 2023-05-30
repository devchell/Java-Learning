package br.com.alura.mymusics.models;

public class Podcast extends Audio {

    private int season;
    private String host;
    private String description;
    private String guest;

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    @Override
    public int getClassification() {
        if (this.getTotalLikes() > 400) {
            return 10;
        } else {
            return 8;
        }
    }
}
