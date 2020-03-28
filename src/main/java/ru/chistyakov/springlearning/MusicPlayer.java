package ru.chistyakov.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //@Autowired
    //private Music music;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public  MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    //@Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }
}
