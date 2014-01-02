public class Library{
	private Book[] Books = new Book[10];  
    private String address; 
    private int numBooks = 0; 
        
    public Library(String libAddress){
      	address = libAddress; 
   	}
        
    static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm."); 
    }
       
    void addBook(Book newBook){
     	Books[numBooks] = newBook; 
    	numBooks++;
   	}
        
    void printAvailableBooks(){
     	System.out.println("The library at " + address + " currently has these books available: "); 
    	for (int i=0; i<Books.length; i++){ 
       		if (Books[i] == null){
           		continue;
           	} else {
              	if (Books[i].isBorrowed() == false){
           			System.out.println(Books[i].getTitle()); 
               	} else {
                   	continue; 
               	}
            }
        }
    }
        
    void borrowBook(String title){
    	for (int k = 0; k < Books.length; k++){
    	    if (Books[k] == null){
    	        System.out.println("Sorry this book is not in our catalog."); 
            	break; 
        	}
       		if (Books[k].getTitle().equals(title)){
            	if (Books[k].isBorrowed() == true){
            	    System.out.println("Sorry this book is already borrowed.");
            	    break; 
           		} else {
					Books[k].Borrowed(); 
               		System.out.println("You successfully borrowed "+ title + "."); 
                 	break; 
               	}
           	}
       	}
   	}
        
	public static void main(String[] args){
  		Library firstLibrary = new Library("10 Main St."); 
       	Library secLibrary = new Library("228 Liberty Street"); 
        printOpeningHours(); 
        System.out.println(); 
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Da Vinci Code")); 
        secLibrary.addBook(new Book("The Lion King")); 
        secLibrary.addBook(new Book("A Tale of Two Cities")); 
        firstLibrary.printAvailableBooks(); 
        System.out.println(); 
        secLibrary.printAvailableBooks(); 
        System.out.println(); 
        firstLibrary.borrowBook("A Tale of Two Cities"); 
        System.out.println(); 
        firstLibrary.printAvailableBooks();
   	}
}