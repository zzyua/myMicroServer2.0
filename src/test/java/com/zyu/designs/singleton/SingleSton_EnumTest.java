package com.zyu.designs.singleton;

import com.zyu.designs.entity.PoolDemo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleSton_EnumTest {

    @Test
    public void getResource() {



        PoolDemo pool1 = SingleSton_Enum.INSTANCE.getResource();
        PoolDemo pool2 = SingleSton_Enum.INSTANCE.getResource();
        Assert.assertEquals(pool1,pool2);

    }
}