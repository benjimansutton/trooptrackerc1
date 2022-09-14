package com.benjiman.trooptracker.troops;

// This is the trooper  that will hold info fo the troopers from the XML file

public class Trooper {
  private String name;
  private int num;
  private int percentage;

  public void Trooper(String name, int num, int percentage) {
    this.name = name;
    this.num = num;
    this.percentage = percentage;
  }

  // These are the getters and setters for the trooper information
  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return int return the num
   */
  public int getNum() {
    return num;
  }

  /**
   * @param num the num to set
   */
  public void setNum(int num) {
    this.num = num;
  }

  /**
   * @return int return the percentage
   */
  public int getPercentage() {
    return percentage;
  }

  /**
   * @param percentage the percentage to set
   */
  public void setPercentage(int percentage) {
    this.percentage = percentage;
  }

}