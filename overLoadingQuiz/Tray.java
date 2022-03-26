package overLoadingQuiz;

public class Tray {
    public static void main(String[] args) {
        CatSandwich catsandwich = new CatSandwich();

        System.out.println("catSandwhch ingredients : " + catsandwich.bread.type);
        System.out.println("catSandwhch ingredients : " + catsandwich.tomato.type);
        System.out.println("catSandwhch ingredients : " + catsandwich.lettuce.type);
        System.out.println("catSandwhch ingredients : " + catsandwich.cheese.type);
        System.out.println("catSandwhch ingredients : " + catsandwich.onion.type);
        System.out.println("catSandwhch ingredients : " + catsandwich.patty.type);

    }
}
