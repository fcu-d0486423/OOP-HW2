import java.util.Scanner;
public class KeyboardScannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
		System.out.println("Enter a integer:");
		int count=keyboard.nextInt();
		System.out.println("Enter a float point number");
		float num=keyboard.nextFloat();
		System.out.println("Enter your name");
		String name=keyboard.next();
		System.out.printf("Hi %s,the multiplication of %d and %f is %.2e",name,count,num,count*num);
	}

}
