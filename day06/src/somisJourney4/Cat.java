package somisJourney4;

public class Cat {
	// state variable
	public Boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("��ٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			System.out.println("��ٴ�...�ٴ�..");
		}
	}
	
	public void eat() {
		System.out.println("�ȳȳȳȳȳ�");
	}
	
	public void grooming() {
		System.out.println("������������");
	}

}
