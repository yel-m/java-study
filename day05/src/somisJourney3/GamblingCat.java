package somisJourney3;

public class GamblingCat {

	public String NAME = "�ɾ���";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��ٴٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			printLogWithName("���..��..");
		}
	}
		
		public void eat() {
			printLogWithName("�ȳȳȳȳ�");
		}
		
		public void grooming() {
			printLogWithName("������������");
		}
		
		// �ɾ��� ������ ��ų��
		
		public void toGamble() {
			printLogWithName("�����ϱ�!");
		}
		
		public void allIn() {
			printLogWithName("����!");
		}
		
		public void fakeHand() {
			printLogWithName("���廩��!");
		}
	}

