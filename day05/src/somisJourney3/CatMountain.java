package somisJourney3;

public class CatMountain {
	
	public static void attackCatMountain(BigPowerRock bigPowerRock) {
		bigPowerRock.attacked(); // �����ϰ�..
		bigPowerRock.printRockHP(bigPowerRock.getRockHP()); // �����ִ� HP ����ϰ�..
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ Ŭ������ ����Ϸ��� �޸� ���� �÷��� �մϴ�. 
		// Ŭ������ �޸� ���� �ø��� �� -> ��üȭ(�ν��Ͻ�ȭ)
		
		// ����
		BigPowerRock bigPowerRock = new BigPowerRock();
		
		// ������ ģ���� �ν��Ͻ�ȭ
		Bbuggu bbuggu = new Bbuggu();
		Duchi duchi = new Duchi();
		
		// ����� ģ���� �ν��Ͻ�ȭ
		Somi somi = new Somi();
		SmartCat smartCat = new SmartCat();
		WildCat wildCat = new WildCat();
		GamblingCat gamblingCat = new GamblingCat();
		YoungCat youngCat = new YoungCat();
		HealingCat healingCat = new HealingCat();
		
		// ���� ����
		
		bbuggu.bodyShot();
		attackCatMountain(bigPowerRock);
		
		bbuggu.bornAttack();
		attackCatMountain(bigPowerRock);
		
		bbuggu.dogSideKick();
		attackCatMountain(bigPowerRock);
		
		bbuggu.dogUpperCut();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		// �Ѳ� ���� ��
		
		// ��ġ ���� ����
		duchi.bodyShot();
		attackCatMountain(bigPowerRock);
		
		duchi.bornAttack();
		attackCatMountain(bigPowerRock);
		
		duchi.dogBackKick();
		attackCatMountain(bigPowerRock);
		
		duchi.dogPunch();
		attackCatMountain(bigPowerRock);
		
		// ������ ���¸� �� �� üũ�մϴ�.
		bigPowerRock.printRockState();
		
		somi.punch();
		somi.wrapTail();
		somi.punch();
		somi.wrapTail();
		somi.wrapTail();
		somi.wrapTail();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		// �ҹ� ���� ��
		
		// �ȳ��� ���� ����
		smartCat.powerConcentrate();
		smartCat.seeDeeply();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		// �ȳ��� ���� ��
		
		// �ɾ�ġ ���� ����
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		// �ɾ�ġ ���� ��
		
		// ������ ���¸� �� �� �� üũ�մϴ�.
		bigPowerRock.printRockState();
		
		
		
	}

}
