package arrayExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 	1. �迭 ���� �Ҵ��ϴ� ��
		// 1-1. �迭 ������ �Ҵ��ϴ� ���
		Integer []	testArray = new Integer[5];
		
		for(Integer i = 0; i < testArray.length; i++) {
			System.out.println("testArray�� �ȿ���? " + testArray[i]);
		}
		
		System.out.println("====================");
		
		// 1-2. ���� + ������ ���� �Ҵ��ϴ� ���
		Integer [] testArray2 = new Integer[] {1,2,3,4,5};
		
		for(Integer j = 0; j < testArray2.length; j++) {
			System.out.println("testArray�� �ȿ���?" + testArray2[j]);
		}
		
		System.out.println("====================");
	}

}
