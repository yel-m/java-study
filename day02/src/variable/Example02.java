package variable;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;
		int tmp=0;
		
		System.out.println("x:"+x+"y:"+y);
		
		tmp =x;
		x=y;
		y=tmp;
		
		System.out.println("x:"+x+"y:"+y);
		
		String cheeseCatName ="�ҹ�";
		System.out.println(cheeseCatName);
		
		String cheeseCatCnt="31";
		String blackCatCnt="22";
		
		System.out.println(cheeseCatCnt+blackCatCnt);
	}

}
