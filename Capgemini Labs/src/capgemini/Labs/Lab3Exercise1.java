package capgemini.Labs;

public class Lab3Exercise1 { 
	
	int getSecondSmallest(int a[])
	{
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	
	public static void main(String[] args) {
		
		Lab3Exercise1 obj=new Lab3Exercise1();
		int a[]={8,2,4,8,9};
		System.out.println(obj.getSecondSmallest(a));
	}
}
