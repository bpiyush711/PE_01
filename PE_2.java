import java.util.Scanner;

class PE_2{
	public static void main(String[] args){
	int n;
	System.out.println("Enter a number : ");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<i;j++)
			System.out.print(i);		
	}
}
}
