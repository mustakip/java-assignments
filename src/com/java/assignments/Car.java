package com.java.assignments;

public class Car extends Vehicle{
  private int gears;
  private int gear;

  public Car(int gears, int numberOfWheels) {
    super(numberOfWheels);
    this.gears = gears;
    this.gear = 0;
  }

  public void changeGear(int gear) {
    this.gear = gear;
  }


}
