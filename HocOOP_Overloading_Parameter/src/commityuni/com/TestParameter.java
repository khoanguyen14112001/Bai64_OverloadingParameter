package commityuni.com;

public class TestParameter {

	public static int sum (int ...arr)
	{
		int s = 0;
		for (int i =0; i<arr.length;i++)
		{
			s+=arr[i];
		}
		return s;
	}
	
	public static void main (String [] args)
	{
		int s = sum(1,2,3,4,5,6,7);
		System.out.println(s);
		int s2 = sum(1,2,3,4,5);
		System.out.println(s2);
		int s3 = sum(1,2,6,7);
		System.out.println(s3);
	}

}
