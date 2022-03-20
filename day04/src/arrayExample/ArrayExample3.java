package arrayExample;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer sum = 0;
		Integer [] score = {100, 90, 99, 80, 88};
		
		for(Integer i = 0; i < score.length; i++ ) {
			sum += score[i];
			
		}
		
		System.out.println("총점은 " + sum + " 점입니다.");
 
	}

}
