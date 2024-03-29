package publicLibrary;

public class ComicBook extends Book{
	
	// 책의 표지가 그려져 있는지?의 여부를 저장하는 변수
	Boolean bookCoverDrewOrNot;
	
	// default 생성자
	ComicBook() {
		//
		this.bookCover = new BookCover();
		this.paper = new Paper(); // 객체를 사용하기 위해서 초기화
		
		//
		this.bookCoverDrewOrNot = false;
		this.wholeBookPaperCnt = 300;
		this.bookName = "무제";
		this.authorName = "익명";
	}
	
	// 매개변수가 4개 있는 경우
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
	// 매개변수가 5개 있는 경우
	ComicBook(BookCover bookCover, Paper paper, Boolean bookCoverDrewOrNot, String bookName, String authorName){
		//
		this(bookCover, paper, bookName, authorName);
		//
		this.bookCoverDrewOrNot = bookCoverDrewOrNot;
	}

}
