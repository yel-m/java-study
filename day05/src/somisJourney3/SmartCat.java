package somisJourney3;

public class SmartCat {

	public String NAME = "똑냥이";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
		}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("우다다다다다");
			pullPowerOrNot = false;
		} else {
			printLogWithName("우다다..다");
		}
	}
		
		public void eat() {
			printLogWithName("냠냠냠냠냠냠");
		}
		
		public void grooming() {
			printLogWithName("스윽스윽스윽");
		}
		
		// 똑냥이 고유의 스킬
		public void seeDeeply() {
			printLogWithName("간파하기!");
		}
		
		public void research() {
			printLogWithName("연구하기!");
		}
		
		public void powerConcentrate() {
			printLogWithName("집중하기!");
		}
	}

