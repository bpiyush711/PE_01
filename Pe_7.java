import java.util.Scanner;

class Pe_7{

public static void main(String[] args){
	int input,numcheck,i,evensum=0;
	int[] descsort = new int[10];
	System.out.println("Enter a number : ");
	Scanner sc = new Scanner(System.in);
	input=sc.nextInt();
	numcheck=input;			
	while(numcheck!=0)
	{
		for(int j=0;j<10;j++)
		{
			if(numcheck%10==j)
			descsort[j]++;
		}
		numcheck/=10;
	}		
	
	System.out.println("Sorted number in non increasing order : ");
	for(i=9;i>=0;i--)
	{
		while(descsort[i]!=0)
		{
			System.out.print(i);
			if(i%2==0)
			evensum+=i;
			descsort[i]--;
		}
	}
	System.out.println("Sum of even number : "+evensum);
	if(evensum>15)
		System.out.println("True");
	else
		System.out.println("False");
}	
}	

