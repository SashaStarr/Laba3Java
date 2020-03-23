
package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import manage.SearchAnimalsManager;
import model.AbstractAnimals;

class AnimalsManagerTest extends AbstractSearchAnimalsManager {
  private SearchAnimalsManager searchAnimalsManager;

  @BeforeEach
  public void setUp() {
    searchAnimalsManager = new SearchAnimalsManager();
    searchAnimalsManager.addAnimals(lions);
  }

  @Test
  public void testFindAnimalToEatMeatInKilo() {
    List<AbstractAnimals> animals = searchAnimalsManager.findAnimalToEatMeatInKilo(1);
    assertEquals(3, animals.size());
    assertEquals(4, animals.get(0).getFoodConsumedInKilo());
    assertEquals(2, animals.get(1).getFoodConsumedInKilo());
    assertEquals(3, animals.get(2).getFoodConsumedInKilo());

  }

}