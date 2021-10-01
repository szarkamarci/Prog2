class Box{

	private double width;
	private double height;
	private double depth;

	Box(Box ob){
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}

	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		System.out.println("Box constructor");
	}

	Box(){
		width = -1;
		height = -1;
		depth = -1;
		System.out.println("Box() constructor");
	}
	
	Box(double len){
		width= height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}

	void setDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;

	}

	void setDim(double len)
	{
		width=height=depth=len;
	}

}

class BoxWeight extends Box{
	double weight;


	BoxWeight(BoxWeight ob){
		super(ob);
		weight=ob.weight;
	}

	BoxWeight(double w, double d, double h, double m){
		super(w, h, d);
		weight = m;
		System.out.println("BoxWeight constructor");
	}

	BoxWeight(){
		weight = -1;
		System.out.println("BoxWeight() constructor");
	}

	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}
}

class Shipment extends BoxWeight {
	double cost;

	Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}

	Shipment(){
		cost = -1;
		System.out.println("Shipment() constructor");
	}

	Shipment(double w, double d, double h, double m, double c){
		super(w, h, d, m);
		cost = c;
		System.out.println("Shipment constructor");
	}
}


class BoxDemo{

	public static void main(String[] args) {
		
		Shipment ship1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment ship2 = new Shipment(10, 20, 30, 40, 42);

		double vol;

		vol = ship1.volume();

		System.out.println("Ship 1 vol: " + vol);
		System.out.println("Ship 1 weight " + ship1.weight);
		System.out.println("Ship 1 cost " + ship1.cost);
		
		vol = ship2.volume();

		System.out.println("Ship 2 vol: " + vol);
		System.out.println("Ship 2 weight " + ship2.weight);
		System.out.println("Ship 2 cost " + ship2.cost);
				
	}
}