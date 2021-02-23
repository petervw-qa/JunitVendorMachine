package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.
	@Test
	void emptyConstructorTEST() {
		Wallet wallet = new Wallet();
		assertTrue(wallet instanceof Wallet);
	}
	
	@Test
	void firstContructorTEST() {
		Wallet wallet1 = new Wallet(0.1f);
		String expected = "Wallet [brand=Generic, storedCredit=0.1]";
		assertEquals(expected, wallet1.toString());
	}
	
	@Test
	void secondContructorTest() {
		Wallet wallet2 = new Wallet("LV", 0.5f);
		String expected = "Wallet [brand=LV, storedCredit=0.5]";
		assertEquals(expected, wallet2.toString());
	}
	
	@Test
	void addCreditTEST() {
		Wallet wallet = new Wallet(0.5f);
		wallet.addCredit(1f);
		String expected = "Wallet [brand=Generic, storedCredit=1.5]";
		assertEquals(expected, wallet.toString());
	}
	
	@Test
	void getCreditTEST() {
		Wallet wallet = new Wallet(0.5f);
		wallet.getCredit(0.5f);
		assertEquals(0.0f, wallet.getCredit(0.5f));
	}
	
	@Test
	void getAllCreditTEST() {
		Wallet wallet = new Wallet(0.5f);
		wallet.getAllCredit();
		assertEquals(0.5f, wallet.getAllCredit());
	}
	
	@Test
	void getBrandTEST() {
		Wallet wallet = new Wallet("Tesco Value",0.5f);
		wallet.getBrand();
		assertEquals("Tesco Value",wallet.getBrand());
	}
	
	@Test
	void setCreditTEST() {
		Wallet wallet = new Wallet("Tesco Value",0.5f);
		wallet.setCredit(1.5f);
		assertEquals(1.5f,wallet.getAllCredit());
	}
	
	@Test
	void setBrandTEST() {
		Wallet wallet = new Wallet("Tesco Value",0.5f);
		wallet.setBrand("Tesco Finest");
		assertEquals("Tesco Finest", wallet.getBrand());
	}
}
