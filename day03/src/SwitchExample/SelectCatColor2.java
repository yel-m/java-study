package SwitchExample;

public class SelectCatColor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dyeingColor = "Pink";
		
		switch(dyeingColor) {
		case "Red" : 
			System.out.println("�� ���� �ȴٳ�");
			break;
		case "Blue" :
			System.out.println("�� ���� �ȴٳ�");
			break;
		case "Yellow" :
			System.out.println("���� �� ���� ������ ��ٳ�, �� ������ �ϰڴٳ�");
			break;
		case "White" :
			System.out.println("�� ���� �ȴٳ�");
			break;
		case "Black" : 
			System.out.println("�� ���� �ȴٳ�");
			break;
		default :
			System.out.println("�� ���� �ȴٳ�. �� �������� ���ܳ�");
		break;	
		}
	}

}
