import java.util.Scanner;
public class SampleCurrency {
	static float anyCurrencyToRupees(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res=amt*78.69f;
		}
		else if (country.equalsIgnoreCase("UK")) {
			res=amt*120.89f;
		}
		else if (country.equalsIgnoreCase("UAE")) {
			res=amt*265.78f;
		}
		return res;
	}
	static int getamt() {
		return 1000;
	}

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("USA UK UAE");
System.out.println("Enter the Country:");
String country=sc.next();
System.out.println("Enter amount:");
int amt=sc.nextInt();
System.out.println("THE CONVERTED AMOUNT--" +country+ "---TO INDIAN IS:"+anyCurrencyToRupees(country,amt));
	}

}
