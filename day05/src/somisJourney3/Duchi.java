package somisJourney3;

public class Duchi {
	
	public String NAME = "��ġ";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��������");
			pullPowerOrNot = false;
		} else {
			printLogWithName("����.. ����..");
		}
	}
	
	public void eat() {
		printLogWithName("�ȳȳȳȳȳ�");
	}
	
	// ��ġ ������ ��ų��
	public void bornAttack() {
		printLogWithName("���ٱ� ����!");
		
	}
	
	public void bodyShot() {
		printLogWithName("���� ��ġ��!");
	}
	
	public void dogPunch() {
		printLogWithName("�۸���ġ!");
	}
	
	public void dogBackKick() {
		printLogWithName("�۸� �ڵ�������!");
	}

}
