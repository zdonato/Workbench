public class Library{
	String[] catalog = new String[1];  
	String address; 
	
	public Library(String libAddress){
		address = libAddress; 
	}
	
	static void printOpeningHours(){
		System.out.println("Libraries are open daily from 9am to 5pm."); 
	}
	
	void addBook(Book newBook){
		String[] newTitle = {newBook.title}; 
		catalog[0] = newTitle[0]; 
	}
	
	void printAvailableBooks(){
		for (int i=0; i<catalog.length; i++){ 
			System.out.println(catalog[i]); 
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