import java.util.Scanner;

class Pe_10{
public static void main(String[] args){
	String input;
	int number=0;
	System.out.println("Enter a string : ");
	Scanner sc = new Scanner(System.in);
	input = sc.next();
	System.out.println("Enter a Number : ");
	Scanner nu = new Scanner(System.in);
	number = sc.nextInt();
	for(int i=0;i<number;i++)
	{
		for(int j=0;j<number;j++)
		{
			System.out.print(input.charAt(j));
		}
	}
}
}
