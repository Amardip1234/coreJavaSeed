package Lab_manual;

public class Book {
	private String bookName;
	private int bookprice;
	private String authorName;
	
	 public Book() {
		// TODO Auto-generated constructor stub
	}
	 
	
	public Book(String bookName, int bookprice, String authorName) {
		super();
		this.bookName = bookName;
		this.bookprice = bookprice;
		this.authorName = authorName;
	}
	
	

	public void setinfo(String bookName, int bookprice, String authorName) {
		this.bookName = bookName;
		this.bookprice = bookprice;
		this.authorName = authorName;
	}


	public void getbookinfo() {	
		System.out.println("BookName: "+bookName + "  price: "+bookprice+"  author: "+authorName);
	}



	public static void main(String[] args) {
		Book b1 = new Book("asd",144,"Robert");
		
		b1.setinfo("RIch dad poor dad", 477, "kiosaki");
		b1.getbookinfo();
	}

}
