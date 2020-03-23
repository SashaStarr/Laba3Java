package model;

public class Favor extends AbstractAnimals {
  private AbstractAnimals animal;
  private Region region;
  private float eatsForTheDayOfMeatInKilo;

  public AbstractAnimals getAnimal() {
    return animal;
  }

  public void setAnimal(AbstractAnimals animal) {
    this.animal = animal;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public float getEatsForTheDayOfMeatInKilo() {
    return eatsForTheDayOfMeatInKilo;
  }

  public void setEatsForTheDayOfMeatInKilo(float eatsForTheDayOfMeatInKilo) {
    this.eatsForTheDayOfMeatInKilo = eatsForTheDayOfMeatInKilo;
  }

  public Favor(int foodConsumedInKilo, AbstractAnimals animal, Region region,
      float eatsForTheDayOfMeatInKilo) {
    super(foodConsumedInKilo);
    this.animal = animal;
    this.region = region;
    this.eatsForTheDayOfMeatInKilo = eatsForTheDayOfMeatInKilo;
  }

}
