package somisJourney3;

public class WildCat {

	public String NAME = "�ɾ�ġ";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��ٴٴٴٴ�");
		} else {
			printLogWithName("���...��");
		}
	}
	
	public void eat() {
		printLogWithName("�ȳȳȳȳȳ�");
	}
	
	public void grooming() {
		printLogWithName("������������");
	}
	
	// �ɾ�ġ ������ ��ų��
	public void powerFingerNail() {
		printLogWithName("�ʰ��� ����!");
	}
	
	public void powerFootNail() {
		printLogWithName("�ʰ��� ����!");
	}
	
	public void yarn() {
		printLogWithName("�Ͼ�~!");
	}
}
