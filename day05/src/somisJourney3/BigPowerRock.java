package somisJourney3;

public class BigPowerRock {

	// ������ ����
	public String rockState = "PHASE5";
	
	// ������ ��
	public Integer rockHP = 100;
	
	// ������ ���� set
	public void setRockState(String rockState) {
		this.rockState = rockState;
	}
	
	// ������ ���� get
	public String getRockState() {
		return rockState;
	}
	
	// ������ �� set
	public void setRockHP(Integer rockHP) {
		this.rockHP = rockHP;
	}
	
	// ������ �� minus
	public void minusRockHP(Integer minusValue) {
		this.rockHP = rockHP - minusValue;
	}
	
	public Integer getRockHP() {
		return rockHP;
	}
	
	public void printRockHP(Integer rockHP) {
		System.out.println("=======================");
		System.out.println("������ HP�� " + getRockHP() + " �Դϴ�.");
		System.out.println("=======================");
	}
	
	public void printRockState() {
		System.out.println("=======================");
		System.out.println("������ ���´� " + getRockState() + " �Դϴ�.");
		System.out.println("=======================");
	}
	
	public void attacked() {
		
		// ������ ���� ������ ü���� 1�� ���Դϴ�.
		minusRockHP(1);
		

		if(rockHP >= 80) {
			//�ֻ�
			setRockState("PHASE5");
		} else if (rockHP >= 60) {
			//��
			setRockState("PHASE4");
		} else if (rockHP >= 40) {
			//��
			setRockState("PHASE3");
		} else if (rockHP >= 20) {
			//��
			setRockState("PHASE2");
		} else if (rockHP >= 0) {
			//����
			setRockState("PHASE1");
		}
	}
}
