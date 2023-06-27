public class Main
{
	public static void main(String[] args) {
	    
	int  n=7;
    int nsp=-1;
    int nst1=(n/2)+1;
    int nst2=n/2;
    int row=0;
    while(row<n)
    {
        //space 
        for(int i=0;i<nst1;i++)
        {
            System.out.print("*");
        }
        for(int i=0;i<nsp;i++)
        {
            System.out.print(" ");
        }
        for(int i=0;i<nst2;i++)
        {
            System.out.print("*");
        }
        if(row==n-1)
            nst2--;
        if(row<n/2)
        {
            nst1--;
            if(row!=0)
            
            nst2--;
            nsp+=2;
            
        }
        else{
             nst1++;
            nst2++;
            nsp-=2;
        }
        row++;
        System.out.println();
    }
    
	    
	}
}
