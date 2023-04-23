class Pal
{
	public static void main(String[] args) 
	{
		int num2=323;
		int num=323;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			//System.out.println(rev);

		}
		System.out.println(rev);
		if (num2==rev) 
		{
			System.out.println("the Number  is pal");
		}
		else
		{
			System.out.println("the Number is not pal");
		}
	} 
}