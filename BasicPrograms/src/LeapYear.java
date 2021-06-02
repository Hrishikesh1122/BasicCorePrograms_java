import java.util.Scanner;
public class LeapYear {
public static void isLeapYear(int y){
		
		if(y%4==0){
			if(y%400==0){
				System.out.println("Leap Year");
			}else if(y%100==0){
				System.out.println("Not a Leap Year");
			}else{
				System.out.println("Leap Year");
			}
		}else{
			System.out.println("Not a Leap Year");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check :");
		int year = sc.nextInt();
		if(year>999 && year<10000)
		    isLeapYear(year);
		else
			System.out.println("Invalid Year");
        sc.close();
	}

}
