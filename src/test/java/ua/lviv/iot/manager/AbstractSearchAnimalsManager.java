package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import model.AbstractAnimals;
import model.Lion;
import model.Cheetah;
import model.Vulture;

public abstract class AbstractSearchAnimalsManager {
	protected List<AbstractAnimals> lions;
	protected List<AbstractAnimals> cheetahs;
	protected List<AbstractAnimals> vultures;

	@BeforeEach
	public void joinLions() {
		lions = new LinkedList<AbstractAnimals>();
		lions.add(new Lion(10));
		lions.add(new Lion(8));
		lions.add(new Lion(6));
	}
	public void joinCheetahs() {
		cheetahs = new LinkedList<AbstractAnimals>();
		cheetahs.add(new Cheetah(5));
		cheetahs.add(new Cheetah(4));
		cheetahs.add(new Cheetah(3));
	}
	public void joinVultures() {
		vultures = new LinkedList<AbstractAnimals>();
		vultures.add(new Vulture(6));
		vultures.add(new Vulture(5));
		vultures.add(new Vulture(1));
	}
}
