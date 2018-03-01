package com.zyu.designs.builder.demo1;

/**
 * 电脑Builder类
 */
public class MyComputerBuilder implements  Builder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu(String Cpu) {
        System.out.println("组装Cpu=" + Cpu);
        computer.setmCpu(Cpu);
    }

    @Override
    public void buildMainBord(String mainBord) {
        System.out.println("组装主板=" + mainBord);
        computer.setmMainBord(mainBord);
    }

    @Override
    public void buildRam(String ram) {
        System.out.println("组装内存=" + ram);
        computer.setmRam(ram);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
