package model;

public class Vulture extends AbstractAnimals {
  private double wingspanInCentimeters;

  public double getWingspanInCentimeters() {
    return wingspanInCentimeters;
  }

  public void setWingspanInCentimeters(double wingspanInCentimeters) {
    this.wingspanInCentimeters = wingspanInCentimeters;
  }

  public Vulture(int foodConsumedInKilo, String kind, double sizeInM, int weightInKg, String point,
      int ageInYears, boolean huntForPrey, double wingspanInCentimeters) {
    super(foodConsumedInKilo, sizeInM, kind, weightInKg, point, ageInYears, huntForPrey);
    this.wingspanInCentimeters = wingspanInCentimeters;
  }

  @Override
  public String toString() {
    return "Vulture [wingspanInCentimeters=" + wingspanInCentimeters + "]";
  }
  public String getHeaders() {
    return super.getHeaders() + ", wingspanInCentimeters";
  }

  public String toCSV() {
    return super.toCSV() + ", " + wingspanInCentimeters;
  }
}