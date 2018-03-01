package com.zyu.designs.builder.demo1;

/**
 * 指挥者（Director）类用来规范组装电脑的流程顺序，先安装主板，再安装CPU，最后安装内存并组装成电脑。
 */
public class Direcror {
    Builder builder = null ;

    public  Direcror(Builder builder){
        this.builder = builder;
    }

    public  Computer CreateComputer(String cpu , String mainBord , String ram ){
        builder.buildCpu(cpu);
        builder.buildMainBord(mainBord);
        builder.buildRam(ram);
        return  builder.build();
    }
}
