package SomisJourney;

public class SomisJourney {
	
	public static void invokeSkill(String catName, String skillName) {
		System.out.println(catName + " : " + skillName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String catName = "�ҹ�";
		String catMajorSkillName = "�ɳ���ġ";
		String catAdditionalSkillName = "��������";
		
		Integer dogGroupcnt;
		
		String middleDogBossName = "��ġ";
		String middleDogBossMajorSkillName = "�����ġ��";
		
		String lastDogBossName = "�Ѳ�";
		String lastDogBossMajorSkill = "���� ��ġ��";
		
		//1. ����� ���� ������ �� �ҹ�, �������̸� ����ϱ� ���� ������ �����մϴ�. 
		Boolean isVallyAroundHere = true;
		//2. ���� �ֺ��� �ó����� �ִٸ�? -> ������ ����մϴ�.
		if(isVallyAroundHere) {
			Integer fishCnt = 10;
			
			//3. ���� ����Ⱑ 5�� �̻��̸�? -> �ó��� ������ �پ��ϴ�.
			if(fishCnt >= 5) {
				
				Integer wholeCatchedFishCnt = 0;
				
				//4. 
				invokeSkill(catName, catAdditionalSkillName);
				System.out.println("����� �� ������ ȹ���ϼ̽��ϴ�.");
				wholeCatchedFishCnt = wholeCatchedFishCnt + 1;
				
				invokeSkill(catName, catAdditionalSkillName);
				System.out.println("����� �� ������ ȹ���ϼ̽��ϴ�.");
				wholeCatchedFishCnt = wholeCatchedFishCnt + 1;
				
				invokeSkill(catName, catAdditionalSkillName);
				System.out.println("����� �� ������ ȹ���ϼ̽��ϴ�.");
				wholeCatchedFishCnt = wholeCatchedFishCnt + 1;
				
				// 5. ���� ���� ����Ⱑ 3 ���� �̻��̸�?
				if(wholeCatchedFishCnt >= 3) {
					
					//
					Integer normalFishCnt = 2;
					Integer abNormalFishCnt = 1;
					
					// 6. ���� �������� ����Ⱑ 1���� �̻��̰�, ���������� ����Ⱑ 1���� ���϶��?
					if(normalFishCnt >= 1 && abNormalFishCnt <= 1) {
						
						System.out.println("");
						System.out.println("���� ���� ��...");
						
						// ���ڱ�, ������ �аŸ����� �����մϴ�.
						
						System.out.println("");
						System.out.println("������ �аŸ� : �ʰ� ���� ������ ��� ������. �츮���� ������ �аŸ���.");
						System.out.println("");
						
						Integer dogsCnt = 4;
						
						if(dogsCnt >= 5) {
							System.out.println(catName + " : " + "�������� ����ٳɤФ�");
						} else {
							// 7. �ַ� ��ų�� 4�� ������ �аŸ��鿡�� �����մϴ�.
							System.out.println(catName + " : " + "���� �� �Ե� ���Ծ��µ� ���� �Ҹ���? �����ض��...!!!");
							
							invokeSkill(catName, catMajorSkillName);
							invokeSkill(catName, catMajorSkillName);
							invokeSkill(catName, catMajorSkillName);
							invokeSkill(catName, catMajorSkillName);
							
							//
							System.out.println("");
							System.out.println(middleDogBossName + " : " + "��... �ܿ� �� �����ΰ�?");
							System.out.println(middleDogBossName + " : " + middleDogBossMajorSkillName + "!!!");
							
							System.out.println("������...!!!!!");
							
							// TODO to be continue...
					
						}
						
					} else {
						System.out.println("");
						System.out.println(catName + " : " + "����ü �̰� ��� ������°ų�?");
					}
					
				} else {
					System.out.println(catName + " : " + "���� �⺰�� �Ȱ��ٳ�");
				}
				
				
			} else {
			//3. ���� ����Ⱑ 4�� ���϶��? -> ����Ⱑ ���� ���� �پ�� �� �����ϴ�.
				System.out.println(catName + " : " + "����Ⱑ ���� �� �پ�� ���� ���ٳ�");
			}
		}
		//2.  ���� �ֺ��� �ó����� ���ٸ�? -> ������ �����մϴ�.
		else {
			System.out.println(catName + " : " + "���� ���� �ִ� ���� ã�ƾ� �ȴٳ�");
		}
		

		

	}

}
