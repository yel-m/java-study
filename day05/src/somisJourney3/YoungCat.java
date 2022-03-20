package somisJourney3;

public class YoungCat {

	public String NAME = "Ä¹ÃÊµù";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("¿ì´Ù´Ù´Ù´Ù´Ù");
			pullPowerOrNot = false;
		} else {
			printLogWithName("¿ì´Ù...´Ù..");
		}
	}
	
	public void eat() {
		printLogWithName("³È³È³È³È³È³È");
	}
	
	public void grooming() {
		printLogWithName("½ºÀ¹½ºÀ¹½ºÀ¹");
	}
	
	//Ä¹ÃÊµù °íÀ¯ÀÇ ½ºÅ³
	
	public void cry() {
		printLogWithName("À¸¾Æ¾Æ¾Æ¾Æ¾Æ¾Æ¾Ó~!");
	}
	
	
}
