public class Book implements Comparable{

    private String _title;  // title of book
    private String _author; // author of book
    private int _lowAge;     // lowest recommended age
    private int _highAge;    // highest recommended age

    public Book (String title, String author, int lowAge, int highAge){
	_title = title;
	_author = author;
	_lowAge = lowAge;
	_highAge = highAge;
    }


    public int compareTo(Object rhs){
	if((_lowAge<(((Book)rhs)._lowAge)) ||
	   ((_lowAge==(((Book)rhs)._lowAge))&&(_highAge<(((Book)rhs)._highAge)))){
	    return -1;
	}
	if((_lowAge==(((Book)rhs)._lowAge)) && (_highAge==(((Book)rhs)._highAge))){
	    return 0;
	}
	else
	    return 1;
    }

    public String toString(){
	return (_title+" by "+_author+" for ages "+ _lowAge+"-"+_highAge);
    }

    public static void main(String[]args){
	Book a = new Book("Abc","Alphabet",21,87);
	Book b = new Book("Twilight","Stephanie Meyer",5,18);
	Book c = new Book("My Good Life","Doris Tang",5,18);
	System.out.println("a) " + a);
	System.out.println("b) " + b);
	System.out.println("c) " + c);
	System.out.println("a compareTo b "+a.compareTo(b));
	System.out.println("b compareTo a "+b.compareTo(a));
	System.out.println("b compareTo c "+b.compareTo(c));
    }

}
