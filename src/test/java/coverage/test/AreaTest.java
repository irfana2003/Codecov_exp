package coverage.test;

import java.lang.Math;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.example.Area;

public class AreaTest {
    private Area area = new Area();

    // Triangle
    @Test
    public void checkTriangleAreaValidInput() {
        double b = 10;
        double h = 20;
        double actual = area.triangle(b, h);
        double expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTriangleAreaInvalidBaseInput() {
        double b = -10;
        double h = 20;
        double actual = area.triangle(b, h);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTriangleAreaInvalidHeightInput() {
        double b = 10;
        double h = -20;
        double actual = area.triangle(b, h);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    // Rectangle
    @Test
    public void checkRectangleAreaValidInput() {
        double b = 10;
        double h = 20;
        double actual = area.rectangle(b, h);
        double expected = 200;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRectangleAreaInvalidBaseInput() {
        double b = -10;
        double h = 20;
        double actual = area.rectangle(b, h);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRectangleAreaInvalidHeightInput() {
        double b = 10;
        double h = -20;
        double actual = area.rectangle(b, h);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    // Square
    @Test
    public void checkSquareAreaValidInput() {
        double s = 10;
        double actual = area.square(s);
        double expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSquareAreaInvalidSideInput() {
        double s = -10;
        double actual = area.square(s);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    // Circle
    @Test
    public void checkCircleAreaValidInput() {
        double radius = 10;
        double expected = Math.PI * Math.pow(radius, 2);
        double actual = area.circle(radius);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkCircleAreaInvalidInput() {
        double radius = -10;
        double actual = area.circle(radius);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
