package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import manager.SearchAnimalsManagerUtils;
import model.AbstractAnimals;
import model.SortType;

public class AnimalsManagerTestUtils extends AbstractSearchAnimalsManager {

	@Test
	public void testSortDescending() {
		AnimalsManagerTestUtils.sortByFoodConsumedInKilo(lions, SortType.DESC);
		assertEquals(10, lions.get(0).getFoodConsumedInKilo());
		assertEquals(8, lions.get(1).getFoodConsumedInKilo());
		assertEquals(6, lions.get(2).getFoodConsumedInKilo());
		
	}

	private static void sortByFoodConsumedInKilo(List<AbstractAnimals> lions, SortType desc) {
		
	}

}
