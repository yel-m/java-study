package somisJourney3;

public class Bbuggu {
	public String NAME = "»Ñ²Ù";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("»þ»þ»þ»è");
			pullPowerOrNot = false;
		} else {
			printLogWithName("»þ»þ..»þ¼¡");
		}
	}
		
		public void eat() {
			printLogWithName("³È³È³È³È³È");
		}
		
		public void bornAttack() {
			printLogWithName("»À´Ù±Í °ø°Ý!");
		}
		
		public void bodyShot() {
			printLogWithName("¸öÅë ¹ÚÄ¡±â!");
		}
		
		public void dogUpperCut() {
			printLogWithName("¸Û¸Û¾îÆÛÄÆ!");
		}
		
		public void dogSideKick() {
			printLogWithName("¸Û¸Û ¿·Â÷±â!");
		}
	}
	



