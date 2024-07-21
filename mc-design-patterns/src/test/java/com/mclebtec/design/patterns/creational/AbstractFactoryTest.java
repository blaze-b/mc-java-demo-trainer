package com.mclebtec.design.patterns.creational;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.mclebtec.design.patterns.creational.abstractfactory.AbstractItemFactory;
import com.mclebtec.design.patterns.creational.abstractfactory.FactoryCreator;
import com.mclebtec.design.patterns.creational.abstractfactory.items.IceCream;
import com.mclebtec.design.patterns.creational.abstractfactory.items.MilkShake;
import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

  @Test
  void getFactory_WhenAmulCompanyIsInvokedAndStrawberryIsCreated_Success() {
    // GIVEN
    final String brand = "Amul";

    // WHEN
    AbstractItemFactory abstractItemFactory = FactoryCreator.getFactory(brand);

    // THEN
    assertNotNull(abstractItemFactory);
    assertAll(
        () -> {
          IceCream iceCream = abstractItemFactory.createIceCream("strawberry");
          assertEquals(brand, iceCream.getBrand());
          assertEquals(10, iceCream.getCost());
          assertEquals(152, iceCream.getCalories());
        },
        () -> {
          MilkShake milkShake = abstractItemFactory.createMilkShake("strawberry");
          assertEquals(brand, milkShake.getBrand());
          assertEquals(10, milkShake.getIceAmount());
        }
    );
  }

}
