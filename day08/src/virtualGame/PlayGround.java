package virtualGame;

public class PlayGround {
	
	public static String CAT_NAME = "���ʵ�";

	public static void main(String[] args) {
		
		String[] ownMonsterList = {"���� �����", "����", "�˰�����"};
		
		VirtualMF virtualMF = new VirtualMF(ownMonsterList);
		
		for (Integer i = 0; i < ownMonsterList.length; i++) {
			virtualMF.printMonsterInfo(i);
			
			if(i == 0) {
				System.out.println("  " + CAT_NAME + " : " + "�ƽ�~ ���� ����̸� �����~");
			} 
			
		}
		

	}

}
