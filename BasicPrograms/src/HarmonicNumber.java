import java.util.Scanner;
public class HarmonicNumber {
	public static double printHarmonic(int n){
		double sum =0;
		if(n>0){
			for(double i=1;i<=n;i++){
				sum+=(1/i);
			}
		}else{
			System.out.println("INVALID INPUT");
		}
		return sum;
		
		
	}
public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = sc.nextInt();
	System.out.println(printHarmonic(n));
	sc.close();
}
}
