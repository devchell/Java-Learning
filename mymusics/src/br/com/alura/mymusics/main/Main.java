package br.com.alura.mymusics.main;

import br.com.alura.mymusics.models.Musics;
import br.com.alura.mymusics.models.MyFavorites;
import br.com.alura.mymusics.models.Podcast;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        //Music (LosT)
        Musics lost = new Musics();
        lost.setTitle("LosT");
        lost.setBand("Bring Me The Horizon");
        lost.setAlbum("LosT");
        lost.setGenre("Post-Hardcore");

        int randomMusicPlay = random.nextInt(1200, 8000);
        for (int i = 0; i < randomMusicPlay; i++) {
            lost.play();
        }
        int randomMusicLike = random.nextInt(600, 1200);
        for (int i = 0; i < randomMusicLike; i++) {
            lost.like();
        }

        //Podcast (Flow Podcast)
        Podcast flowPodcast = new Podcast();
        flowPodcast.setTitle("Flow Podcast");
        flowPodcast.setHost("Igor 3K");
        flowPodcast.setGuest("Morgan Freeman");
        flowPodcast.setSeason(12);
        flowPodcast.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type specimen book.");

        int randomPodPlay = random.nextInt(1000, 3000);
        for (int i = 0; i < randomPodPlay; i++) {
            flowPodcast.play();
        }
        int randomPodLike = random.nextInt(300, 600);
        for (int i = 0; i < randomPodLike; i++) {
            flowPodcast.like();
        }

        //My Favorites Audios
        MyFavorites favorites = new MyFavorites();
        favorites.include(lost);
        favorites.include(flowPodcast);
    }
}
