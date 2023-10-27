package miniproject2;

public class Admin {
	private String AddBook;
	private String generatereport;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddBook() {
		return AddBook;
	}

	public void setAddBook(String addBook) {
		this.AddBook = addBook;
	}

	public String getGeneratereport() {
		return generatereport;
	}

	public void setGeneratereport(String generatereport) {
		this.generatereport = generatereport;
	}

	@Override
	public String toString() {
		return "Admin [AddBook=" + AddBook + ", generatereport=" + generatereport + ", getAddBook()=" + getAddBook()
				+ ", getGeneratereport()=" + getGeneratereport() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}


	