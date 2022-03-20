package forExample;

public class OddValue {
	public static void main(String[] args) {
		
		for(Integer i = 0; i < 10; i++) {
			if(i%2==0) {
				System.out.println(i + "(은)는 짝수입니다.");
			} else {
				System.out.println(i + "(은)는 홀수입니다.");
			}
		}
	}
}
