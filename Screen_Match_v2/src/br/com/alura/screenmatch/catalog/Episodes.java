package br.com.alura.screenmatch.catalog;

import br.com.alura.screenmatch.calculations.Rating;

public class Episodes implements Rating {

    private int num;
    private String name;
    private Series serie;
    private int views;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getRating() {
        if (views > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
