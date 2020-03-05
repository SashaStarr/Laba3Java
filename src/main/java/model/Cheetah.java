package model;
import model.MagnitudeOfPoints;


public class Cheetah extends AbstractAnimals  {
	public Cheetah(int foodConsumedInKilo) {
		super(foodConsumedInKilo);
	}
	private MagnitudeOfPoints numberBlackSpots;
	public MagnitudeOfPoints getNumberBlackSpots() {
		return numberBlackSpots;
	}
	public void setNumberBlackSpots(MagnitudeOfPoints numberBlackSpots) {
		this.numberBlackSpots = numberBlackSpots;
	}
	public Cheetah(MagnitudeOfPoints numberBlackSpots) {
		this.numberBlackSpots = numberBlackSpots;
	}
}
