package com.zyu.designs.adapter.objectAdapterDemo;

/**
 * 默认mp3播放器
 *
 * 播放vlc和mp4的文件时，调用适配器调用
 *
 * Client
 */
public class AudioPlayer implements  MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //mp3 播放器本身实现 播放功能
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if("vlc".equalsIgnoreCase(audioType)
                || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }

    }
}
