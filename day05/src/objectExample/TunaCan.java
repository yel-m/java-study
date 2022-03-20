package objectExample;

public class TunaCan {
	
	public Boolean coverState = false;
	
	public void setCoverState(Boolean coverState) {
		// 매개변수와 객체 자신이 가지고 있는 변수의 이름이 같은 경우
		// 이를 구별하기 위해서 자신의 변수에  this를 사용합니다. 
		this.coverState = coverState;
	}
	
	public Boolean getCoverState() {
		return coverState;
	}

}
