package objectExample2;

public class Cat {
	public Integer legCnt;
	public Integer tailCnt;
	public Integer eyeCnt;
	public Integer noseCnt;
	public Integer mouseCnt;
	
	public Boolean pullPowerOrNot;
	
	public void runAway() {
		if(pullPowerOrNot) {
			System.out.println("¿ì´Ù´Ù´Ù´Ù");
			pullPowerOrNot = false;
		} else {
			System.out.println("¿ì´Ù...´Ù.....");
		}
	}
	
	public void eat() {
		System.out.println("³È³È³È³È³È³È³È");
	}
	
	public void grooming() {
		System.out.println("½ºÀ¹½ºÀ¹½ºÀ¹");
	}
}
