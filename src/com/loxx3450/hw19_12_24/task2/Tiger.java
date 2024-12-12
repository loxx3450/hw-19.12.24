package com.loxx3450.hw19_12_24.task2;

public class Tiger extends Animal {
  private int maxSpeed;

  public Tiger(String species, double weight, double height, int age, int maxSpeed) {
    super(species, weight, height, age);
    this.maxSpeed = maxSpeed;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
}