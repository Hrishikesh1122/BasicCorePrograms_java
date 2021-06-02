import java.util.Scanner;

public class PowerOfTwo {

	public static void printTable(int pow) {
		for (int i=0;i<=pow;i++)
		{
			System.out.println((int)Math.pow(2, i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter power of 2 ");
		int pow=sc.nextInt();
		if(pow>=0 && pow<=31)
			printTable(pow);
		else
			System.out.println("INVALID !!");
        sc.close();
	}

}
