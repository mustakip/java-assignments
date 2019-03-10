package com.java.assignments.day2;

public class JewelryBox {
  private Jewelry jewelry;
  private JewelryBox jewelryBox;
  private int jewelryCount = 0;

  public JewelryBox(Jewelry jewelry) {
    this.jewelry = jewelry;
    this.jewelryCount++;
  }

  public JewelryBox(Jewelry jewelry, JewelryBox jewelryBox) {
    this.jewelry = jewelry;
    this.jewelryBox = jewelryBox;
    this.jewelryCount++;
  }

  public int getJewelleriesCount(){

    int a = 5;
    int b = (int) Math.ceil(a/2);
    return this.jewelryCount + 0;
  }
}
