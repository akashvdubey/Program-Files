import java.util.*;
public class Akash
{
public static void main(String akash[])
    {
      int[] arr = new int[10];
      int n;
      Scanner S=new Scanner(System.in);
      System.out.println("enter the no of elements");
      n=S.nextInt();
      System.out.println("enter the dataset");
      for(int i=0;i<n;i++)

          arr[i]=S.nextInt();
      System.out.println("mean is"+findMean(arr, n));
      System.out.println("median is"+findMedian(arr, n));
    }
    public static double findMean(int arr[],int n)
     {
       int sum=0;
       for(int i=0;i<n;i++)
          sum+=arr[i];
      return (double)(sum)/(double)(n);
     }

     public static double findMedian(int arre[],int n)
     {
       Arrays.sort( arre );
       if(n%2!=0)
       return (double)arre[(n+1)/2];
       return (arre[(n/2)+1]+arre[n/2])/2.0;
     }
}
