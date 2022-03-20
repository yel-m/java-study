package SomisJourney;

public class SomisJourney {
	
	public static void invokeSkill(String catName, String skillName) {
		System.out.println(catName + " : " + skillName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String catName = "소미";
		String catMajorSkillName = "냥냥펀치";
		String catAdditionalSkillName = "꼬리감기";
		
		Integer dogGroupcnt;
		
		String middleDogBossName = "두치";
		String middleDogBossMajorSkillName = "몸통박치기";
		
		String lastDogBossName = "뿌꾸";
		String lastDogBossMajorSkill = "몸통 박치기";
		
		//1. 고양이 별로 여행을 간 소미, 생선구이를 사수하기 위한 여행을 시작합니다. 
		Boolean isVallyAroundHere = true;
		//2. 만약 주변에 시냇물이 있다면? -> 여행을 계속합니다.
		if(isVallyAroundHere) {
			Integer fishCnt = 10;
			
			//3. 만약 물고기가 5개 이상이면? -> 시냇물 속으로 뛰어듭니다.
			if(fishCnt >= 5) {
				
				Integer wholeCatchedFishCnt = 0;
				
				//4. 
				invokeSkill(catName, catAdditionalSkillName);
				System.out.println("물고기 한 마리를 획득하셨습니다.");
				wholeCatchedFishCnt = wholeCatchedFishCnt + 1;
				
				invokeSkill(catName, catAdditionalSkillName);
				System.out.println("물고기 두 마리를 획득하셨습니다.");
				wholeCatchedFishCnt = wholeCatchedFishCnt + 1;
				
				invokeSkill(catName, catAdditionalSkillName);
				System.out.println("물고기 세 마리를 획득하셨습니다.");
				wholeCatchedFishCnt = wholeCatchedFishCnt + 1;
				
				// 5. 만약 잡힌 물고기가 3 마리 이상이면?
				if(wholeCatchedFishCnt >= 3) {
					
					//
					Integer normalFishCnt = 2;
					Integer abNormalFishCnt = 1;
					
					// 6. 만약 정상적인 물고기가 1마리 이상이고, 비정상적인 물고기가 1마리 이하라면?
					if(normalFishCnt >= 1 && abNormalFishCnt <= 1) {
						
						System.out.println("");
						System.out.println("생선 굽는 중...");
						
						// 갑자기, 강아지 패거리들이 등장합니다.
						
						System.out.println("");
						System.out.println("강아지 패거리 : 너가 가진 생선을 모두 내놔라. 우리들은 강아지 패거리다.");
						System.out.println("");
						
						Integer dogsCnt = 4;
						
						if(dogsCnt >= 5) {
							System.out.println(catName + " : " + "분하지만 후퇴다냥ㅠㅠ");
						} else {
							// 7. 주력 스킬을 4번 강아지 패거리들에게 시전합니다.
							System.out.println(catName + " : " + "아직 한 입도 못먹었는데 무슨 소리냥? 각오해라냥...!!!");
							
							invokeSkill(catName, catMajorSkillName);
							invokeSkill(catName, catMajorSkillName);
							invokeSkill(catName, catMajorSkillName);
							invokeSkill(catName, catMajorSkillName);
							
							//
							System.out.println("");
							System.out.println(middleDogBossName + " : " + "훗... 겨우 이 정도인가?");
							System.out.println(middleDogBossName + " : " + middleDogBossMajorSkillName + "!!!");
							
							System.out.println("퍽퍽퍽...!!!!!");
							
							// TODO to be continue...
					
						}
						
					} else {
						System.out.println("");
						System.out.println(catName + " : " + "도대체 이걸 어떻게 먹으라는거냥?");
					}
					
				} else {
					System.out.println(catName + " : " + "간에 기별도 안간다냥");
				}
				
				
			} else {
			//3. 만약 물고기가 4개 이하라면? -> 물고기가 적은 곳에 뛰어들 수 없습니다.
				System.out.println(catName + " : " + "물고기가 적은 데 뛰어들 수는 없다냥");
			}
		}
		//2.  만약 주변에 시냇물이 없다면? -> 여행을 종료합니다.
		else {
			System.out.println(catName + " : " + "나는 물이 있는 곳을 찾아야 된다냥");
		}
		

		

	}

}
