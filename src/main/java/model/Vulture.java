package model;

public class Vulture extends AbstractAnimals  {
	public Vulture(int foodConsumedInKilo) {
		super(foodConsumedInKilo);
	}
	private double wingspanInCentimeters;
	public double getWingspanInCentimeters() {
		return wingspanInCentimeters;
	}
	public void setWingspanInCentimeters(double wingspanInCentimeters) {
		this.wingspanInCentimeters = wingspanInCentimeters;
	}
}
