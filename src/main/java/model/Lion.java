package model;

public class Lion extends AbstractAnimals {

  private int sizeOfManeInSm;

  public int getSizeOfManeInCentimeters() {
    return sizeOfManeInSm;
  }

  public void setSizeOfManeInCentimeters(int sizeOfManeInCentimeters) {
    this.sizeOfManeInSm = sizeOfManeInCentimeters;
  }

  public Lion(int foodConsumedInKilo, String kind, double sizeInSm, int weightInKg, String point,
      int ageInYears, boolean huntForPrey, int sizeOfManeInSm) {
    super(foodConsumedInKilo, sizeInSm, kind, weightInKg, point, ageInYears, huntForPrey);
    this.sizeOfManeInSm = sizeOfManeInSm;
  }

  @Override
  public String toString() {
    return "Lion [sizeOfManeInSm=" + sizeOfManeInSm + "]";
  }
  public String getHeaders() {
    return super.getHeaders() + ", sizeOfManeInSm";
  }

  public String toCSV() {
    return super.toCSV() + ", " + sizeOfManeInSm;
  }
}