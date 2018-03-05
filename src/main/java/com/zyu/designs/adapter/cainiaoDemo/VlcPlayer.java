package com.zyu.designs.adapter.cainiaoDemo;

/**
 * vlc播放器
 */
public class VlcPlayer implements  AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("paly vlc file . name is " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //不实现
    }
}
