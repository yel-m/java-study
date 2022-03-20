package forExample;

public class Rhombus {
	public static void main(String[] args) {
        

        for (int i = 0; i < 5; i++) {
            for (int j = (5-1); j > i; j--) {
                System.out.print(" ");
            }
            for(int s = 0;s < (i * 2 + 1); s++) {
                    System.out.print("*");
                }
            System.out.println();
            }
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int s = (i * 2 - 3); s > 0; s-- ) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
