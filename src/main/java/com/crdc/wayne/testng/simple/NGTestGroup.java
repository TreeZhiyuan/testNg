package com.crdc.wayne.testng.simple;

import com.crdc.wayne.testng.BaseNGTest;
import org.testng.annotations.Test;

public class NGTestGroup extends BaseNGTest {
    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");

    }

}
