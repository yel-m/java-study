package characters;
public class CatPlanet {

	public static void main(String[] args) {

		// �������� �ν���ȭ
		Bbuggu bbuggu = new Bbuggu();
		Duchi duchi = new Duchi();
		
		// ����̵� �ν��Ͻ�ȭ
		Somi somi = new Somi();
		SmartCat smartCat = new SmartCat();
		WildCat wildCat = new WildCat();
		GamblingCat gamblingCat = new GamblingCat();
		YoungCat youngCat = new YoungCat();
		HealingCat healingCat = new HealingCat();
		
		// �������� ��ų
		bbuggu.bodyShot();
		bbuggu.bornAttack();
		
		bbuggu.dogSideKick();
		bbuggu.dogUpperCut();
		
		duchi.bodyShot();
		duchi.bornAttack();
		
		duchi.dogBackKick();
		duchi.dogPunch();
		
		// ����̵� ��ų
		somi.punch();
		somi.wrapTail();
		
		smartCat.powerConcentrate();
		smartCat.seeDeeply();
		
		wildCat.powerFingerNail();
		wildCat.powerFootNail();
		
		gamblingCat.fakeHand();
		gamblingCat.allIn();
		
		youngCat.cry();
		
		healingCat.heal();
		healingCat.healAllPartner();
	}
}