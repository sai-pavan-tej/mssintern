import java.util.Scanner;

public class EvenN {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int no=in.nextInt();
		
		for(int i=0;i<=no;i=i+2) {
			System.out.printf("%d ",i);
		}
	}
}
