package somisJourney3;

public class Bbuggu {
	public String NAME = "�Ѳ�";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��������");
			pullPowerOrNot = false;
		} else {
			printLogWithName("����..����");
		}
	}
		
		public void eat() {
			printLogWithName("�ȳȳȳȳ�");
		}
		
		public void bornAttack() {
			printLogWithName("���ٱ� ����!");
		}
		
		public void bodyShot() {
			printLogWithName("���� ��ġ��!");
		}
		
		public void dogUpperCut() {
			printLogWithName("�۸۾�����!");
		}
		
		public void dogSideKick() {
			printLogWithName("�۸� ������!");
		}
	}
	



