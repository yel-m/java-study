package somisJourney4;

public class Dog extends Character{
	
	// state variable
	public Boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("����������");
			pullPowerOrNot = false;
		} else {
			System.out.println("����..����...");
		}
	}
	
	public void eat() {
		System.out.println("�ȳȳȳȳȳȳ�");
	}

}
