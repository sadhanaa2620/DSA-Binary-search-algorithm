import java.util.Arrays;
import java.util.Scanner;

public class Main{
   
    static int  binary_search(int arr[],int tar,int b,int e){
        if(b<e){
            int mid = b+(e-b)/2;
            if(arr[mid]==tar)
                return mid;
            if(arr[mid]<tar)
                return binary_search(arr,tar,mid+1,e);
            return binary_search(arr,tar,b,mid-1);
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        int arr[] = new int[a];
       
        for(int i=0;i<a;i++){
            arr[i]=sa.nextInt();
        }
        int tar = sa.nextInt();
        int index = binary_search(arr,tar,0,arr.length-1);
      int sat = index+1;
 
      if(index== -1)
        System.out.println("Not found");
      else
        System.out.println(tar +" found at location "+ sat+".");
     
    }
}