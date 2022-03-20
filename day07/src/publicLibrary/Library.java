package publicLibrary;

public class Library {
	
	public static BookShelf comicBookShelf, historyBookShelf;
	
//	public static BookShelf historyBookShelf;
	
	public static void main(String[] args) {
		
		// 1. ��ȭå ���� ���� ����
		
		// 1-1. ��Ŀ�� �����
		BookCover comicBookCover = new BookCover();
		comicBookCover.color = "BLACK";
		comicBookCover.type = "PLASTIC";
		
		// 1-2. ���� �����
		Paper comicPaper = new Paper();
		comicPaper.type = "THIN";
		
		// 2. �巡���� ��ȭå �����
		ComicBook dragunBall = new ComicBook(comicBookCover, comicPaper, "�巡����", "������1");
		
		// 3. å�� �����
		comicBookShelf = new BookShelf(2, "BLACK");
		
		// 4. å�忡 �巡���� ��ȭå �ȾƳֱ�
		comicBookShelf.addBook(0, dragunBall);
		
		// 5. Ư�� ��ȭå(�巡����_ å ���� ����ϱ�
		comicBookShelf.printBook(dragunBall);
		
		
		///////////////////////////////////////////////
		
		// 6. ���ǽ� ��ȭå �����
		comicBookCover.color = "BLUE";
		
		ComicBook twoPiece = new ComicBook(comicBookCover, comicPaper, true, "���ǽ�", "������2");
		
		// 7. å�忡 ���ǽ� ��ȭå �ȾƳֱ�
		comicBookShelf.addBook(1, twoPiece);
		
		// 8. Ư�� ��ȭå(���ǽ�) å ���� ����ϱ�
		comicBookShelf.printBook(twoPiece);
		
		// 9. ��� å ���� ����ϱ�
		comicBookShelf.printAllBook();
		
		//////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////
		
		// 1. ����å ���� ���� ����
		BookCover historyBookCover = new BookCover();
		historyBookCover.color = "WHITE";
		historyBookCover.type = "LEATHER";
		
		Paper historyPaper = new Paper();
		historyPaper.type = "THICK";
		
		// 2. �ѱ��� ����å �����
		HistoryBook koreaHistoryBook = new HistoryBook(historyBookCover, historyPaper, "KOREA", "�ѱ��� ����", "������3");
				
		// 3. å�� ����
		historyBookShelf = new BookShelf(2); // HistoryBookShlef[0], historyBookShelf[1]
		
		// 4. å�忡 �ѱ��� ����å �ȾƳֱ�
		historyBookShelf.addBook(0, koreaHistoryBook);
		
		// 5. Ư�� ����å(�ѱ��� ����å) å���� ����ϱ�
		historyBookShelf.printBook(koreaHistoryBook);
		
		// 6. �Ϻ��� ����å �����
		historyBookCover.color = "BLACK"; // �׳� �÷� �� �� �������ְ�
		
		HistoryBook japanHistoryBook = new HistoryBook(historyBookCover, historyPaper, "JAPAN", "�Ϻ��� ����", "������ 4");
		
		// 7. å�忡 �Ϻ��� ����å �ȾƳֱ�
		historyBookShelf.addBook(1, japanHistoryBook);
		
		// 8. �Ϻ��� ����å ���� ����ϱ�
		historyBookShelf.printBook(japanHistoryBook);
		
		// 9. ��� å ���� ����ϱ�
		historyBookShelf.printAllBook();
		
	}

}
