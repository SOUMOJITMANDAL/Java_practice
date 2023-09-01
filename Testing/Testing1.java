package com.Mindtree.Testing;
import org.junit.Assert;
import org.junit.Test;
public class Testing1 {
    String message = "SoumojitTheTester";

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage() ");
        Assert.assertEquals("SoumojitTheTester",message);
    }
}


