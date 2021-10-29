package com.crdc.wayne.testng.simple;

import com.crdc.wayne.testng.BaseNGTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class NgTestGroup extends BaseNGTest {
    @Test(groups = {"groupA"})
    public void testGroupA() {
        System.out.println("NgTestGroup -> Group A");
    }

    @Test(groups = {"groupB"})
    public void testGroupA2() {
        System.out.println("NgTestGroup -> Group B");
    }

    @Test(groups = {"groupC"})
    public void testGroupA3() {
        System.out.println("NgTestGroup -> Group C");
    }
}