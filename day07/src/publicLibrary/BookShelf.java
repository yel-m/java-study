package publicLibrary;

public class BookShelf {
	public Book[] bookList; 
	public String color = "BLUE"; // BLUE, RED, WHITE, BLACK
	
	// 생성사 시작
	
	BookShelf() {
		bookList = new Book[10]; // Book 이라는 데이터 타입의 bookList에 10개의 공간 할당
		
		System.out.println("책의 개수가 기본 개수인 10개로 지정되었습니다.");
		System.out.println("매개변수로 책의 개수가 넘어오지 않았습니다.");
	}
	
	BookShelf(Integer bookCnt) {
		bookList = new Book[bookCnt];
		color = "BLUE";
	}
	
	BookShelf(Integer bookCnt, String color) {
		bookList = new Book[bookCnt];
		this.color = color;
	}
	
	// 생성사 끝
	
	public void addBook(Integer bookIndex, Book book) {
		// bookList ~번째 인덱스에 있는 아이를, book으로 셋팅해주겠다는 뜻입니다. 
		bookList[bookIndex] = book;
	}
	
	public void printBook(Book book) {
		System.out.print("* ");
		System.out.println(book.bookName + " 만화책 정보");
		System.out.println("책 표지 색상 : " + book.bookCover.color);
		System.out.println("책 표지 종류 : " + book.bookCover.type);
		System.out.println("종이 타입 : " + book.paper.type);
		System.out.println("작가 이름 : " + book.authorName);
		System.out.println("");
	}
	
	// 책의 모든 정보를 출력하는 메소드
	public void printAllBook() {
		System.out.println("");
		System.out.println("================책장 조회================");
		System.out.println("");
		
		for(Integer i = 0; i < bookList.length; i++) {
			System.out.println(i + "번째 책 제목 : " + bookList[i].bookName);
		}
		
		System.out.println();
		System.out.println("======================================");
		System.out.println();
	}

}
