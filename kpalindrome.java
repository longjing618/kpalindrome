public class kpalindrome {
	public static void main(String[] args)
	{
		char[] Arr = {'a','b','f','c','q','c','b','a'};
		int count = 0;
		int head = 0;
		int tail = Arr.length-1;
		palindrome(Arr, head, tail, count);
		
		/*
		int[] t = {100};
		System.out.println(t[0]);
		test(t);
		System.out.println(t[0]);
		*/
	}
/*	
	private static void test(int[] i)
	{
		i[0]=0;
	}
	*/
	
	private static void palindrome(char[] Arr, int head, int tail, int count)
	{
		if(head >= tail)
			if(count > 2)
			{
				//System.out.print("no");
				return;
				//System.exit(0);
			}
			else
			{
				System.out.print("Yes");
				return;
			}
		
		if(Arr[head] == Arr[tail])
		{
			head++;
			tail--;
			palindrome(Arr, head, tail, count);
		}
		
		else
		{
			count++;
			head++;
			palindrome(Arr, head, tail, count);
			
			head--;
			tail--;
			palindrome(Arr, head, tail, count);
		}
		
	}
}
