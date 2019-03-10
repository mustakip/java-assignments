package com.java.assignments.day1;

public class Mustang extends Car {
  private int speed;

  public Mustang(int gears, int numberOfWheels) {
    super(gears, numberOfWheels);
    this.speed = 0;
  }

  public void increaseSpeed(int increment) {
    this.speed += increment;
  }

  public void decreaseSpeed(int decrement) {
    this.speed -= decrement;
  }
}
