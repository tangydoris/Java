public class BeerSong {
public static void main (String[] arts) {
    int beerNum = 99;
    String unit = "bottles";
    
    while (beerNum > 0) {
      
      if (beerNum == 1) {
        unit = "bottle";
      }
      
      System.out.println (beerNum + " " + unit + " of beer on the wall");
      System.out.println (beerNum + " " + unit + " of beer.");
      System.out.println ("Take one down.");
      System.out.println ("Pass it around.");

      beerNum--;
      
      if (beerNum > 0) {
        System.out.println (beerNum + " " + unit + " of beer on the wall\n");
      } else {
        System.out.println ("No more bottles of beer on the wall");
      }
    }
  }
}