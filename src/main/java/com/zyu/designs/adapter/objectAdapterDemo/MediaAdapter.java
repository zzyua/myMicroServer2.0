package com.zyu.designs.adapter.objectAdapterDemo;

public class MediaAdapter implements  MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer ;

    public MediaAdapter(String audioType) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer= new VlcPlayer();
        }else  if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}