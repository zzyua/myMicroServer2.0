package com.zyu.designs.adapter.objectAdapterDemo;

public class MainClass {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3","mp3");
        player.play("vlc","vlc");
        player.play("mp4","mp4");
    }
}
