package com.mclebtec.design.patterns.creational.abstractfactory.items;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class StrawberryIceCream implements IceCream {

  private String brand;
  private Integer cost;
  private Integer calories;

  @Override
  public Integer getCalories() {
    return calories;
  }

  @Override
  public Integer getCost() {
    return cost;
  }

  @Override
  public String getBrand() {
    return brand;
  }

}
