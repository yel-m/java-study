package somisJourney3;

public class HealingCat {

	public String NAME = "Èú³ÉÀÌ";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("¿ì´Ù´Ù´Ù´Ù");
			pullPowerOrNot = false;
		} else {
			printLogWithName("¿ì´Ù..´Ù..");
		}
	}
	
	public void eat() {
		printLogWithName("³È³È³È³È³È³È");
	}
	
	public void grooming() {
		printLogWithName("½ºÀ¹½ºÀ¹½ºÀ¹");
	}
	
	//Èú³ÉÀÌ °íÀ¯ÀÇ ½ºÅ³µé
	public void heal() {
		printLogWithName("Ä¡·áÇÏ±â!");
	}
	
	public void healAllPartner() {
		printLogWithName("¸ðµç µ¿·áµé Ä¡·áÇÏ±â!");
	}
	
}
