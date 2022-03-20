package publicLibrary;

public class ComicBook extends Book{
	
	// å�� ǥ���� �׷��� �ִ���?�� ���θ� �����ϴ� ����
	Boolean bookCoverDrewOrNot;
	
	// default ������
	ComicBook() {
		//
		this.bookCover = new BookCover();
		this.paper = new Paper(); // ��ü�� ����ϱ� ���ؼ� �ʱ�ȭ
		
		//
		this.bookCoverDrewOrNot = false;
		this.wholeBookPaperCnt = 300;
		this.bookName = "����";
		this.authorName = "�͸�";
	}
	
	// �Ű������� 4�� �ִ� ���
	ComicBook(BookCover bookCover, Paper paper, String bookName, String authorName) {
		//
		this.bookCover = bookCover;
		this.paper = paper;
		//
		this.bookCoverDrewOrNot = false;
		this.wholeBookPaperCnt = 300;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	// �Ű������� 5�� �ִ� ���
	ComicBook(BookCover bookCover, Paper paper, Boolean bookCoverDrewOrNot, String bookName, String authorName){
		//
		this(bookCover, paper, bookName, authorName);
		//
		this.bookCoverDrewOrNot = bookCoverDrewOrNot;
	}

}
