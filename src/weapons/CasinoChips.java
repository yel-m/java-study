package weapons;
public class CasinoChips {

	public String color;
	public String chipType; // BRONZE, SILVER, GOLD
	
	CasinoChips() {}
	
	CasinoChips(String color) {
		this.color = color;
		this.chipType = "BRONZE";
	}
	
	CasinoChips(String color, String chipType) {
		this.color = color;
		this.chipType = chipType;
	}
}