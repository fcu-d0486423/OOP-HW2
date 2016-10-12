import java.util.Scanner;
public class CheckOddEvenclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
		System.out.println("Enter a integer:");
		int count=keyboard.nextInt();
		if(count%2==0)
		{
			System.out.println("The input integer is Even Number");
		}
		else
			System.out.println("The input integer is Odd Number");
	}

} 