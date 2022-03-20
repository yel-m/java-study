package somisJourney4;

public class Cat {
	// state variable
	public Boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("¿ì´Ù´Ù´Ù´Ù");
			pullPowerOrNot = false;
		} else {
			System.out.println("¿ì´Ù´Ù...´Ù´Ù..");
		}
	}
	
	public void eat() {
		System.out.println("³È³È³È³È³È³È");
	}
	
	public void grooming() {
		System.out.println("½ºÀ¹½ºÀ¹½ºÀ¹");
	}

}
