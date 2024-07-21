package com.mclebtec.design.patterns.creational.abstractfactory;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FactoryCreator {

  public static AbstractItemFactory getFactory(final String brand) {

    if (brand.equalsIgnoreCase(AmulItemFactory.COMPANY_NAME)) {
      return new AmulItemFactory();
    }

    if (brand.equalsIgnoreCase(LondonDiaryItemFactory.COMPANY_NAME)) {
      return new LondonDiaryItemFactory();
    }

    return null;
  }

}
