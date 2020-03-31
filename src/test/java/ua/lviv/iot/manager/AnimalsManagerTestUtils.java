package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import manage.SearchAnimalsManagerUtils;
import model.SortType;

public class AnimalsManagerTestUtils extends AbstractSearchAnimalsManager {

  @Test
  public void testSortByFoodConsumedInKiloLionsDescending() {
    SearchAnimalsManagerUtils.sortByFoodConsumedInKiloLions(lions, SortType.DESC);
    assertEquals(4, lions.get(0).getFoodConsumedInKilo());
    assertEquals(3, lions.get(1).getFoodConsumedInKilo());
    assertEquals(2, lions.get(2).getFoodConsumedInKilo());
  }

  @Test
  public void testSortByFoodConsumedInKiloLionsAscending() {
    SearchAnimalsManagerUtils.sortByFoodConsumedInKiloLions(lions, SortType.ASC);
    assertEquals(4, lions.get(2).getFoodConsumedInKilo());
    assertEquals(3, lions.get(1).getFoodConsumedInKilo());
    assertEquals(2, lions.get(0).getFoodConsumedInKilo());

  }

  @Test
  public void testSortByPointLionsAscending() {
    SearchAnimalsManagerUtils.sortByPointLions(lions, SortType.ASC);
    assertEquals("man", lions.get(0).getPoint());
    assertEquals("women", lions.get(1).getPoint());
    assertEquals("women", lions.get(2).getPoint());

  }

  @Test
  public void testSortByPointLionsDescending() {
    SearchAnimalsManagerUtils.sortByPointLions(lions, SortType.DESC);
    assertEquals("man", lions.get(2).getPoint());
    assertEquals("women", lions.get(1).getPoint());
    assertEquals("women", lions.get(0).getPoint());

  }

  @Test
  public void testSortByAgeInYearsLionsDescending() {
    SearchAnimalsManagerUtils.sortByAgeInYearsLions(lions, SortType.DESC);
    assertEquals(10, lions.get(2).getAgeInYears());
    assertEquals(11, lions.get(1).getAgeInYears());
    assertEquals(12, lions.get(0).getAgeInYears());

  }

  @Test
  public void testSortByAgeInYearsLionsAscending() {
    SearchAnimalsManagerUtils.sortByAgeInYearsLions(lions, SortType.DESC);
    assertEquals(12, lions.get(0).getAgeInYears());
    assertEquals(11, lions.get(1).getAgeInYears());
    assertEquals(10, lions.get(2).getAgeInYears());

  }

}
