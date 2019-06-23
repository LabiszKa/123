package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(3, 5));
        //Then
        Assert.assertEquals(3, shapeCollector.shapeSize());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(3, 5));
        shapeCollector.removeFigure(new Circle(5));
        //Then
        Assert.assertEquals(2, shapeCollector.shapeSize());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(3, 5));
        Shape result = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(new Triangle(3, 5), result);
    }
    @Test
    public void testGetFigureBelowSize() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(3, 5));
        Shape result = shapeCollector.getFigure(-3);
        //Then
        Assert.assertNull(result);
    }
    @Test
    public void testGetFigureAboveSize() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(5));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(3, 5));
        Shape result = shapeCollector.getFigure(5);
        //Then
        Assert.assertNull(result);
    }
}