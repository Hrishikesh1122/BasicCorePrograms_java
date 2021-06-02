import java.util.Scanner;

public class FlipCoin {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of times to flip");
	int num=sc.nextInt();
	int head=0,tail=0;
	for (int i=0;i<num;i++)
	{
		double ran=Math.random();
		if (ran < 0.5)
			tail++;
		else
			head++;				
	}
	int headPer = (head*100)/num;
	int tailPer = (tail*100)/num;
	System.out.println("Heads occured "+head+" times, tails occured "+tail+" times");
	System.out.println("% Heads: "+headPer+"\n% Tails: "+tailPer);
	sc.close();
}
}
