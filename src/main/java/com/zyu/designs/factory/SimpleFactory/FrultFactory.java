package com.zyu.designs.factory.SimpleFactory;

public class FrultFactory {


    public  static  Frult getFrult(String classz) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        //1、使用switch case 方式，则需要增加一个Product时，就增加一种判断.
//        if("ap".equals(classz)){
//            //创建Apple实例
//        }


        //2、使用反射方式去创建对象，也存在需要修改传入Class修改后的问题。
         Class frult =  Class.forName(classz);
         return (Frult)frult.newInstance();


//        3、使用CLass的方式，则创建对象的过程，交到创建者手中。但是存在如果Apple类修改过了，则面临全局都要修改的问题
//        return (Frult) classz.newInstance();
    }
}
