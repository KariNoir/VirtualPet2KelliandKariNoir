import java.util.Scanner;

public class VirtualPet2App {
	//homework assignment

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet2 techPet = new VirtualPet2(0, 0, 0, 0);
//name your pet

		System.out.println("Hi, name your pet");
		Scanner petName = new Scanner(System.in);
		String yourpet = petName.nextLine();
	
		//start loopin'
		
		while (true) {
			
			
		System.out.println(yourpet +"'s tummy meter is on " + techPet.getHunger());
		System.out.println(yourpet +"'s fun meter is on " + techPet.getBoredom());
		System.out.println(yourpet +"'s water meter is on " + techPet.getThirst());
		System.out.println("Pick a number from 1-3.)");
		System.out.println("(1 to fed me)(2 to give me water)(3 to take me out)");
		
		
		String menuOption = input.nextLine();

		if(menuOption.contentEquals("help")) {
			printMenu();
			continue;
		}else if (menuOption.contentEquals("1")) {
			System.out.println("Yummy! This is great!");
			techPet.eat();
		}else if (menuOption.contentEquals("2")) {
			System.out.println("Thanks, that hit the spot!");
			techPet.drink();
		}else if (menuOption.contentEquals("3")) {
			System.out.println("Yummy! This is great!");
			techPet.play();
		}else {
			System.out.println("WTF! Say that again...from 1-3");
		}
		
		
		techPet.tick();
		}
	}
	
	public static void printMenu() {
		
		System.out.println("Press 1 to feed me");
		System.out.println("Press 2 to give me water");
		System.out.println("Press 3 to play with me");
		System.out.println("To see menu, type \"help\".");
	}
}