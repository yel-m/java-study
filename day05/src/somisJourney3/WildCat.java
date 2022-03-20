package somisJourney3;

public class WildCat {

	public String NAME = "³É¾ÆÄ¡";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("¿ì´Ù´Ù´Ù´Ù´Ù");
		} else {
			printLogWithName("¿ì´Ù...´Ù");
		}
	}
	
	public void eat() {
		printLogWithName("³È³È³È³È³È³È");
	}
	
	public void grooming() {
		printLogWithName("½ºÀ¹½ºÀ¹½ºÀ¹");
	}
	
	// ³É¾ÆÄ¡ °íÀ¯ÀÇ ½ºÅ³µé
	public void powerFingerNail() {
		printLogWithName("ÃÊ°­·Â ¼ÕÅé!");
	}
	
	public void powerFootNail() {
		printLogWithName("ÃÊ°­·Â ¹ßÅé!");
	}
	
	public void yarn() {
		printLogWithName("ÇÏ¾Ç~!");
	}
}
