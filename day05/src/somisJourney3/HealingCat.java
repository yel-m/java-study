package somisJourney3;

public class HealingCat {

	public String NAME = "������";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��ٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			printLogWithName("���..��..");
		}
	}
	
	public void eat() {
		printLogWithName("�ȳȳȳȳȳ�");
	}
	
	public void grooming() {
		printLogWithName("������������");
	}
	
	//������ ������ ��ų��
	public void heal() {
		printLogWithName("ġ���ϱ�!");
	}
	
	public void healAllPartner() {
		printLogWithName("��� ����� ġ���ϱ�!");
	}
	
}
