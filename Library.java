public class Library{
	private String[] catalog = new String[100];  
	private String address; 
	private int counter = 0; 
	
	public Library(String libAddress){
		address = libAddress; 
	}
	
	static void printOpeningHours(){
		System.out.println("Libraries are open daily from 9am to 5pm."); 
	}
	
	void addBook(Book newBook){
		String[] newTitle = {newBook.getTitle()}; 
		catalog[counter] = newTitle[0]; 
		counter++; 
	}
	
	void printAvailableBooks(){
		for (int i=0; i<catalog.length; i++){ 
			if (catalog[i] == null){
				break; 
			} else {
			System.out.println(catalog[i]); 
			}
		}
	}
	
	public static void main(String[] args){
		Library firstLibrary = new Library("10 Main St."); 
		Library secLibrary = new Library("228 Liberty Street"); 
		printOpeningHours(); 
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.printAvailableBooks();
	}
}