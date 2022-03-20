package publicLibrary;

public class Library {
	
	public static BookShelf comicBookShelf, historyBookShelf;
	
//	public static BookShelf historyBookShelf;
	
	public static void main(String[] args) {
		
		// 1. 만화책 관련 로직 시작
		
		// 1-1. 북커버 만들기
		BookCover comicBookCover = new BookCover();
		comicBookCover.color = "BLACK";
		comicBookCover.type = "PLASTIC";
		
		// 1-2. 종이 만들기
		Paper comicPaper = new Paper();
		comicPaper.type = "THIN";
		
		// 2. 드래군볼 만화책 만들기
		ComicBook dragunBall = new ComicBook(comicBookCover, comicPaper, "드래군볼", "개발자1");
		
		// 3. 책장 만들기
		comicBookShelf = new BookShelf(2, "BLACK");
		
		// 4. 책장에 드래군볼 만화책 꽂아넣기
		comicBookShelf.addBook(0, dragunBall);
		
		// 5. 특정 만화책(드래군볼_ 책 정보 출력하기
		comicBookShelf.printBook(dragunBall);
		
		
		///////////////////////////////////////////////
		
		// 6. 투피스 만화책 만들기
		comicBookCover.color = "BLUE";
		
		ComicBook twoPiece = new ComicBook(comicBookCover, comicPaper, true, "투피스", "개발자2");
		
		// 7. 책장에 투피스 만화책 꽂아넣기
		comicBookShelf.addBook(1, twoPiece);
		
		// 8. 특정 만화책(투피스) 책 정보 출력하기
		comicBookShelf.printBook(twoPiece);
		
		// 9. 모든 책 정보 출력하기
		comicBookShelf.printAllBook();
		
		//////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		
		// 1. 역사책 관련 로직 시작
		BookCover historyBookCover = new BookCover();
		historyBookCover.color = "WHITE";
		historyBookCover.type = "LEATHER";
		
		Paper historyPaper = new Paper();
		historyPaper.type = "THICK";
		
		// 2. 한국의 역사책 만들기
		HistoryBook koreaHistoryBook = new HistoryBook(historyBookCover, historyPaper, "KOREA", "한국의 역사", "개발자3");
				
		// 3. 책장 제작
		historyBookShelf = new BookShelf(2); // HistoryBookShlef[0], historyBookShelf[1]
		
		// 4. 책장에 한국의 역사책 꽂아넣기
		historyBookShelf.addBook(0, koreaHistoryBook);
		
		// 5. 특정 역사책(한국의 역사책) 책정보 출력하기
		historyBookShelf.printBook(koreaHistoryBook);
		
		// 6. 일본의 역사책 만들기
		historyBookCover.color = "BLACK"; // 그냥 컬러 한 번 변경해주고
		
		HistoryBook japanHistoryBook = new HistoryBook(historyBookCover, historyPaper, "JAPAN", "일본의 역사", "개발자 4");
		
		// 7. 책장에 일본의 역사책 꽂아넣기
		historyBookShelf.addBook(1, japanHistoryBook);
		
		// 8. 일본의 역사책 정보 출력하기
		historyBookShelf.printBook(japanHistoryBook);
		
		// 9. 모든 책 정보 출력하기
		historyBookShelf.printAllBook();
		
	}

}
