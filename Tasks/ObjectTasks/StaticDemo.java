class StaticDemo{
	
	static int a = 7;
	static int b = 8;

	static int CallMe(int param){
		return a * b * param;
	}
}

class UseClass{
	public static void main(String[] args) {
		
		int theAnswer = 42;

		System.out.println(StaticDemo.CallMe(theAnswer));
	}
}