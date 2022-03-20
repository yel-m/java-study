package overLoading;

public class Tray {

	public static void main(String[] args) {
		SmallMac smallMac = new SmallMac();
		
		smallMac.setIngredients("RED_LEAF", "GREEN", "CHEDDAR", "GREEN_ONION", "COW");
		
		System.out.println("smallMac ingredients : " + smallMac.lettuce.getLettuceType());
		System.out.println("smallMac ingredients : " + smallMac.tomato.getTomatoType());
		System.out.println("smallMac ingredients : " + smallMac.cheese.getCheeseType());
		System.out.println("smallMac ingredients : " + smallMac.onion.getOnionType());
		System.out.println("smallMac ingredients : " + smallMac.patty.getPattyType());
		

	}

}
