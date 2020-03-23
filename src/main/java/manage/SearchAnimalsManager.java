package manage;

import java.util.LinkedList;
import java.util.List;
import model.AbstractAnimals;

public class SearchAnimalsManager {
  private List<AbstractAnimals> animals = new LinkedList<>();

  public void addAnimals(List<AbstractAnimals> animals) {

    this.animals.addAll(animals);
  }

  public List<AbstractAnimals> findAnimalToEatMeatInKilo(float eatsForTheDayOfMeatInKilo) {
    List<AbstractAnimals> result = new LinkedList<>();
    for (AbstractAnimals animal : animals) {
      if (animal.getFoodConsumedInKilo() > eatsForTheDayOfMeatInKilo) {
        result.add(animal);
      }
    }
    return result;
  }

}