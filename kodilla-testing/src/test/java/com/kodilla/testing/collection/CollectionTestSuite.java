package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer> result = tester.exterminate(numbers);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(6);
        evenNumbers.add(8);

        Assert.assertEquals(evenNumbers, result);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> numbers = new ArrayList<>();
        int elements = numbers.size();
        System.out.println(elements);

        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer>  result = tester.exterminate(numbers);
        int elements1 = result.size();
        Assert.assertTrue(elements1 == 0);
    }
}