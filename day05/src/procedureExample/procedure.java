package procedureExample;

public class procedure {
	
	public static void printLog(String message) {
		System.out.println(message);
	}
	
	public static void walkingOnTheRoad(String catName) {
		printLog(catName + "��(��) �� ���� �Ȱ� �ֽ��ϴ�.");
	}
	
	public static void detectCanOnTheRoad(String catName, String canName) {
		printLog(catName + "(��)�� " + canName + "��(��) �߰��Ͽ����ϴ�.");
		
	}
	
	public static void eatingTunaInTheCan(String canName) {
		printLog(canName + "(��)�� �Դ� ���Դϴ�... �ȇ���~");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		walkingOnTheRoad("�ҹ�");
		detectCanOnTheRoad("�ҹ�", "�����ĵ");
		eatingTunaInTheCan("�����ĵ");
		walkingOnTheRoad("�ҹ�");

	}

}
