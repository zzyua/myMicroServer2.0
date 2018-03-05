package com.zyu.designs.adapter.adapter.interfaceAdapter;

public class Target extends  Abstarct {
    @Override
    public void B() {
        super.B();
        System.out.println("调用Target的B方法");
    }

    @Override
    public void C() {
        super.C();
        System.out.println("调用Target的C方法");
    }
}
