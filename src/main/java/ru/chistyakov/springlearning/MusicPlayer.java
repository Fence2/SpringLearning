package ru.chistyakov.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //@Autowired
    //@Qualifier("classicalMusic")
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("someRockMusic")Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
