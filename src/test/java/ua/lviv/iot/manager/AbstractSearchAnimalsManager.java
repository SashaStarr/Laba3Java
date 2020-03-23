package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import model.AbstractAnimals;
import model.Cheetah;
import model.Lion;
import model.MagnitudeOfPoints;
import model.Vulture;

public abstract class AbstractSearchAnimalsManager {
  protected List<AbstractAnimals> lions;
  protected List<AbstractAnimals> cheetahs;
  protected List<AbstractAnimals> vultures;

  @BeforeEach
  public void joinLions() {
    lions = new LinkedList<AbstractAnimals>();
    lions.add(new Lion(4, "lions", 2.3, 60, "women", 10, false, 25));
    lions.add(new Lion(2, "lions", 2.2, 70, "man", 12, true, 26));
    lions.add(new Lion(3, "lions", 2.1, 65, "women", 11, false, 27));
  }

  public void joinCheetahs() {
    cheetahs = new LinkedList<AbstractAnimals>();
    cheetahs.add(new Cheetah(2, "cheetahs", 1.1, 40, "man", 5, false, MagnitudeOfPoints.SMALL));
    cheetahs.add(new Cheetah(3, "cheetahs", 1.2, 12, "man", 4, true, MagnitudeOfPoints.NORMALLY));
    cheetahs.add(new Cheetah(4, "cheetahs", 1.2, 22, "woman", 3, true, MagnitudeOfPoints.MANY));
  }

  public void joinVultures() {
    vultures = new LinkedList<AbstractAnimals>();
    vultures.add(new Vulture(4, "vulture", 1.5, 12, "man", 7, true, 26));
    vultures.add(new Vulture(2, "vulture", 1.3, 15, "woman", 6, true, 25));
    vultures.add(new Vulture(1, "vulture", 1.2, 15, "woman", 4, true, 24));
  }
}