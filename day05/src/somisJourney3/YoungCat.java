package somisJourney3;

public class YoungCat {

	public String NAME = "Ĺ�ʵ�";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��ٴٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			printLogWithName("���...��..");
		}
	}
	
	public void eat() {
		printLogWithName("�ȳȳȳȳȳ�");
	}
	
	public void grooming() {
		printLogWithName("������������");
	}
	
	//Ĺ�ʵ� ������ ��ų
	
	public void cry() {
		printLogWithName("���ƾƾƾƾƾƾ�~!");
	}
	
	
}
