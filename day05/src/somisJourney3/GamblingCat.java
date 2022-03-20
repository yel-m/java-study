package somisJourney3;

public class GamblingCat {

	public String NAME = "≥…æµ¿Ã";
	
	public Boolean pullPowerOrNot;
	
	public void printLogWithName(String log) {
		System.out.println(NAME + " : " + log);
	}
	
	public void runAway() {
		if(pullPowerOrNot) {
			printLogWithName("øÏ¥Ÿ¥Ÿ¥Ÿ¥Ÿ¥Ÿ");
			pullPowerOrNot = false;
		} else {
			printLogWithName("øÏ¥Ÿ..¥Ÿ..");
		}
	}
		
		public void eat() {
			printLogWithName("≥»≥»≥»≥»≥»");
		}
		
		public void grooming() {
			printLogWithName("Ω∫¿πΩ∫¿πΩ∫¿π");
		}
		
		// ≥…æµ¿Ã ∞Ì¿Ø¿« Ω∫≈≥µÈ
		
		public void toGamble() {
			printLogWithName("∫£∆√«œ±‚!");
		}
		
		public void allIn() {
			printLogWithName("ø√¿Œ!");
		}
		
		public void fakeHand() {
			printLogWithName("πÿ¿Âª©±‚!");
		}
	}

