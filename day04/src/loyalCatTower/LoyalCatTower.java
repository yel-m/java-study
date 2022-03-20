package loyalCatTower;

public class LoyalCatTower {
	
	static Integer LOYAL_CAT_TOWER_FLOOR = 5;
	
	static Integer WANT_BUDDY_CNT = 4;
	static Integer HOUR = 12;
	
	static String MY_CAT_NAME = "�ҹ�";
	static String FIRST_BUDDY_NAME = "�ɾ���";
	static String SECOND_BUDDY_NAME = "�ȳ���";
	static String THIRD_BUDDY_NAME = "�ɾ�ġ";
	static String FOURTH_BUDDY_NAME = "���ʵ�";
	static String FIFTH_BUDDY_NAME = "������";
	
	//////////////////////////////////////////////
	
	public static void printSimpleLog(String log) {
		System.out.println(log);
	}
	public static void invokeBuddyInfo(String name, String bio) {
		printSimpleLog("�̸� : " + name);
		printSimpleLog("���� : " + bio);
	}
	public static void invokeBuddyAction(String buddyName) {
		printSimpleLog(buddyName + "��(��) ���ᰡ �Ǿ����ϴ�.");
	}
	public static String getRecruitmentSentence() {
		return "�� ���ᰡ ���� �ʰڳ�?";
	}
	
	/////////////////////////////////////////////

	public static void findBuddyOnTheFirstFloor() {
		Integer givenTime = HOUR / 4;
		
		for(Integer i = 0; i <= givenTime; i++) {
			
			if(i == 2) {
				printSimpleLog("");
				printSimpleLog("�������� �����̴� �ҹ�, ���ڳ� ����� '�ɾ���'�� ������ �˴ϴ�.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "��..! �ʴ�...!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(FIRST_BUDDY_NAME);
				invokeBuddyInfo(FIRST_BUDDY_NAME, "�ڱ����� ��Ȳ�� �ſ� �����ϰ�(����) �ǳ� �򸣸� �ɰ� ������ �Ѵ�.");
				printSimpleLog("");
				printSimpleLog(i + "�ð�°�� ���Ḧ ã������, �������� �ö󰩴ϴ�.");
				printSimpleLog("");
				
				break;
			} else {
				printSimpleLog("");
				printSimpleLog((i+1) + "�ð�° ã�� ��...");
				printSimpleLog("");
			}
		}
		
	}
	
	public static void findBuddyOnTheSecondFloor() {
		Integer givenTime = HOUR / 4;
		
		for(Integer i = 0; i <= givenTime; i++) {
			if(i == 3) {
				printSimpleLog("");
				printSimpleLog("�ɾظ۽� ī�並 �����̴� �ҹ�, �İ� ����� '�ȳ���'�� ������ �˴ϴ�.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "��..! �ʴ�..!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(SECOND_BUDDY_NAME);
				invokeBuddyInfo(SECOND_BUDDY_NAME, "���ڰ��� + ��ǻ�� ���� ���� ���� �� �ٸ�Ʈ. �ǳ� ���θ� �ؿ�.");
				printSimpleLog("");
				printSimpleLog(i + "�ð�°�� ���Ḧ ã������, �������� �ö󰩴ϴ�.");
				printSimpleLog("");
				
				break;
			} else {
				printSimpleLog("");
				printSimpleLog((i+1) +"�ð�° ã�� ��...");
				printSimpleLog(""); 
			}
		}
	}
	
	public static void findBuddyOnTheThirdFloor() {
		Integer givenTime = HOUR / 4;
		
		for(Integer i = 0; i <= givenTime; i++) {
			if(i == 1) {
				printSimpleLog("");
				printSimpleLog("�ް���� �����̴� �ҹ�, �ް�� ����� '�ɾ�ġ'�� ������ �˴ϴ�.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "��...! �ʴ�...!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(THIRD_BUDDY_NAME);
				invokeBuddyInfo(THIRD_BUDDY_NAME, "����� �����⿡ ��ġ�� ū ������ ���̿���.");
				printSimpleLog("");
				printSimpleLog(i + "�ð�°�� ���Ḧ ã������, �������� �ö󰩴ϴ�.");
				printSimpleLog("");
				
				break;
			} else {
				printSimpleLog("");
				printSimpleLog((i+1) + "�ð�° ã�� ��...");
				printSimpleLog("");
			}
		}
		
		
	}
	
	public static void findBuddyOnTheFourthFloor() {
		Integer givenTime = HOUR / 4;
		
		for(Integer i = 0; i <= givenTime; i++) {
			if(i == 2) {
				printSimpleLog("");
				printSimpleLog("���̵����� �����̴� �ҹ�, ������ ����� '���ʵ�'�� ������ �˴ϴ�.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "��..! �ʴ�..!!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(FOURTH_BUDDY_NAME);
				invokeBuddyInfo(FOURTH_BUDDY_NAME, "�Ʊ� ����̿���.");
				printSimpleLog("");
				printSimpleLog(i + "�ð�°�� ���Ḧ ã������, �������� �ö󰩴ϴ�.");
				printSimpleLog("");
				break;
			} else {
				printSimpleLog("");
				printSimpleLog((i+1) + "�ð�° ã����...");
				printSimpleLog("");
			}
		}
	}
	
	public static void findBuddyOnTheFifthFloor() {
		Integer givenTime = HOUR / 4;
		
		for(Integer i = 0; i <= givenTime; i++) {
			if(i == 2) {
				printSimpleLog("");
				printSimpleLog("������ �����̴� �ҹ�, ���� ����� '������'�� ������ �˴ϴ�.");
				printSimpleLog("");
				printSimpleLog(MY_CAT_NAME + " : " + "��..! �ʴ�...!");
				
				//
				printSimpleLog(MY_CAT_NAME + " : " + getRecruitmentSentence());
				invokeBuddyAction(FIFTH_BUDDY_NAME);
				invokeBuddyInfo(FIFTH_BUDDY_NAME, "�ǻ������ ����Ʈ ���� ���� ������̰� ������ �ο� ��¼������ ���մϴ�.");
				printSimpleLog("");
				printSimpleLog(i + "�ð�°�� ���Ḧ ã������, �������� �ö󰩴ϴ�.");
				printSimpleLog("");
				
				break;
			} else {
				printSimpleLog("");
				printSimpleLog((i+1) + "�ð�° ã�� ��...");
				printSimpleLog("");
				
			}
		}
	}
	
	/////////////////////////////////////////////////
	
	public static void main(String[] args) {


		switch(LOYAL_CAT_TOWER_FLOOR) {
			case 1 :
				findBuddyOnTheFirstFloor();
				break;
			case 2 :
				findBuddyOnTheSecondFloor();
				break;
			case 3 : 
				findBuddyOnTheThirdFloor();
				break;
			case 4 :
				findBuddyOnTheFourthFloor();
				break;
			case 5 : 
				findBuddyOnTheFifthFloor();
				break;
			default : 
				System.out.println("���� ����� �׸� ã�Ƶ� �� �� ���ٳ�");
				
		}
		

	}

}
