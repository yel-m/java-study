package SomisJourney2;

public class SomisJourney2 {
	
	public static void invokeSkill(String catName, String skillName) {
		System.out.println(catName + " : " + skillName);
	}

	public static void main(String[] args) {
		
		String catName = "�ҹ�";
		String catMajorSkillName = "�ɳ���ġ";
		String catAdditionalSkillName = "��������";
		
		Integer dogGroupCnt;
		
		String middleDogBossName = "��ġ";
		String middleDogBossMajorSkill = "�����ġ��";
		
		String lastDogBossName = "�Ѳ�";
		String lastDogBossMajorSkill = "�����ġ��";
		
		System.out.println("");
		System.out.println(lastDogBossName + " : " + "�� ������ ���⿡ �ֱ���.. ����, ������ �� ���ȱ���... ������ ���� ���������.");
		System.out.println("");
		
		System.out.println(lastDogBossName + " : " + lastDogBossMajorSkill);
		
		////////////////////////////////////////////////////
		
		System.out.println("");
		System.out.println(catName + " : " + "��... �ܿ� �� ������?");
		System.out.println("");
		
		for(Integer i = 0; i <= 15; i++) {
			invokeSkill(catName, catMajorSkillName);
		}
		
		System.out.println("");
		System.out.println("�н�");
		System.out.println("");
		
		System.out.println(lastDogBossName + "�� ���������ϴ�.");
		
	}
	

}
