package forExample;

public class CatMountain4 {

	public static void main(String[] args) {
		
		String catName = "소미";
		Integer trainingCnt = 10;
		
		for(Integer i = 0; i < trainingCnt; i++) {
			System.out.println("");
			System.out.println("수련중.......");
			System.out.println("");
			
			for(Integer j = 0; j < trainingCnt; j++) {
				if(j%2 == 0) {
					System.out.println(catName + " : " + j + "번째 냥냥펀치!");
				} else {
					System.out.println(catName + " : " + j + "번째 냥냥 발차기!");
				}
			}
		}
		

	}

}
