package com.example.recruit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Author: 陈大伟 <br>
 * Data: 2025/7/16 23:55 <br>
 * Description: MyGreeter测试
 */
public class MyGreeterTest {
    private MyGreeter mMyGreeter;

    @Before
    public void setUp() {
        this.mMyGreeter = new MyGreeter();
    }

    @Test
    public void testInit() {
        assertTrue(this.mMyGreeter instanceof MyGreeter);
    }

    @Test
    public void testGreeting() {
        String greeting = this.mMyGreeter.greeting();
        assertFalse(greeting.isEmpty());
    }
}
