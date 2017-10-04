import java.util.Scanner;

class Pe_4{
	public static void main(String[] args){
		int n;
		boolean info;		
		System.out.println("Enter a number : ");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		info=ispallindrome(n);
		if(info==true)
		{
		System.out.println("The number is pallindrome");
		int sumeven = sumofpallindrome(n);
		if(sumeven>25)
		System.out.println("The sum of even numbers is greater than 25");
		else
		System.out.println("The sum of even numbers is less than 25");		
		}
		else
		System.out.println("The number is not pallindrome");
	}

	public static boolean ispallindrome(int n)
	{
		int rev=0;
		int n2=n;
		while(n2!=0)
		{
			rev=rev*10;
			rev+=(n2%10);
			n2/=10;
							
		}
		
		return rev==n;
	}

	public static int sumofpallindrome(int n)
	{
		int sumeven=0;
		int n2=n;
		int n3=n;
		while(n2!=0)
		{
			n3=n2%10;			
			if(n3%2==0)
			sumeven+=n3;
			n2/=10;
			
		}
		return sumeven;
	}

}	
