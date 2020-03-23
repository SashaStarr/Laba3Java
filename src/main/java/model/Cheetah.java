package model;

public class Cheetah extends AbstractAnimals {

  private MagnitudeOfPoints numberBlackSpots;

  public MagnitudeOfPoints getNumberBlackSpots() {
    return numberBlackSpots;
  }

  public void setNumberBlackSpots(MagnitudeOfPoints numberBlackSpots) {
    this.numberBlackSpots = numberBlackSpots;
  }

  public Cheetah(int foodConsumedInKilo, String kind, double sizeInM, int weightInKg, String point,
      int ageInYears, boolean huntForPrey, MagnitudeOfPoints numberBlackSpots) {
    super(foodConsumedInKilo, sizeInM, kind, weightInKg, point, ageInYears, huntForPrey);
    this.numberBlackSpots = numberBlackSpots;
  }
}