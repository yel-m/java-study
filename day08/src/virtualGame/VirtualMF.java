package virtualGame;

public class VirtualMF {
	// monster�� �̸�(���ڿ�)�� ���� list�� �����մϴ�.
	public String[] monsterList;
	
	VirtualMF() {}
	
	VirtualMF(String[] monsterList) {
		this.monsterList = monsterList;
	}
	
	public void printMonsterInfo(Integer index) {
		System.out.print("* ");
		System.out.println(monsterList[index] + "�� ȹ���Ͽ����ϴ�!");
	}
	
	
 
}
