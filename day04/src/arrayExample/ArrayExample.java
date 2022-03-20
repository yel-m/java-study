package arrayExample;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		
		Integer [] cats = new Integer[5]    ;
		
		// [] + 0 -> [0] -> cats만 붙인다면... cats[0]
		cats[0] = 1;
		
		cats[1] = 33;
		
		cats[2] = 6;
		
		cats[3] = 7;
		
		cats[4] = 5;
		
		//Error
		for (Integer i = 0; i <= cats.length - 1; i++) {
			System.out.println(i + "번째는 ..." + cats[i] + "입니다.");
			
			
		}
		
		System.out.println(Arrays.toString(cats));
	} 
}
