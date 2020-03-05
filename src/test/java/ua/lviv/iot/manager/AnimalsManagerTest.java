package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import manager.SearchAnimalsManager;
import manager.SearchAnimalsManagerUtils;
import model.AbstractAnimals;
import model.SortType;
import ua.lviv.iot.manager.AbstractSearchAnimalsManager;

import org.junit.jupiter.api.BeforeEach;

class AnimalsManagerTest extends AbstractSearchAnimalsManager {
	private SearchAnimalsManager searchAnimalsManager;

	@BeforeEach
	public void setUp() {
		searchAnimalsManager = new SearchAnimalsManager();
		searchAnimalsManager.addAnimals(lions);
		searchAnimalsManager.addAnimals(cheetahs);
		searchAnimalsManager.addAnimals(vultures);
	}

	@Test
	public void testFindAnimalToEatMeatInKilo() {
		List<AbstractAnimals> animals = searchAnimalsManager.findAnimalToEatMeatInKilo(3);
		assertEquals(6, animals.size());
		assertEquals(10, animals.get(0).getFoodConsumedInKilo());
		assertEquals(8, animals.get(1).getFoodConsumedInKilo());
		assertEquals(5, animals.get(2).getFoodConsumedInKilo());
		assertEquals(4, animals.get(3).getFoodConsumedInKilo());
		assertEquals(3, animals.get(4).getFoodConsumedInKilo());
		
	}

}
