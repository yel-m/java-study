package objectExample;

public class Street {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		TunaCan tunaCan = new TunaCan();
		
		//캔 뚜껑의 상태를 확인해봅니다.
		System.out.println(tunaCan.getCoverState());
		
		// 길을 걷다가... 캔을 발견하고는...
		cat.walk();
		
		// 캔에게 스크래치 공격을 합니다. 
		cat.scratch();
		
		// 캔뚜껑이 열립니다.
		tunaCan.setCoverState(true);
		
		// 캔 뚜껑의 상태를 다시 확인해봅니다.
		System.out.println(tunaCan.getCoverState());
		
		// 먹습니다.
		cat.eat();
		
		// 돌아갑ㄴ디ㅏ.
		cat.walk();
		
		// 돌아갑니다.
		cat.walk();
	}
}
