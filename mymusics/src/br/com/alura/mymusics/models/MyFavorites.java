package br.com.alura.mymusics.models;

public class MyFavorites extends Audio {

    public void include(Musics music){
        if(music.getClassification() > 8) {
            System.out.println(music.getTitle() + " is making success and preferred by all listeners.");
            System.out.println(music.getTotalListeners() + " mothly listeners\n");
        } else {
            System.out.println(music.getTitle() + " is a good choice for you.");
            System.out.println(music.getTotalListeners() + " monthly listeners\n");
        }
    }

    public void include(Podcast podcast) {
        if (podcast.getClassification() > 8){
            System.out.println(podcast.getTitle() + " is making success and preferred by all listeners.");
            System.out.println(podcast.getTotalLikes() + " likes\n");
        } else {
            System.out.println(podcast.getTitle() + " is a good choice for you.");
            System.out.println(podcast.getTotalLikes() + " likes\n");
        }
    }
}
