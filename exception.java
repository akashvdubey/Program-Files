import java.io.*;
import java.util.*;
class FileReader
{
  public static void main(String args[]) throws IOException
  {
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    String x= new String();
      while(sc.hasNextLine()){
        x=sc.nextLine();
        System.out.println(x);
      }
  }
}
