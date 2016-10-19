import java.util.Scanner;
public class StringComparatorclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
		do{
		System.out.println("Enter a string1:");
		String name=keyboard.next();
		System.out.println("Enter a string2:");
		String name2=keyboard.next();
		if(name.equalsIgnoreCase(name2))
		{
			System.out.println("True");
			break;
		}
		else
		{
			System.out.println("FLAT");
		}
		}while(true);
	}
	
}