package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when41to51then5() {
        Point a = new Point(4, 1);
        Point b = new Point(5, 1);
        double expected = 1;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to11then0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double expected = 0;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when111to111then0() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 1);
        double expected = 0;
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000to005then5() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 5);
        double expected = 5;
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}