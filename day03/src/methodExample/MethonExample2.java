package methodExample;

public class MethonExample2 {

	public static void caculateValue(Integer sumValue, Integer multiplyValue) {
		// 1. ù ��° �Ű������� sumValue => ��ģ ��
		// 2. �� ��° �Ű������� multiplyValue => ���� ��
		System.out.println("��� ��� -> " + (sumValue * multiplyValue));
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
