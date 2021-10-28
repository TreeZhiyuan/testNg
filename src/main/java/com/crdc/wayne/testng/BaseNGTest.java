package com.crdc.wayne.testng;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.*;

@Slf4j
public class BaseNGTest {
    @BeforeClass
    public void setUp() {
        log.info("BeforeClass executed...");
    }

    @AfterClass
    public void destroy() {
        log.info("AfterClass executed...");
    }
}
