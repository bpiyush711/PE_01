import java.util.Scanner;

class Pe_6{
	public static void main(String[] args)
	{
		char input;
		String input2;
		System.out.println("Enter : ");
		Scanner sc = new Scanner(System.in);
		input2 = sc.next();
		input = input2.charAt(0);
		if((input>='A') && (input<='Z'))
		System.out.println("Capital Letter");
		else if((input>='a') && (input<='z'))
		System.out.println("Small Letter");	
		else if((input>='0') && (input<='9'))
		System.out.println("Integer");
		else 
		System.out.println("Symbol");		
	}
}
