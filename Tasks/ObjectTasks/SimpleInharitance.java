class A{
	int i, j;

	void showij(){
		System.out.println("i == " + i +" j == " + j);
	}
}

class B extends A{
	int k;

	void showk(){
		System.out.println("k == " + k);
	}

	void sum(){
		System.out.println("i+j+k == " + (i+j+k));
	}
}

class SimpleInharitance{
	public static void main(String[] args) {
		
		A superOb = new A();
		B subOb = new B();

		superOb.j = 10;
		superOb.i = 20;

		System.out.println("Contets of superOb: ");
		superOb.showij();

		subOb.j = 25;
		subOb.i = 40;

		subOb.k = 30;

		System.out.println("Contets of subOb: ");
		subOb.showk();

		System.out.println("Sum: \n");
		subOb.sum();
	}
}