package com.java.assignments.day1;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance() {
    double squareOfDistance = ((x - 0) * (x - 0)) + ((y - 0) * (y - 0));
    return Math.sqrt(squareOfDistance);
  }

  public double distance(int px,int py) {
    double squareOfDistance = ((x - px) * (x - px)) + ((y - py) * (y - py));
    return Math.sqrt(squareOfDistance);
  }

  public double distance(Point point) {
    return distance(point.x,point.y);
  }
}
