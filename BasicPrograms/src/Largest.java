import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int max=0;
		if(num1>num2 && num1>num3)
			max=num1;
		else if (num2>num3 && num2>num1)
			max=num2;
		else
			max=num3;
		
		System.out.println("Maximum :"+max);
		sc.close();

	}

}
