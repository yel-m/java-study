package weapon;

public class WeaponFactory {
	public static void main(String[] args) {
		
		// �ҹ� ���� ����
		MagicFoundation magicFoundation = new MagicFoundation("WHITE");
		System.out.println("magicFoundation ���� : " + magicFoundation.color); // magicFoundation Ŭ�������� color ���� ��������
		System.out.println("magicFoundation Ÿ�� : " + magicFoundation.foundationType);
		
		// �ȳ��� ���� ����
		SensitiveGlasses sensitiveGlasses = new SensitiveGlasses("BLACK");
		System.out.println("sensitiveGlasses ���� : " + sensitiveGlasses.color);
		
		// �ɾ�ġ ���� ����
		PowerGlove powerGlove = new PowerGlove("BLUE");
		System.out.println("powerGlove ���� : " + powerGlove.color);
		
		// �ɾ��� ���� ����
		CasinoChips casinoChips = new CasinoChips("RED");
		System.out.println("casinoChips ���� : " + casinoChips.color);
		
		// ���ʵ� ���� ����
		LightSchoolBag lightSchoolBag = new LightSchoolBag("YELLOW");
		System.out.println("lightSchoolBag ���� : " + lightSchoolBag.color);
	}
	
	

}
