package weapon;

public class WeaponFactory {
	public static void main(String[] args) {
		
		// 소미 전용 무기
		MagicFoundation magicFoundation = new MagicFoundation("WHITE");
		System.out.println("magicFoundation 색상 : " + magicFoundation.color); // magicFoundation 클래스에서 color 변수 가져오기
		System.out.println("magicFoundation 타입 : " + magicFoundation.foundationType);
		
		// 똑냥이 전용 무기
		SensitiveGlasses sensitiveGlasses = new SensitiveGlasses("BLACK");
		System.out.println("sensitiveGlasses 색상 : " + sensitiveGlasses.color);
		
		// 냥아치 전용 무기
		PowerGlove powerGlove = new PowerGlove("BLUE");
		System.out.println("powerGlove 색상 : " + powerGlove.color);
		
		// 냥쓸이 전용 무기
		CasinoChips casinoChips = new CasinoChips("RED");
		System.out.println("casinoChips 색상 : " + casinoChips.color);
		
		// 켓초딩 전용 무기
		LightSchoolBag lightSchoolBag = new LightSchoolBag("YELLOW");
		System.out.println("lightSchoolBag 색상 : " + lightSchoolBag.color);
	}
	
	

}
