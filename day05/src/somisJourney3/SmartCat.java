package somisJourney3;

public class SmartCat {

	public String NAME = "�ȳ���";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
		}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("��ٴٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			printLogWithName("��ٴ�..��");
		}
	}
		
		public void eat() {
			printLogWithName("�ȳȳȳȳȳ�");
		}
		
		public void grooming() {
			printLogWithName("������������");
		}
		
		// �ȳ��� ������ ��ų
		public void seeDeeply() {
			printLogWithName("�����ϱ�!");
		}
		
		public void research() {
			printLogWithName("�����ϱ�!");
		}
		
		public void powerConcentrate() {
			printLogWithName("�����ϱ�!");
		}
	}

