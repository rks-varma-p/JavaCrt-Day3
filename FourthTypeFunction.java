
public class FourthTypeFunction {
	static float anyCurrencyToRupees(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res=amt*78.69f;
		}
		else if (country.equalsIgnoreCase("UK")) {
			res=amt*120.89f;
		}
		else if (country.equalsIgnoreCase("UAE")) {
			res=amt*65.78f;
		}
		return res;
	}
	static int getamt() {
		return 1000;
	}

	public static void main(String[] args) {
		int UsaAmt=100,UkPounds=200,Uaeamt=300;
		float rupees=anyCurrencyToRupees("USA",getamt());
		System.out.println("indian rupees--->USA:"+rupees);
		rupees=anyCurrencyToRupees("Uk",UkPounds);
		System.out.println("indian rupees---->UK:"+rupees);
		rupees=anyCurrencyToRupees("UAE",Uaeamt);
		System.out.println("indian rupees---->UAE:"+rupees);

	}

}
