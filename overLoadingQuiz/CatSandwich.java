package overLoadingQuiz;

public class CatSandwich extends Sandwich {
    CatSandwich() {
        this.bread = new Bread();
        this.lettuce = new Lettuce();
        this.tomato = new Tomato();
        this.cheese = new Cheese();
        this.onion = new Onion();
        this.patty = new Patty();
    }

    public void setIngredients(String lettuceType, String tomatoType) {
        this.lettuce.type = lettuceType;
        this.tomato.type = tomatoType;
    }
    public void setIngredients(String lettuceType, String tomatoType, String onionType) {
        this.lettuce.type = lettuceType;
        this.tomato.type = tomatoType;
        this.onion.type = onionType;
    }
    public void setIngredients(String lettuceType, String tomatoType, String onionType, String cheeseType) {
        this.lettuce.type = lettuceType;
        this.tomato.type = tomatoType;
        this.onion.type = onionType;
        this.cheese.type = cheeseType;
    }
    public void setIngredients(String lettuceType, String tomatoType, String onionType, String cheeseType, String pattyType) {
        this.lettuce.type = lettuceType;
        this.tomato.type = tomatoType;
        this.onion.type = onionType;
        this.cheese.type = cheeseType;
        this.patty.type = pattyType;
    }


}
