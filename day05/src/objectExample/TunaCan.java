package objectExample;

public class TunaCan {
	
	public Boolean coverState = false;
	
	public void setCoverState(Boolean coverState) {
		// �Ű������� ��ü �ڽ��� ������ �ִ� ������ �̸��� ���� ���
		// �̸� �����ϱ� ���ؼ� �ڽ��� ������  this�� ����մϴ�. 
		this.coverState = coverState;
	}
	
	public Boolean getCoverState() {
		return coverState;
	}

}
