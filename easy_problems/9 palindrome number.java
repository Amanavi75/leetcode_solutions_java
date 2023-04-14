class Solution {
        static boolean isPalindrome(int n)
	{
		int rev = 0;

		int temp = n;
        if (n<0){
            return false;
        }
		while(temp != 0)
		{
			int ld = temp % 10;

			rev = rev * 10 + ld;

			temp = temp / 10;
		}	

		return rev==n;
	}

	public static void main (String[] args) {
		
		int number = 4553;

		System.out.println(isPalindrome(number));

	}
}
