package overLoading;

public class SmallMac extends HamBurger{
	
	SmallMac() {
		this.bun = new Bun();
		this.lettuce = new Lettuce();
		this.tomato = new Tomato();
		this.cheese = new Cheese();
		this.onion = new Onion();
		this.patty = new Patty();
	}
	
	public void setIngredeints(String lettuceType, String tomatoType) {
		this.lettuce.type = lettuceType;
		this.tomato.type = tomatoType;
	}
	
	public void setIngredients(String lettuceType, String tomatoType, String cheeseType) {
		this.lettuce.type = lettuceType;
		this.tomato.type = tomatoType;
		this.cheese.type = cheeseType;
	}

	public void setIngredients(String lettuceType, String tomatoType, String cheeseType, String onionType) {
		this.lettuce.type = lettuceType;
		this.tomato.type = tomatoType;
		this.cheese.type = cheeseType;
		this.onion.type = onionType;
	}

	
	public void setIngredients(String lettuceType, String tomatoType, String cheeseType, String onionType, String pattyType) {
		this.lettuce.type = lettuceType;
		this.tomato.type = tomatoType;
		this.cheese.type = cheeseType;
		this.onion.type = onionType;
		this.patty.type = pattyType;
	}
}
