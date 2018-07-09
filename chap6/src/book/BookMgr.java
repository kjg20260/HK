package book;

public class BookMgr {
	Book booklist[];// = new Book[5];
	BookMgr(Book[] b){
		this.booklist = b;
	}
	
	void printBooklist() {
		for(Book i:booklist) {
			System.out.println(i.getTitle());
		}
	}
	
	void printTotalPrice() {
		int sum = 0;
		for(Book i:booklist) {
			sum += i.getPrice();
		}
		System.out.println(sum);
	}
}
