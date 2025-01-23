import java.util.Scanner;
public class SecondTypeFunction {

	static void kill(char c1,int num1,char c2,int num2) {
		for(int i=1;i<=num1;i++) {
			System.out.print(c1);
		}
		System.out.println();
		for(int i=1;i<=num2;i++) {
			System.out.print(c2);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Enter the Value:");
		Scanner sc=new Scanner(System.in);
		char kill=sc.next().charAt(0);
		return kill();
		

	}

}
