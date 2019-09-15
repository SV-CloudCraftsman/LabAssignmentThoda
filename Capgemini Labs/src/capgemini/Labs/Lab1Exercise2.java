package capgemini.Labs;

public class Lab1Exercise2 {
	
	int calculateDifference(int n)
	{
		int sq=0,sum=0,totsq=0;
		for (int i = 1; i <= n; i++) {
			sq+=i*i;
		}
		
		for (int i = 1; i <=n; i++) {
			sum+=i;	
		}
		
		totsq=sq-(sum*sum);
		return totsq;
	}
	
	
	
	public static void main(String[] args) {
		Lab1Exercise2 obj=new Lab1Exercise2();
		System.out.println(obj.calculateDifference(5));
		
	}

}
