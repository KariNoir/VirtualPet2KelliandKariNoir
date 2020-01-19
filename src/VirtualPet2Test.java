import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class VirtualPet2Test {
	/*
	 * virtual pet will have hunger (start at 0) thirst (star at 0) boredom (start
	 * at 10)
	 *
	 */
	// arrange - instantiate that object
	// pull from VirtualPet2 class - the cookie cutter
	// can live up here because it's global
	// Class is VirtualPet2 - instance variable
//	private String petName = "Bob";
//	private String petDescription = "little and cute!";
//	
	VirtualPet2 underTest = new VirtualPet2(); // calling default constructor
	@Test
	public void hungerShouldBe0AtStart() {
		// act
		int result = underTest.getHunger(); // makes a method in VP2 class
		// assert
		assertEquals(0, result);
	}
	@Test
	public void hungerShouldDecreaseBy1AfterEat() {
		// act
		int beforeEat = underTest.getHunger();
		underTest.eat(); // void - just eats
		int result = underTest.getHunger();
		// assert
		assertEquals(beforeEat - 1, result);
	}
	@Test
	public void thirstShouldBe0AtStart() {
		// act
		int result = underTest.getThirst(); // makes a method in VP2 class
		// assert
		assertEquals(0, result);
	}
	@Test
	public void thirstShouldDecreaseBy1AfterDrink() {
		// act
		int beforeDrink = underTest.getThirst();
		underTest.drink(); // void - just eats
		int result = underTest.getThirst();
		// assert
		assertEquals(beforeDrink - 1, result);
	}
	@Test
	public void boredomShouldBe0AtStart() {
		// act
		int result = underTest.getBoredom(); // makes a method in VP2 class
		// assert
		assertEquals(0, result);
	}
	@Test
	public void boredomShouldDecreaseBy1AfterPlay() {
		// act
		int beforePlay = underTest.getBoredom();
		underTest.play(); // void - just eats
		int result = underTest.getBoredom();
		// assert
		assertEquals(beforePlay - 1, result);
	}
	@Test
	public void boredomShouldIncreaseBy1AfterTick() {
		// Act
		int beforePlay = underTest.getBoredom();
		underTest.tick();
		int result = underTest.getBoredom();
		assertEquals(beforePlay + 1, result);
	}
	@Test
	public void thirstShouldIncreaseBy1AfterTick() {
		// Act
		int beforeDrink = underTest.getThirst();
		underTest.tick();
		int result = underTest.getThirst();
		assertEquals(beforeDrink + 1, result);
	}
	@Test
	public void hungerShouldIncreaseBy1AfterTick() {
		// Act
		int beforeEat = underTest.getHunger();
		underTest.tick();
		int result = underTest.getHunger();
		// assert
		assertEquals(beforeEat + 1, result);
	}
	@Test
	public void shouldReturnBobAndLittleAndCuteOnInitialization() {
		//arrange
		VirtualPet2 petBio = new VirtualPet2("Bob", "little and cute!");
		//act
		String petName = petBio.getPetName();
		String petDescription = petBio.getPetDescription();
		//assert
		assertEquals("Bob", petName);
		assertEquals("little and cute!", petDescription);
	}
	@Test
	public void shouldReturnFluffyAndTiredOnInitialization() {
		//arrange
		VirtualPet2 petBio = new VirtualPet2("Fluffy", "Tired");
		//act
		String petName = petBio.getPetName();
		String petDescription = petBio.getPetDescription();
		//assert
		assertEquals("Fluffy", petName);
		assertEquals("Tired", petDescription);
	}
	@Test
	public void shouldReturnDefaultValues() {
		//return name, description, hunger, thirst, and boredom
		//arrange
		VirtualPet2 fullPet = new VirtualPet2("Fluffy", "Tired", 2, 3, 4);
		//act
		String petName = fullPet.getPetName();
		String petDescription = fullPet.getPetDescription();
		int petHunger = fullPet.getHunger();
		int petThirst = fullPet.getThirst();
		int petBoredom = fullPet.getBoredom();
		//assert
		assertEquals("Fluffy", petName);
		assertEquals("Tired", petDescription);
		assertEquals(2, petHunger);
		assertEquals(3, petThirst);
		assertEquals(4, petBoredom);
	}
}

