package com.zyu.designs.adapter.cainiaoDemo;

/**
 * Mp4播放器
 */
public class Mp4Player implements  AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //不实现
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("paly mp4 file . name is " + fileName);
    }
}
