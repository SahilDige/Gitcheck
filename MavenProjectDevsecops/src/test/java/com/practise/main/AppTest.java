package com.practise.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void sumWithtrue() {
        App app1 =new App();
        int expected=30;
        int actual=app1.sum(10, 20);
    	assertEquals(expected, actual);
    }
    
    @Test
//<<<<<<< HEAD
    public void changedforconflict() {
        App app1 =new App();
        int expected=30;
        int actual=app1.sub(40, 10);
    	assertEquals(expected, actual);
    }
}
