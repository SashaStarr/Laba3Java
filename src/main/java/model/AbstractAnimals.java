package model;

public abstract class AbstractAnimals {

  private int foodConsumedInKilo;
  private String kind;
  private double sizeInM;
  private int weightInKg;
  private String point;
  private int ageInYears;
  public boolean huntForPrey;

  public AbstractAnimals(int foodConsumedInKilograms) {
    foodConsumedInKilo = foodConsumedInKilograms;
  }

  public int getFoodConsumedInKilo() {
    return foodConsumedInKilo;
  }

  public void setFoodConsumedInKilo(int foodConsumedInKilograms) {
    this.foodConsumedInKilo = foodConsumedInKilograms;
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public double getSizeInM() {
    return sizeInM;
  }

  public void setSizeInSm(double sizeInM) {
    this.sizeInM = sizeInM;
  }

  public int getWeightInKg() {
    return weightInKg;
  }

  public void setWeightInKg(int weightInKg) {
    this.weightInKg = weightInKg;
  }

  public String getPoint() {
    return point;
  }

  public void setPoint(String point) {
    this.point = point;
  }

  public int getAgeInYears() {
    return ageInYears;
  }

  public void setAgeInYears(int ageInYears) {
    this.ageInYears = ageInYears;
  }

  public boolean isHuntForPrey() {
    return huntForPrey;
  }

  public void setHuntForPrey(boolean huntForPrey) {
    this.huntForPrey = huntForPrey;
  }

  public AbstractAnimals(int foodConsumedInKilograms, double sizeInM, String kind, int weightInKg,
      String point, int ageInYears, boolean huntForPrey) {
    foodConsumedInKilo = foodConsumedInKilograms;
    this.sizeInM = sizeInM;
    this.kind = kind;
    this.weightInKg = weightInKg;
    this.point = point;
    this.ageInYears = ageInYears;
    this.huntForPrey = huntForPrey;
  }

  @Override
  public String toString() {
    return "AbstractAnimals [foodConsumedInKilo=" + foodConsumedInKilo + ", kind=" + kind
        + ", sizeInM=" + sizeInM + ", weightInKg=" + weightInKg + ", point=" + point
        + ", ageInYears=" + ageInYears + ", huntForPrey=" + huntForPrey + "]";
  }

}
