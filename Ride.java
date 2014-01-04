/*
ID:
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

public class Ride{
 
    public static int changeLetToInt(String letter){
	String[] letters= {"A","B","C","D","E","F","G","H","I","J","K"
			   ,"L","M","N","O","P","Q","R","S","T","U","V"
			   ,"W","X","Y","Z"};
	int index = 1;
	while(index<letters.length){
	    if(letters[index].equals(letter)){
		break;
	    }
	    index++;
	}
	return index;
    }

    public static int multiply(String word){
	int index = 0;
	int product = 1;
	while(index<word.length()){
	    product *= changeLetToInt(word.substring(index,index+1));
	}
	return product;
    }

    public static String answer(String line1, String line2){
	if((multiply(line1))%47 == (multiply(line2))%47)
	    return "GO";
	else
	    return "STAY";
    }

    public static void main(String[]args) throws IOException{
	BufferedReader f = new BufferedReader(new FileReader("ride.in"));
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	String lineA=f.readLine();
	String lineB=f.readLine();
	out.println(answer(lineA,lineB));
	out.close();
	System.exit(0);

    }


}
