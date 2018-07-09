package book;

public class Book {
	private String title;
	private int price;
	
	Book(){
		title = null;
		price = 0;
	}
	Book(String str, int i){
		title = str;
		price = i;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
