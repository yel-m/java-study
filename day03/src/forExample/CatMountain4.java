package forExample;

public class CatMountain4 {

	public static void main(String[] args) {
		
		String catName = "�ҹ�";
		Integer trainingCnt = 10;
		
		for(Integer i = 0; i < trainingCnt; i++) {
			System.out.println("");
			System.out.println("������.......");
			System.out.println("");
			
			for(Integer j = 0; j < trainingCnt; j++) {
				if(j%2 == 0) {
					System.out.println(catName + " : " + j + "��° �ɳ���ġ!");
				} else {
					System.out.println(catName + " : " + j + "��° �ɳ� ������!");
				}
			}
		}
		

	}

}
