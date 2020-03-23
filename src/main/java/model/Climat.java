package model;

public class Climat {
  public double altitudeInMet;
  public int humidityInPercent;
  public String vegetation;

  public Climat(double altitudeInMet, int humidityInPercent, String vegetation) {
    this.altitudeInMet = altitudeInMet;
    this.humidityInPercent = humidityInPercent;
    this.vegetation = vegetation;
  }

  public double getAltitudeInMet() {
    return altitudeInMet;
  }

  public void setAltitudeInMet(double altitudeInMet) {
    this.altitudeInMet = altitudeInMet;
  }

  public int getHumidityInPercent() {
    return humidityInPercent;
  }

  public void setHumidityInPercent(int humidityInPercent) {
    this.humidityInPercent = humidityInPercent;
  }

  public String getVegetation() {
    return vegetation;
  }

  public void setVegetation(String vegetation) {
    this.vegetation = vegetation;
  }

}
