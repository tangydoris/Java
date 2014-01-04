import java.util.*;
import java.io.*;

public class BookList{
    private ArrayList <Book> _myList; 


    public BookList(){
	_myList = new ArrayList<Book>();
    }


    public void insertOne(Book book){
	if(_myList.size()==0){
	    _myList.add(book);
	    System.out.println("Successfully added");
	    return;
	}

	int index;
	for(index=0; index<_myList.size(); index++){
	    if(book.compareTo(_myList.get(index))<0){
		_myList.add(index,book);
		System.out.println("Successfully added");
		return;
	    }
	}

	if(index==_myList.size()){
	    _myList.add(book);
	    System.out.println("nsert successful");
	    return;
	}
    }


    public void insertMany(ArrayList<Book> second){
	for(Book x : second)
	    insertOne(x);
    }
    

    public String toString(){
	if(_myList.size() == 0)
	    return "Looks like you have an empty book list";
	else{
	    String ans = "";
	    for(int index = 0; index < _myList.size(); index++)
		ans += _myList.get(index).toString() + "\n";
	    return ans;
	}
    }
    

    public static void main(String[]args){
	BookList bl = new BookList();

	Scanner s = new Scanner(System.in);
	System.out.println("Welcome to the BookList!");

	String prompt = "Please enter one of the following:\n\tadd:  add a book to the list\n\tprint: to print the book list\n\tquit: to exit program";
	System.out.println(prompt);

	String input = s.nextLine();
	while(!input.equals("quit")){
	    if(input.equals("add")){

		System.out.print("Title: ");
		String title = s.nextLine();
		while(title.equals("")){
		    System.out.println("Not a valid title. Please try again.");
		    title = s.nextLine();
		}

		System.out.print("Author: ");
		String author = s.nextLine();
		while(author.equals("")){
		    System.out.println("Who is that? Please try again.");
		    author = s.nextLine();
		}

		System.out.print("Age range (ex. 3 10): ");
		String[] ages = s.nextLine().split("\\s+");
		while(ages[0].equals("")){
		    System.out.println("Not an age! Try again.");
		    ages = s.nextLine().split("\\s+");
		}
		while(ages.length != 2){
		    System.out.println("Enter two numbers");
		    ages = s.nextLine().split("\\s+");
		}
		int age1 = Integer.parseInt(ages[0]);
		int age2 = Integer.parseInt(ages[1]);

		Book newbook;
		if(age1 < age2)
		    newbook = new Book(title, author, age1, age2);
		else
		    newbook = new Book(title, author, age2, age1);
		bl.insertOne(newbook);
	    }
	    
	    else if(input.equals("print")){
		System.out.println("Printing book list...");
		System.out.println(bl);
	    }

	    else
		System.out.println("Sorry, what was that? Try again!");

	    System.out.println("\n"+prompt);
	    input = s.nextLine();
	}
     
	System.out.println("Thanks for stopping by!");
	return;
    }


}      
