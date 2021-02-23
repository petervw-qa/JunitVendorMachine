package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import vendormachine.users.Person;
import vendormachine.users.util.Wallet;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.enums.BRANDS;

public class DrinkVendingMachineTEST {
	
	/** 
	 * Task 2:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.vendors.DrinkVendingMachine'
	 * 
	 * 	Goal: 
	 * 		80% code/line coverage
	 * 		TDD: analyse code and add missing methods.
	 * */
	
	private BRANDS caramelSprinkle = BRANDS.CaramelSprinkle;
	private Wallet wallet = new Wallet("LV", 0.5f);
	private Person user = new Person("Peter", wallet);
	private DrinkVendingMachine machine = new DrinkVendingMachine();
	private DrinkVendingMachine machine1 = new DrinkVendingMachine(0.0f, caramelSprinkle);
	
	@Test
	void emptyConstructorTEST() {
		assertTrue(machine instanceof DrinkVendingMachine);
	}
	
	@Test
	void firstConstructorTEST() {
		assertTrue(machine1 instanceof DrinkVendingMachine);
	}
	
	@Test
	void selectDrinkTEST() {
		machine1.getDrinkList();
	}
	
	@Test
	void giveCreditTEST() {
		machine1.giveCredit(user, 1.0f);
		assertEquals(0.0f, machine1.getAvailableCredit());
	}
	
	@Test
	void getBrandNameTEST() {
		BRANDS expected = machine.getBrandName();
		BRANDS actual = BRANDS.CaramelSprinkle;
		assertEquals(expected, actual);
	}
	
	@Test
	void getAvailableCreditTEST() {
		machine1.getAvailableCredit();
		assertEquals(0.0f, machine.getAvailableCredit());
	}
	
	@Test
	void getDrinkListTEST() {
		machine1.getDrinkList();
		// return type different, assertEquals or assertTrue?
	}
	
	@Test
	void setBrandNameTEST() {
		machine1.setBrandName(caramelSprinkle);
		BRANDS expected = machine.getBrandName();
		BRANDS actual = BRANDS.CaramelSprinkle;
		assertEquals(expected, actual);
	}
	
	@Test
	void setAvailableCreditTEST() {
		machine1.setAvailableCredit(5.5f);
		assertEquals(5.5f, machine1.getAvailableCredit());
	}
	
	@Test
	void setDrinkListTEST() {
		machine.selectDrink(0);
		assertEquals(null,machine.selectDrink(0));
	}

}
