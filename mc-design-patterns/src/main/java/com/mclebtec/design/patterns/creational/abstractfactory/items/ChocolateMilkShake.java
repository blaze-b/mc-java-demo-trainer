package com.mclebtec.design.patterns.creational.abstractfactory.items;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ChocolateMilkShake implements MilkShake {

  private String brand;
  private Integer iceCubes;


  @Override
  public Integer getIceAmount() {
    return iceCubes;
  }

  @Override
  public String getBrand() {
    return brand;
  }

}
