package com.zyu.designs.builder.demo1;

public interface Builder {
    public void buildCpu(String Cpu);

    public void buildMainBord(String mainBord);

    public void buildRam(String ram);


    public  Computer build();

}
