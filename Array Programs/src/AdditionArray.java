public class AdditionArray {

	public static void main(String[] args) {

		int [] a= {50,60,70,80,90,};
		int [] b= {10,20,30,40,50,};
		int [] c= new int[a.length];
		int i;

		for(i=0;i<a.length;i++)
		{
			System.out.println("Addition of two Array " + (c[i] = a[i] + b[i]));
		}
	}
}