package somisJourney3;

public class Duchi {
	
	public String NAME = "µÎÄ¡";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("»þ»þ»þ¼¡");
			pullPowerOrNot = false;
		} else {
			printLogWithName("»þ¼¡.. »þ¼¡..");
		}
	}
	
	public void eat() {
		printLogWithName("³È³È³È³È³È³È");
	}
	
	// µÎÄ¡ °íÀ¯ÀÇ ½ºÅ³µé
	public void bornAttack() {
		printLogWithName("»À´Ù±Í °ø°Ý!");
		
	}
	
	public void bodyShot() {
		printLogWithName("¸öÅë ¹ÚÄ¡±â!");
	}
	
	public void dogPunch() {
		printLogWithName("¸Û¸ÛÆÝÄ¡!");
	}
	
	public void dogBackKick() {
		printLogWithName("¸Û¸Û µÚµ¹·ÁÂ÷±â!");
	}

}
