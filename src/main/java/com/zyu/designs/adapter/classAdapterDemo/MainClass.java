package com.zyu.designs.adapter.classAdapterDemo;

public class MainClass {
    public static void main(String[] args) {
        Ps2 adapter = new Adapter();
        adapter.isPs2();

        Usb usb = new Adapter();
        usb.isUsb();



    }
}
