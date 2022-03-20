package weapon;

public class SensitiveGlasses {

	public String color;
	public String glassesType; //CIRCLE, TRIANGLE, SQUARE
	
	SensitiveGlasses() {}
	
	SensitiveGlasses(String color) {
		this.color = color;
		this.glassesType = "CIRCLE";
	}
	
	SensitiveGlasses(String color, String glassesType) {
		this.color = color;
		this.glassesType = glassesType;
	}
}
