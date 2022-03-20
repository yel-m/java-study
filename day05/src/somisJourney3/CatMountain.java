package somisJourney3;

public class CatMountain {
	
	public static void attackCatMountain(BigPowerRock bigPowerRock) {
		bigPowerRock.attacked(); // 공격하고..
		bigPowerRock.printRockHP(bigPowerRock.getRockHP()); // 남아있는 HP 출력하고..
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정의한 클래스를 사용하려면 메모리 위에 올려야 합니다. 
		// 클래스를 메모리 위에 올리는 게 -> 객체화(인스턴스화)
		
		// 바위
		BigPowerRock bigPowerRock = new BigPowerRock();
		
		// 강아지 친구들 인스턴스화
		Bbuggu bbuggu = new Bbuggu();
		Duchi duchi = new Duchi();
		
		// 고양이 친구들 인스턴스화
		Somi somi = new Somi();
		SmartCat smartCat = new SmartCat();
		WildCat wildCat = new WildCat();
		GamblingCat gamblingCat = new GamblingCat();
		YoungCat youngCat = new YoungCat();
		HealingCat healingCat = new HealingCat();
		
		// 공격 시작
		
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
		// 뿌꾸 공격 끝
		
		// 두치 공격 시작
		duchi.bodyShot();
		attackCatMountain(bigPowerRock);
		
		duchi.bornAttack();
		attackCatMountain(bigPowerRock);
		
		duchi.dogBackKick();
		attackCatMountain(bigPowerRock);
		
		duchi.dogPunch();
		attackCatMountain(bigPowerRock);
		
		// 바위의 상태를 한 번 체크합니다.
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
		// 소미 공격 끝
		
		// 똑냥이 공격 시작
		smartCat.powerConcentrate();
		smartCat.seeDeeply();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		// 똑냥이 공격 끝
		
		// 냥아치 공격 시작
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		attackCatMountain(bigPowerRock);
		// 냥아치 공격 끝
		
		// 바위의 상태를 한 번 더 체크합니다.
		bigPowerRock.printRockState();
		
		
		
	}

}
