package br.com.alura.mymusics.models;

public class Musics extends Audio {

    private String album;
    private String singer;
    private String band;
    private String genre;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getClassification() {
        if (this.getTotalListeners() > 7000) {
            return 10;
        } else {
            return 8;
        }
    }
}
