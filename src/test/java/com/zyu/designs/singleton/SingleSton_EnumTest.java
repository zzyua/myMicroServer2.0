package com.zyu.designs.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingleSton_EnumTest {

    @Test
    public void getResource() {



        PoolDemo pool1 = SingleSton_Enum.INSTANCE.getResource();
        PoolDemo pool2 = SingleSton_Enum.INSTANCE.getResource();
        Assert.assertEquals(pool1,pool2);

    }
}