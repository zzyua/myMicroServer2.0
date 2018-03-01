package com.zyu.designs.builder.demo1;

public class MainClass {

    public static void main(String[] args) {
        //使用Direcror 来构建
        Builder builder = new MyComputerBuilder();
        Direcror direcror = new Direcror(builder);
        Computer computer = direcror.CreateComputer("i7", "Intel主板", "mRam");
        System.out.println("构建完毕...");

        //客户端自定义
        Builder builder2 =new MyComputerBuilder();
        builder2.buildCpu("i7_7300");
        builder2.buildMainBord("Intel主板2");
        builder2.buildRam("maxRam");
        Computer computer1 = builder2.build();
        System.out.println("2222构建完毕...");
    }
}
