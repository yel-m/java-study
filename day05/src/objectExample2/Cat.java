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
			System.out.println("��ٴٴٴ�");
			pullPowerOrNot = false;
		} else {
			System.out.println("���...��.....");
		}
	}
	
	public void eat() {
		System.out.println("�ȳȳȳȳȳȳ�");
	}
	
	public void grooming() {
		System.out.println("������������");
	}
}
