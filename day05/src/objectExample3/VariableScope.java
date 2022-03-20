package objectExample3;

public class VariableScope {
	
	//클래스 영역 시작
	public Integer hiThere; //Tag1 : 멤버변수(전역변수) - 인스턴스 변수
	public static Integer hiThere2; //Tag2 : 멤버변수 - 클래스 변수
			
	public static void main(String[] args) {
		
		//메소드 영역 시작
		Integer hiThere = 0; //Tag3 - 지역 변수
		//메소드 영역 끝
		
	}
	//클래스 영역 끝

}
