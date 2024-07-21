package com.mclebtec.design.patterns.creational.abstractfactory;

import com.mclebtec.design.patterns.creational.abstractfactory.items.ChocolateIceCream;
import com.mclebtec.design.patterns.creational.abstractfactory.items.ChocolateMilkShake;
import com.mclebtec.design.patterns.creational.abstractfactory.items.IceCream;
import com.mclebtec.design.patterns.creational.abstractfactory.items.MilkShake;
import com.mclebtec.design.patterns.creational.abstractfactory.items.StrawberryIceCream;
import com.mclebtec.design.patterns.creational.abstractfactory.items.StrawberryMilkShake;

public abstract class AbstractItemFactory {

  public abstract IceCream createIceCream(final String choice);


  public abstract MilkShake createMilkShake(final String choice);

}

class AmulItemFactory extends AbstractItemFactory {

  public static final String COMPANY_NAME = "Amul";

  @Override
  public IceCream createIceCream(final String choice) {

    if (choice.equalsIgnoreCase("strawberry")) {
      return new StrawberryIceCream(COMPANY_NAME, 10, 152);
    }

    if (choice.equalsIgnoreCase("chocolate")) {
      return new ChocolateIceCream(COMPANY_NAME, 10, 153);
    }

    return null;
  }

  @Override
  public MilkShake createMilkShake(final String choice) {

    if (choice.equalsIgnoreCase("Strawberry")) {
      return new StrawberryMilkShake(COMPANY_NAME, 10);
    }

    if (choice.equalsIgnoreCase("Chocolate")) {
      return new ChocolateMilkShake(COMPANY_NAME, 10);
    }

    return null;
  }

}

class LondonDiaryItemFactory extends AbstractItemFactory {

  public static final String COMPANY_NAME = "London Diary";

  @Override
  public IceCream createIceCream(final String choice) {

    if (choice.equalsIgnoreCase("Strawberry")) {
      return new StrawberryIceCream(COMPANY_NAME, 10, 1677);
    }

    if (choice.equalsIgnoreCase("Chocolate")) {
      return new ChocolateIceCream(COMPANY_NAME, 10, 1767);
    }

    return null;
  }

  @Override
  public MilkShake createMilkShake(final String choice) {

    if (choice.equalsIgnoreCase("Strawberry")) {
      return new StrawberryMilkShake(COMPANY_NAME, 23);
    }

    if (choice.equalsIgnoreCase("Chocolate")) {
      return new ChocolateMilkShake(COMPANY_NAME, 15);
    }

    return null;
  }

}
