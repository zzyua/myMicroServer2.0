package com.zyu.designs.singleton;

public enum SingleSton_Enum {
    INSTANCE ;

    private PoolDemo pool;


    SingleSton_Enum(){
        pool = new PoolDemo();
        pool.setId("001");
        pool.setConfig("pool's  config");

    }

    public  PoolDemo getResource(){
        return pool;
    }

}
