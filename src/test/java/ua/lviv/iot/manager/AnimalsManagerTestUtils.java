package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.AbstractAnimals;
import model.SortType;

public class AnimalsManagerTestUtils extends AbstractSearchAnimalsManager {

  @Test
  public void testSortByFoodConsumedInKiloLionsDescending() {
    AnimalsManagerTestUtils.sortByFoodConsumedInKilo(lions, SortType.DESC);
    assertEquals(4, lions.get(0).getFoodConsumedInKilo());
    assertEquals(2, lions.get(1).getFoodConsumedInKilo());
    assertEquals(3, lions.get(2).getFoodConsumedInKilo());
  }

  @Test
  public void testSortByFoodConsumedInKiloLionsAscending() {
    AnimalsManagerTestUtils.sortByFoodConsumedInKilo(lions, SortType.ASC);
    assertEquals(3, lions.get(2).getFoodConsumedInKilo());
    assertEquals(2, lions.get(1).getFoodConsumedInKilo());
    assertEquals(4, lions.get(0).getFoodConsumedInKilo());

  }

  private static void sortByFoodConsumedInKilo(List<AbstractAnimals> lions, SortType asc) {

  }

  @Test
  public void testSortByPointLionsAscending() {
    AnimalsManagerTestUtils.sortByPointLions(lions, SortType.ASC);
    assertEquals("women", lions.get(0).getPoint());
    assertEquals("man", lions.get(1).getPoint());
    assertEquals("women", lions.get(2).getPoint());

  }

  @Test
  public void testSortByPointLionsDescending() {
    AnimalsManagerTestUtils.sortByPointLions(lions, SortType.DESC);
    assertEquals("women", lions.get(2).getPoint());
    assertEquals("man", lions.get(1).getPoint());
    assertEquals("women", lions.get(0).getPoint());

  }

  private static void sortByPointLions(List<AbstractAnimals> lions, SortType desc) {

  }

  @Test
  public void testSortByAgeInYearsLionsDescending() {
    AnimalsManagerTestUtils.sortByAgeInYearsLions(lions, SortType.DESC);
    assertEquals(11, lions.get(2).getAgeInYears());
    assertEquals(12, lions.get(1).getAgeInYears());
    assertEquals(10, lions.get(0).getAgeInYears());

  }

  @Test
  public void testSortByAgeInYearsLionsAscending() {
    AnimalsManagerTestUtils.sortByAgeInYearsLions(lions, SortType.DESC);
    assertEquals(10, lions.get(0).getAgeInYears());
    assertEquals(12, lions.get(1).getAgeInYears());
    assertEquals(11, lions.get(2).getAgeInYears());

  }

  private static void sortByAgeInYearsLions(List<AbstractAnimals> lions, SortType desc) {

  }

}
