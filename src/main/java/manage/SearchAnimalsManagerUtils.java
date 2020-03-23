package manage;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import model.AbstractAnimals;
import model.SortType;

public class SearchAnimalsManagerUtils {
  private static final SorterByFoodConsumedInKilo 
      SORTER_BY_FOOD_CONSUMED_IN_KILO = new SorterByFoodConsumedInKilo();

  public static void sortByFoodConsumedInKiloLions(List<AbstractAnimals> animals,
      SortType sortType) {

    animals.sort(sortType == SortType.ASC ? SORTER_BY_FOOD_CONSUMED_IN_KILO
        : SORTER_BY_FOOD_CONSUMED_IN_KILO.reversed());
  }

  static class SorterByFoodConsumedInKilo implements Comparator<AbstractAnimals>,Serializable {

    @Override
    public int compare(AbstractAnimals firstAnimal, AbstractAnimals secondAnimal) {
      return firstAnimal.getFoodConsumedInKilo() - secondAnimal.getFoodConsumedInKilo();
    }

  }

  public static void sortByPointLions(List<AbstractAnimals> animals, SortType sortType) {
    Comparator<AbstractAnimals> comparator = Comparator.comparing(AbstractAnimals::getPoint);
    animals.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  static class SorterByPointLions implements Comparator<AbstractAnimals>,Serializable {

    @Override
    public int compare(AbstractAnimals firstAnimal, AbstractAnimals secondAnimal) {
      return firstAnimal.getPoint().compareTo(secondAnimal.getPoint());
    }
  }

  public static void sortByAgeInYearsLions(List<AbstractAnimals> animals, SortType sortType) {
    Comparator<AbstractAnimals> comparator = new Comparator<AbstractAnimals>() {

      @Override
      public int compare(AbstractAnimals firstAnimal, AbstractAnimals secondAnimal) {
        return (int) (firstAnimal.getAgeInYears() - secondAnimal.getAgeInYears());

      }
    };

    if (sortType == SortType.ASC) {
      animals.sort(comparator);
    } else {
      animals.sort(comparator.reversed());

    }
  }
}