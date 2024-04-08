package primenumber;
public class Main
{
	public static void main(String[] args) 
	{
	    int num=5;
	    int count=0;
	    if(num>1)
	    {
	        for(int i=1;i<=num;i++)
	        {
	            count++;
	        }
	    }
	    if(count==2)
	    {
	        System.out.println(num+" is a prime Number");
	    }
	    else{
	        System.out.println(num+" is Not a prime number");
	    }
		
	}
}
