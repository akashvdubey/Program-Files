import java.io.*;
import java.util.*;
class Except{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    try{
      if(true)
      throw new NullPointerException();
      int x = 0;
      int y=10/x;

      System.out.println(y);
    }
    catch(NullPointerException e){
      System.out.println(e);
    }
    catch(ArithmeticException e){
      System.out.println("IGotYou");
    }
    System.out.println("IWillBeExecutedNoMatterWhatYouDo");
  }
}
