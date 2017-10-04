import java.util.Scanner;

class PE_1{
	public static void main(String[] args){
										
	int a=0;
	System.out.println("Enter a number : ");
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();									
	if((a>20)&&(a<30))
		{
			if(a%2==0)
			System.out.println("Tom");
			else
			System.out.println("jerry");
		}
	else
       System.out.println("Sorry nothing to display :(");
	}
}
