public class Book{ 
	String title; 
	boolean borrowed; 
	
	public Book(String bookTitle){ 
		title = bookTitle; 
	} // End of Book constructor. 
	
	public void Borrowed(){ 
		borrowed = true; 	
	} // End of Borrowed(). 
	
	public void Returned(){ 
		borrowed = false; 	
	} // End of Returned(). 
	
	public boolean isBorrowed(){
		// Returns true if the book is borrowed, false otherwise. 
		if (borrowed == true){
			return true; 
		} else {
			return false; 
		}
	} // End of isBorrowed(). 
	
	public String getTitle(){ 
		return title; 
	} // End of getTitle().
	
	public static void main(String[] args){
		Book example = new Book("The Da Vinci Code"); 
		System.out.println(example.getTitle()); 
		example.Borrowed(); 
		System.out.println(example.isBorrowed());
		example.Returned(); 
		System.out.println(example.isBorrowed()); 
	}
}