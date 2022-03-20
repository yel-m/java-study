package methodExample;

public class MethonExample2 {

	public static void caculateValue(Integer sumValue, Integer multiplyValue) {
		// 1. 첫 번째 매개변수가 sumValue => 합친 값
		// 2. 두 번째 매개변수가 multiplyValue => 곱한 값
		System.out.println("계산 결과 -> " + (sumValue * multiplyValue));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int y = 3;
		int z = x + y;
		
		caculateValue(z, 14);
		caculateValue(z, 15);
		caculateValue(z, 16);
		caculateValue(z, 17);
		caculateValue(z, 18);
		

	}

}
