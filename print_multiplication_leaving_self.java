// print multiplication by leaving itself in array;
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	//	int arr[]= new int[4];
		int arr[]={1,2,3,4};
	   int left[]=new int[arr.length];
       int right[]=new int[arr.length];
       int op[]=new int[arr.length];
        int p=1;
        left[0]=p;
        for(int i=1;i<arr.length;i++)
        {
             p=p*arr[i-1];
            left[i]=p;
           
        }
        p=1;
        right[arr.length-1]=p;
        for(int i =arr.length-2;i >=0;i--)
        {
            p=p*arr[i+1];
            right[i]=p;
            
        }
	
	for(int i=0;i<arr.length;i++)
	{
	    op[i]=left[i]*right[i];
	}
        //   System.out.println(Arrays.toString(left));
        //   System.out.println(Arrays.toString(right));
          System.out.println(Arrays.toString(op));
        
	}
}
