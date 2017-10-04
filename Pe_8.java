import java.util.Scanner;

class Pe_8{
public static void main(String[] args){
	int length;
	String input;
	String output="";
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Enter a string: ");
	input = sc.next();
	length=input.length();
	int j=0;
	for(int i=length-1;i>=0;i--)
	{
		output+=input.charAt(i);
	}

	System.out.println(output);

}
}
