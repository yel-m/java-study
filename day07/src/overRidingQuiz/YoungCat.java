package overRidingQuiz;

public class YoungCat extends Cat {

	
	@Override
	public void walk() {
		System.out.println("�лл�");
	}

	@Override
	public void run() {
		System.out.println("�ѹ��ѹ�");
	}

	@Override
	public Integer getChurCntFromPocket() {
		return 4;
	}

}
