import java.util.Scanner;

class Pe_3{

	public static void main(String[] args){
	
	int length;
    char c;
	String a = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any word : ");
	a = sc.next();
	length = a.length();
	for(int i=0;i<length;i++)
	{
		c = a.charAt(i);
		
		if((c>'a' && c<'z')||(c>'A' && c<'Z'))
		{
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println(c+" is a vowel");
		break;
		default :
		System.out.println(c+" is a consonent");
		}
		}
		else
		System.out.println("error: "+ c +" is not a character");
	}
}
}
