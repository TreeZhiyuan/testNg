package com.crdc.wayne.testng.simple;

import com.crdc.wayne.testng.BaseNGTest;
import org.testng.annotations.Test;

public class NGTest1st extends BaseNGTest {
    @Test(groups = {"A"})
    public void aFastTest() {
        System.out.println("NGTest1st -> Fast test");
    }

    @Test
    public void aSlowTest() {
        System.out.println("NGTest1st -> Slow test");

    }

}
