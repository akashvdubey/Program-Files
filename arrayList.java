import java.util.*;
import java.io.*;
class Akash{
  public static ArrayList<String> multiplier(ArrayList<String> thelist)
  {
    ArrayList<String> result = new ArrayList<String>();
    for(String x:thelist){
      result.add(x);
      result.add(x);
    }
    return result;
  }
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> finalList= new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    Scanner line=new Scanner(input);
    while(line.hasNext())
      {
        list.add(line.next());
        //System.out.println(line.next());
      }
      finalList=multiplier(list);
      for(String x:finalList){
        System.out.println(x);
      }

  }
}
