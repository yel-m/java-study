package somisJourney3;

public class BigPowerRock {

	// 바위의 상태
	public String rockState = "PHASE5";
	
	// 바위의 피
	public Integer rockHP = 100;
	
	// 바위의 상태 set
	public void setRockState(String rockState) {
		this.rockState = rockState;
	}
	
	// 바위의 상태 get
	public String getRockState() {
		return rockState;
	}
	
	// 바위의 피 set
	public void setRockHP(Integer rockHP) {
		this.rockHP = rockHP;
	}
	
	// 바위의 피 minus
	public void minusRockHP(Integer minusValue) {
		this.rockHP = rockHP - minusValue;
	}
	
	public Integer getRockHP() {
		return rockHP;
	}
	
	public void printRockHP(Integer rockHP) {
		System.out.println("=======================");
		System.out.println("바위의 HP는 " + getRockHP() + " 입니다.");
		System.out.println("=======================");
	}
	
	public void printRockState() {
		System.out.println("=======================");
		System.out.println("바위의 상태는 " + getRockState() + " 입니다.");
		System.out.println("=======================");
	}
	
	public void attacked() {
		
		// 공격을 당할 때마다 체력이 1씩 깍입니다.
		minusRockHP(1);
		

		if(rockHP >= 80) {
			//최상
			setRockState("PHASE5");
		} else if (rockHP >= 60) {
			//상
			setRockState("PHASE4");
		} else if (rockHP >= 40) {
			//중
			setRockState("PHASE3");
		} else if (rockHP >= 20) {
			//하
			setRockState("PHASE2");
		} else if (rockHP >= 0) {
			//최하
			setRockState("PHASE1");
		}
	}
}
