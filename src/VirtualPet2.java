public class VirtualPet2 {
	private int hunger = 0; // baby bear 
	private int thirst = 0;
	private int boredom = 0;
	private String petName;
	private String petDescription;
//	 
	public VirtualPet2(String petNameParameter, String petDescriptionParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
	}
	public VirtualPet2() {
		// default constructor - was invisible before it had friends
	}
	public VirtualPet2(String petNameParameter, String petDescriptionParameter, int hungerParameter, 
			int thirstParameter, int boredomParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
		this.hunger = hungerParameter;
		this.thirst = thirstParameter;
		this.boredom = boredomParameter;
	}
	public VirtualPet2(int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
		//add to your's
	}
	public int getHunger() { //mama bear - protects the data by wrapping it in a method
		return this.hunger;
	}
	public int getThirst() {
		return this.thirst;
	}
	public int getBoredom() {
		return this.boredom;
	}
	public void eat() {
		this.hunger--; //this cookie!
		//same as this.hunger = this.hunger -1;
	}
	public void drink() {
		this.thirst--;
	}
	public void play() {
		this.boredom--;
	}
	public void tick() {
		hunger++;
		thirst++;
		boredom++;
	}
	public String getPetName() {
		return this.petName;
	}
	public String getPetDescription() {
		return this.petDescription;
	}
}
