package com.Mindtree.Testing;

import org.junit.*;
import org.junit.jupiter.api.Test;    //junit5
//import org.junit.Test;    // Junit 4
public class jUnitTesting {
    public static void main(String[] args) {

    }

    @Test
    public void JUnitTesting()  // Tells JUnit which method to be run as test case.
    {
        System.out.println("Junit test cases initialised"); // automated testing
    }

    @Before
    public void Junit_before(){
        System.out.println("Junit before.To execute some statements before each test case execution.");
    }

    @After
    public void Junit_after(){
        System.out.println("Junit after. To execute some statements after each test case execution.");
    }

    @Ignore
    public void Junit_ignore(){
        System.out.println("Junit after. To ignore some statements during each test case execution.");
    }

    @BeforeClass
    public static void Junit_beforeClass(){
        System.out.println("Junit before class. To execute a statement before all test cases.");
    }

    @AfterClass
    public static void Junit_afterClass(){
        System.out.println("Junit after class. To execute a statement after all test cases.");
    }


}
