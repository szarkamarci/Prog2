class ForTest{
	public static void main(String[] args) {
		
		int x;

		//for(x = 0; x <10 ; x++)
			//System.out.println("Value x is: " + x);

		int nums[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int sum = 0;

		for(int num: nums)
		{
			System.out.println("Number: " + num);
			sum+= num;
		}

		System.out.println("Sum is: " + sum);
		System.out.println("Nums length is: " + nums.length);
	}
}