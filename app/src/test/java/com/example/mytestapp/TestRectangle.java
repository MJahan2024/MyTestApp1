package com.example.mytestapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRectangle {
    @Test
    public void TestGetArea() {
        Rectangle r=new Rectangle(10,20);
        double expected=200;
        double actual=r.getArea();
        assertEquals(expected,actual,0.0005);
    }
}
