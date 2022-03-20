package somisJourney3;

public class Somi {

	public String NAME = "¼Ò¹Ì";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("¿ì´Ù´Ù´Ù´Ù");
			pullPowerOrNot = false;
		} else {
			printLogWithName("¿ì´Ù...´Ù....");
		}
	}
	
	public void eat() {
		printLogWithName("³È³È³È³È³È");
	}
	
	public void grooming() {
		printLogWithName("½ºÀ¹½ºÀ¹½ºÀ¹");
	}
	
	// ¼Ò¹Ì °íÀ¯ÀÇ ½ºÅ³µé

	public void ask() {
		printLogWithName("ºÎÅ¹ÇÑ´Ù³É~");
	}
	
	public void avoid() {
		printLogWithName("36°è ÁÙÇà·®ÀÌ´Ù³É~!");
	}
	
	public void punch() {
		printLogWithName("³É³ÉÆÝÄ¡!");
	}
	
	public void wrapTail() {
		printLogWithName("²¿¸®°¨±â!");
	}
}
