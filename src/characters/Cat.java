package characters;

public class Cat extends Character{

	// state variable
	public Boolean pullPowerOrNot;

	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("��ٴٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			System.out.println("���...��....");
		}
	}

	public void eat() {
		System.out.println("�ȳȳȳȳȳȳ�");
	}
	
	public void grooming() {
		System.out.println("������������");
	}
}