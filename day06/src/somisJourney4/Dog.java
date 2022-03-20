package somisJourney4;

public class Dog extends Character{
	
	// state variable
	public Boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("»þ»þ»þ»þ¼¡");
			pullPowerOrNot = false;
		} else {
			System.out.println("»þ»þ..»þ¼¡...");
		}
	}
	
	public void eat() {
		System.out.println("³È³È³È³È³È³È³È");
	}

}
