package somisJourney3;

public class Somi {

	public String NAME = "�ҹ�";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��ٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			printLogWithName("���...��....");
		}
	}
	
	public void eat() {
		printLogWithName("�ȳȳȳȳ�");
	}
	
	public void grooming() {
		printLogWithName("������������");
	}
	
	// �ҹ� ������ ��ų��

	public void ask() {
		printLogWithName("��Ź�Ѵٳ�~");
	}
	
	public void avoid() {
		printLogWithName("36�� ���෮�̴ٳ�~!");
	}
	
	public void punch() {
		printLogWithName("�ɳ���ġ!");
	}
	
	public void wrapTail() {
		printLogWithName("��������!");
	}
}
