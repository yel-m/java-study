package SwitchExample;

public class SelectCatColor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dyeingColor = "Pink";
		
		switch(dyeingColor) {
		case "Red" : 
			System.out.println("이 색은 싫다냥");
			break;
		case "Blue" :
			System.out.println("이 색은 싫다냥");
			break;
		case "Yellow" :
			System.out.println("나는 이 색이 마음에 든다냥, 이 색으로 하겠다냥");
			break;
		case "White" :
			System.out.println("이 색은 싫다냥");
			break;
		case "Black" : 
			System.out.println("이 색은 싫다냥");
			break;
		default :
			System.out.println("이 색은 싫다냥. 이 염색약은 없잔냥");
		break;	
		}
	}

}
