import java.util.*;
class Statistics
{
  Statistics()
  {
    System.out.println("the object created");
  }

  int max(int array[])
    {
      int max=array[0];
     int  i=0;
      for(int x:array)
        {
        if(max<x)
          {
            max=x;
          }
        }
      return max;
    }

    int min(int array[])
      {
        int min=array[0];int i=0;for(int x:array){if(min>x){min=x;}}return min;
      }
  double mean(int data[])
  {
    int sum=0;
   for(int x:data)
    {
      sum=sum+x;
    }
    return sum/data.length;
  }
  double median(int data[])
  {
    int len=data.length;
    if(len%2==0)
      {
        return (data[len/2-1]*1.0+data[len/2]*1.0)/2;
      }
    return data[((len+1)/2)-1];
  }
  String mode(int data[])
  {
    int maxfreq=0,currentMax=0,maxfreqof=data[0],flag=0,multipleModeFlag=0;
    for(int x=1;x<data.length;x++)
      {
        if(data[x]==data[x-1])
          {
            currentMax+=1;
            if(maxfreq==currentMax)
              {
                multipleModeFlag=1;
              }
            if(maxfreq<currentMax)
              {
                multipleModeFlag=0;
                flag=1;
                maxfreq=currentMax;
                maxfreqof=data[x];
              }
            }
        else
          {
            currentMax=0;
          }
    }
 int min=min(data);
  int max=max(data);
    int i=0;
      int hash[]=new int[max-min+1];
      for(int x:hash)
        {
        hash[i++]=0;
        }
      for(int x:data)
          {
            hash[x-min]=hash[x-min]+1;
          }
       int freq=max(hash);
       System.out.println("the occurence of the mode in dataset is "+freq);
    if(multipleModeFlag==1)
        return "multiple mode exists";
    if(flag==0)
        return "none found";
    return Integer.toString(maxfreqof);
  }
}


class Mymain
{
  public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no of data in dataset");
      int no=sc.nextInt();
      int dataset[]=new int[no];
      int i=0;
      System.out.println("enter values in dataset ");
      for(int x:dataset)
        {
          dataset[i++]=sc.nextInt();
        }
      Arrays.sort(dataset);
      Statistics object=new Statistics();
      System.out.println("the mean of the dataset is : "+object.mean(dataset));
      System.out.println("the median of the dataset is : "+object.median(dataset));
      System.out.println("the mode of the dataset is : "+object.mode(dataset));
    }
}
