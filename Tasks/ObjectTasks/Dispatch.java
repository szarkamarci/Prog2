class A{
	void callme(){
		System.out.println("This is A's call me");
	}
}

class B extends A{
	void callme(){
		System.out.println("This is B's call me");
	}
}

class C extends B{
	void callme(){
		System.out.println("This is C's call me");
	}
}

class Dispatch{
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();

		A r;
		r = a;
		r.callme();

		r = b;
		r.callme();

		r = c;
		r.callme();

	}
}