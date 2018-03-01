package com.zyu.designs.builder.demo1;

/**
 * 电脑类
 */
public class Computer {
    /**
     * CPU
     */
    private String mCpu ;

    /*
     *主板
     */
    private String mMainBord;

    /**
     * 内存
     */
    private String mRam ;

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setmMainBord(String mMainBord) {
        this.mMainBord = mMainBord;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }
}
