package objectExample;

public class Street {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		TunaCan tunaCan = new TunaCan();
		
		//ĵ �Ѳ��� ���¸� Ȯ���غ��ϴ�.
		System.out.println(tunaCan.getCoverState());
		
		// ���� �ȴٰ�... ĵ�� �߰��ϰ��...
		cat.walk();
		
		// ĵ���� ��ũ��ġ ������ �մϴ�. 
		cat.scratch();
		
		// ĵ�Ѳ��� �����ϴ�.
		tunaCan.setCoverState(true);
		
		// ĵ �Ѳ��� ���¸� �ٽ� Ȯ���غ��ϴ�.
		System.out.println(tunaCan.getCoverState());
		
		// �Խ��ϴ�.
		cat.eat();
		
		// ���ư�����.
		cat.walk();
		
		// ���ư��ϴ�.
		cat.walk();
	}
}
